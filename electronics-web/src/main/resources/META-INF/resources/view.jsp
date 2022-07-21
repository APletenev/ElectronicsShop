<%@ include file="/init.jsp"%>


<%
long ElectroTypeId = Long.valueOf((Long) renderRequest
        .getAttribute("electroTypeId"));
%>

<aui:button-row cssClass="electronics-buttons">

<portlet:renderURL var="addEntryURL">
	<portlet:param name="mvcPath" value="/edit_entry.jsp"></portlet:param>
</portlet:renderURL>

	<aui:button onClick="<%= addEntryURL.toString() %>"
		value="Add"></aui:button>
</aui:button-row>

<liferay-ui:search-container total="<%=ElectronicsLocalServiceUtil.getElectronicsesCount()%>">
<liferay-ui:search-container-results
    results="<%=ElectronicsLocalServiceUtil.getElectronicss(scopeGroupId.longValue(), 
                    searchContainer.getStart(),
                    searchContainer.getEnd())%>" />

<liferay-ui:search-container-row
    className="Electronics" modelVar="entry">

    <liferay-ui:search-container-column-text property="electronicsName" name="Name" />
    
	<liferay-ui:search-container-column-text property="electronicsPrice" name="Price" />
	<liferay-ui:search-container-column-text property="electronicsCount" name="Count" />
	<liferay-ui:search-container-column-text property="electronicsInStock" name="InStock" />
	<liferay-ui:search-container-column-text property="electronicsArchive" name="Archive" />
	<liferay-ui:search-container-column-text property="electronicsDescription" name="Description" />
    
    <liferay-ui:search-container-column-jsp
        align="right" 
        path="/entry_actions.jsp" />

</liferay-ui:search-container-row>

<liferay-ui:search-iterator />

</liferay-ui:search-container>