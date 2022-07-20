<%@ include file="/init.jsp" %>


<% 


long entryId = ParamUtil.getLong(renderRequest, "positionTypeId");

PositionType entry = null;
if (entryId > 0) { //Editing
  entry = PositionTypeLocalServiceUtil.getPositionType(entryId);
}

%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL" />

<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">

<aui:model-context bean="<%= entry %>" model="<%= PositionType.class %>" />

	<aui:fieldset>

		<aui:input name="positionTypeName"  label="Position" >
		<aui:validator name="required" > </aui:validator>
		</aui:input>
        
		<aui:input name="positionTypeId" type="hidden" />

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>

	</aui:button-row>
</aui:form>



