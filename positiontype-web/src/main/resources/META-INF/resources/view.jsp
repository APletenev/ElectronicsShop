<%@ include file="/init.jsp"%>

<aui:button-row cssClass="positiontype-buttons">

<portlet:renderURL var="addEntryURL">
	<portlet:param name="mvcPath" value="/edit_entry.jsp"></portlet:param>
</portlet:renderURL>

	<aui:button onClick="<%= addEntryURL.toString() %>"
		value="Add"></aui:button>
</aui:button-row>

<liferay-ui:search-container total="<%=PositionTypeLocalServiceUtil.getPositionTypesCount()%>">
<liferay-ui:search-container-results
    results="<%=PositionTypeLocalServiceUtil.getPositionTypes(scopeGroupId.longValue(),
                    searchContainer.getStart(),
                    searchContainer.getEnd())%>" />

<liferay-ui:search-container-row
    className="PositionType" modelVar="entry">

    <liferay-ui:search-container-column-text property="positionTypeName" name="Positions" />

    
    <liferay-ui:search-container-column-jsp
        align="right" 
        path="/entry_actions.jsp" />

</liferay-ui:search-container-row>

<liferay-ui:search-iterator />

</liferay-ui:search-container>