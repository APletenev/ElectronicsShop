package test.es.data.positiontype.portlet.portlet;

import test.es.data.positiontype.portlet.constants.PositionTypePortletKeys;

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

import test.es.data.positiontype.portlet.portlet.PositionTypePortlet;
import test.es.data.model.PositionType;
import test.es.data.service.PositionTypeLocalService;


/**
 * @author plete
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PositionType",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PositionTypePortletKeys.POSITIONTYPE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PositionTypePortlet extends MVCPortlet {
	
	@Reference
	private PositionTypeLocalService _positionTypeLocalService;

	public void addEntry(ActionRequest request, ActionResponse response) throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(PositionType.class.getName(), request);

		String positionTypeName = ParamUtil.getString(request, "positionTypeName");
		long entryId = ParamUtil.getLong(request, "positionTypeId");

		if (entryId > 0) {
			try {
				_positionTypeLocalService.updatePositionType(serviceContext.getUserId(), entryId, positionTypeName,
						serviceContext);

			} catch (Exception e) {
				System.out.println(e);

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath", "positiontype/edit_entry.jsp");
			}

		} else {

			try {
				_positionTypeLocalService.addPositionType(serviceContext.getUserId(), positionTypeName, serviceContext);

			} catch (Exception e) {
				System.out.println(e);

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath", "/positiontype/edit_entry.jsp");
			}
		}
	}

	public void deleteEntry(ActionRequest request, ActionResponse response) throws PortalException {

		long entryId = ParamUtil.getLong(request, "positionTypeId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(PositionType.class.getName(), request);

		try {

			_positionTypeLocalService.deletePositionType(entryId);
		}

		catch (Exception e) {
			Logger.getLogger(PositionTypePortlet.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
}