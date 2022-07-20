package test.es.data.electrotype.portlet.portlet;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import test.es.data.electrotype.portlet.constants.ElectroTypePortletKeys;
import test.es.data.model.ElectroType;
import test.es.data.service.ElectroTypeLocalService;

/**
 * @author plete
 */
@Component(
	immediate = true, 
	property = { 
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css", 
		"com.liferay.portlet.instanceable=false",
		"com.liferay.portlet.scopeable=true", 
		"javax.portlet.display-name=ElectroType",
		"javax.portlet.expiration-cache=0", 
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/electrotype/view.jsp",
		"javax.portlet.name=" + ElectroTypePortletKeys.ELECTROTYPE, 
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supports.mime-type=text/html" 
	}, 
	service = Portlet.class)

public class ElectroTypePortlet extends MVCPortlet {
	@Reference
	private ElectroTypeLocalService _electroTypeLocalService;

	public void addEntry(ActionRequest request, ActionResponse response) throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(ElectroType.class.getName(), request);

		String electroTypeName = ParamUtil.getString(request, "electroTypeName");
		long entryId = ParamUtil.getLong(request, "electroTypeId");

		if (entryId > 0) {
			try {
				_electroTypeLocalService.updateElectroType(serviceContext.getUserId(), entryId, electroTypeName,
						serviceContext);

			} catch (Exception e) {
				System.out.println(e);

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath", "electrotype/edit_entry.jsp");
			}

		} else {

			try {
				_electroTypeLocalService.addElectroType(serviceContext.getUserId(), electroTypeName, serviceContext);

			} catch (Exception e) {
				System.out.println(e);

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath", "/electrotype/edit_entry.jsp");
			}
		}
	}

	public void deleteEntry(ActionRequest request, ActionResponse response) throws PortalException {

		long entryId = ParamUtil.getLong(request, "electroTypeId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(ElectroType.class.getName(), request);

		try {

			_electroTypeLocalService.deleteElectroType(entryId);
		}

		catch (Exception e) {
			Logger.getLogger(ElectroTypePortlet.class.getName()).log(Level.SEVERE, null, e);
		}
	}

}