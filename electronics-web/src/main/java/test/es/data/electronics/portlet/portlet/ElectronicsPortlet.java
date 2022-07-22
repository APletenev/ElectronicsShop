package test.es.data.electronics.portlet.portlet;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import test.es.data.electronics.portlet.constants.ElectronicsPortletKeys;
import test.es.data.model.ElectroType;
import test.es.data.model.Electronics;
import test.es.data.service.ElectroTypeLocalService;
import test.es.data.service.ElectronicsLocalService;

/**
 * @author plete
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Electronics",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ElectronicsPortletKeys.ELECTRONICS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ElectronicsPortlet extends MVCPortlet {

	@Reference
	private ElectronicsLocalService _electronicsLocalService;

	@Reference
	private ElectroTypeLocalService _electroTypeLocalService;
	
	public void addEntry(ActionRequest request, ActionResponse response) throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Electronics.class.getName(), request);

		long electronicsId = ParamUtil.getLong(request, "electronicsId");
		String electronicsName = ParamUtil.getString(request, "electronicsName");
		long electroTypeId = ParamUtil.getLong(request, "electroTypeId");
		long electronicsPrice = ParamUtil.getLong(request, "electronicsPrice");
		int electronicsCount = ParamUtil.getInteger(request, "electronicsCount");
		boolean electronicsInStock = ParamUtil.getBoolean(request, "electronicsInStock");
		boolean electronicsArchive = ParamUtil.getBoolean(request, "electronicsArchive");
		String electronicsDescription = ParamUtil.getString(request, "electronicsDescription");
		

		if (electronicsId > 0) {
			try {
				_electronicsLocalService.updateElectronics(serviceContext.getUserId(), electronicsId, electronicsName, electroTypeId, electronicsPrice, electronicsCount, electronicsInStock, electronicsArchive, electronicsDescription, serviceContext);

			} catch (Exception e) {
				System.out.println(e);

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath", "/electronics/edit_entry.jsp");
			}

		} else {

			try {
				_electronicsLocalService.addElectronics(serviceContext.getUserId(), electronicsName, electroTypeId, electronicsPrice, electronicsCount, electronicsInStock, electronicsArchive, electronicsDescription, serviceContext);

			} catch (Exception e) {
				System.out.println(e);

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath", "/electronics/edit_entry.jsp");
			}
		}
	}

	public void deleteEntry(ActionRequest request, ActionResponse response) throws PortalException {

		long entryId = ParamUtil.getLong(request, "electronicsId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Electronics.class.getName(), request);

		try {

			_electronicsLocalService.deleteElectronics(entryId);
		}

		catch (Exception e) {
			Logger.getLogger(ElectronicsPortlet.class.getName()).log(Level.SEVERE, null, e);
		}
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	    throws IOException, PortletException {

	    try {
	        ServiceContext serviceContext = ServiceContextFactory.getInstance(
	            ElectroType.class.getName(), renderRequest);

	        long groupId = serviceContext.getScopeGroupId();

	        long electroTypeId = ParamUtil.getLong(renderRequest, "electroTypeId");

	        List<ElectroType> electroTypes = _electroTypeLocalService.getElectroTypes(
	            groupId);

	        if (electroTypes.isEmpty()) {
	            ElectroType electroType = _electroTypeLocalService.addElectroType(
	                serviceContext.getUserId(), "none", serviceContext);

	            electroTypeId = electroType.getElectroTypeId();
	        }

	        if (electroTypeId == 0) {
	            electroTypeId = electroTypes.get(0).getElectroTypeId();
	        }

	        renderRequest.setAttribute("electroTypeId", electroTypeId);
	    }
	    catch (Exception e) {
	        throw new PortletException(e);
	    }

	    super.render(renderRequest, renderResponse);
	} 	
	
	@Override
	protected void doDispatch(RenderRequest request, RenderResponse response) throws IOException, PortletException {
		try {
	        ServiceContext serviceContext = ServiceContextFactory.getInstance(
	            ElectroType.class.getName(), request);

	        long groupId = serviceContext.getScopeGroupId();
		
		request.setAttribute("listElectroTypes", _electroTypeLocalService.getElectroTypes(serviceContext.getScopeGroupId()));
		}
		catch (Exception e) {
	        throw new PortletException(e);
	    }
	    super.doDispatch(request, response);
	}

}