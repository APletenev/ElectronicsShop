<%@ include file="/init.jsp" %>


<% 


long entryId = ParamUtil.getLong(renderRequest, "electronicsId");

Electronics entry = null;
if (entryId > 0) { //Editing
  entry = ElectronicsLocalServiceUtil.getElectronics(entryId);
}

%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL" />

<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">

<aui:model-context bean="<%= entry %>" model="<%= Electronics.class %>" />

	<aui:fieldset>

		<aui:input name="electronicsName"  label="Name" >
		<aui:validator name="required" > </aui:validator>
		</aui:input>
		
		<aui:input name="electronicsPrice"  label="Price" >
		<aui:validator name="required" /> 
		<aui:validator name="number" />
		<aui:validator name="min">1</aui:validator>
		</aui:input>
		<aui:input name="electronicsCount"  label="Count" >
		<aui:validator name="required" />
		<aui:validator name="number" />
		<aui:validator name="min">0</aui:validator> 
		</aui:input>
		<aui:input name="electronicsInStock"  label="InStock" >
		
		</aui:input>
		<aui:input name="electronicsArchive"  label="Archive" >
		
		</aui:input>
		<aui:input name="electronicsDescription"  label="Description" >
		<aui:validator name="required" > </aui:validator>
		</aui:input>
        
		<aui:input name="electronicsId" type="hidden" />

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>

	</aui:button-row>
</aui:form>



