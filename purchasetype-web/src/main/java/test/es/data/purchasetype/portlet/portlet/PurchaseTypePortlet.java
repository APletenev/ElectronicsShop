package test.es.data.purchasetype.portlet.portlet;

import test.es.data.purchasetype.portlet.constants.PurchaseTypePortletKeys;

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

import test.es.data.purchasetype.portlet.portlet.PurchaseTypePortlet;
import test.es.data.model.PurchaseType;
import test.es.data.service.PurchaseTypeLocalService;
/**
 * @author plete
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PurchaseType",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PurchaseTypePortletKeys.PURCHASETYPE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PurchaseTypePortlet extends MVCPortlet {

	@Reference
	private PurchaseTypeLocalService _purchaseTypeLocalService;

	public void addEntry(ActionRequest request, ActionResponse response) throws PortalException {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(PurchaseType.class.getName(), request);

		String purchaseTypeName = ParamUtil.getString(request, "purchaseTypeName");
		long entryId = ParamUtil.getLong(request, "purchaseTypeId");

		if (entryId > 0) {
			try {
				_purchaseTypeLocalService.updatePurchaseType(serviceContext.getUserId(), entryId, purchaseTypeName,
						serviceContext);

			} catch (Exception e) {
				System.out.println(e);

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath", "purchasetype/edit_entry.jsp");
			}

		} else {

			try {
				_purchaseTypeLocalService.addPurchaseType(serviceContext.getUserId(), purchaseTypeName, serviceContext);

			} catch (Exception e) {
				System.out.println(e);

				PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath", "/purchasetype/edit_entry.jsp");
			}
		}
	}

	public void deleteEntry(ActionRequest request, ActionResponse response) throws PortalException {

		long entryId = ParamUtil.getLong(request, "purchaseTypeId");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(PurchaseType.class.getName(), request);

		try {

			_purchaseTypeLocalService.deletePurchaseType(entryId);
		}

		catch (Exception e) {
			Logger.getLogger(PurchaseTypePortlet.class.getName()).log(Level.SEVERE, null, e);
		}
	}


}
