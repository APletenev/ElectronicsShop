<%@ include file="/init.jsp" %>

<aui:button-row cssClass="purchasetype-buttons">

<portlet:renderURL var="addEntryURL">
	<portlet:param name="mvcPath" value="/edit_entry.jsp"></portlet:param>
</portlet:renderURL>

	<aui:button onClick="<%= addEntryURL.toString() %>"
		value="Add"></aui:button>
</aui:button-row>

<liferay-ui:search-container total="<%=PurchaseTypeLocalServiceUtil.getPurchaseTypesCount()%>">
<liferay-ui:search-container-results
    results="<%=PurchaseTypeLocalServiceUtil.getPurchaseTypes(scopeGroupId.longValue(),
                    searchContainer.getStart(),
                    searchContainer.getEnd())%>" />

<liferay-ui:search-container-row
    className="PurchaseType" modelVar="entry">

    <liferay-ui:search-container-column-text property="purchaseTypeName" name="Purchase type" />

    
    <liferay-ui:search-container-column-jsp
        align="right" 
        path="/entry_actions.jsp" />

</liferay-ui:search-container-row>

<liferay-ui:search-iterator />

</liferay-ui:search-container>