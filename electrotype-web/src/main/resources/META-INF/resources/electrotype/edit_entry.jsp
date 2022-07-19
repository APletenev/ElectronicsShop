<%@ include file="../init.jsp" %>


<% 


long entryId = ParamUtil.getLong(renderRequest, "electroTypeId");

ElectroType entry = null;
if (entryId > 0) { //Editing
  entry = ElectroTypeLocalServiceUtil.getElectroType(entryId);
}

%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/electrotype/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL" />

<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">

<aui:model-context bean="<%= entry %>" model="<%= ElectroType.class %>" />

	<aui:fieldset>

		<aui:input name="electroTypeName"  label="Electronics type" >
		<aui:validator name="required" > </aui:validator>
		</aui:input>
        
		<aui:input name="electroTypeId" type="hidden" />

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>

	</aui:button-row>
</aui:form>



