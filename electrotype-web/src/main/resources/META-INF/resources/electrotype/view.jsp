<%@ include file="../init.jsp"%>



<aui:button-row cssClass="electrotype-buttons">

<portlet:renderURL var="addEntryURL">
	<portlet:param name="mvcPath" value="/electrotype/edit_entry.jsp"></portlet:param>
</portlet:renderURL>

	<aui:button onClick="<%= addEntryURL.toString() %>"
		value="Add"></aui:button>
</aui:button-row>

<liferay-ui:search-container total="<%=ElectroTypeLocalServiceUtil.getElectroTypesCount()%>">
<liferay-ui:search-container-results
    results="<%=ElectroTypeLocalServiceUtil.getElectroTypes(scopeGroupId.longValue(),
                    searchContainer.getStart(),
                    searchContainer.getEnd())%>" />

<liferay-ui:search-container-row
    className="ElectroType" modelVar="entry">

    <liferay-ui:search-container-column-text property="electroTypeName" />

    
    <liferay-ui:search-container-column-jsp
        align="right" 
        path="/electrotype/entry_actions.jsp" />

</liferay-ui:search-container-row>

<liferay-ui:search-iterator />

</liferay-ui:search-container>