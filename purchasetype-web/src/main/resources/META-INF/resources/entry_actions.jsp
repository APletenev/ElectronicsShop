<%@ include file="/init.jsp"%>

        <%
        String mvcPath = ParamUtil.getString(request, "mvcPath");
        ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
        PurchaseType entry = (PurchaseType)row.getObject(); 
        %>

        <liferay-ui:icon-menu>

                <portlet:renderURL var="editURL">
                    <portlet:param name="purchaseTypeId"
                        value="<%= String.valueOf(entry.getPurchaseTypeId()) %>" />
                    <portlet:param name="mvcPath" value="/edit_entry.jsp" />
                </portlet:renderURL>

                <liferay-ui:icon image="edit" message="Edit"
                    url="<%=editURL.toString() %>" />

                <portlet:actionURL name="deleteEntry" var="deleteURL">
                    <portlet:param name="purchaseTypeId"
                        value="<%= String.valueOf(entry.getPurchaseTypeId()) %>" />
                    
                </portlet:actionURL>

                <liferay-ui:icon-delete url="<%=deleteURL.toString() %>" />

        </liferay-ui:icon-menu>