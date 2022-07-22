<%@ include file="/init.jsp" %>


<% 


long entryId = ParamUtil.getLong(renderRequest, "electronicsId");

Electronics entry = null;
long etId = 0; //Will trigger exception in case of bug in form validation
String etName = "";
if (entryId > 0) { //Editing
  entry = ElectronicsLocalServiceUtil.getElectronics(entryId);
  etId = entry.getElectroTypeId();
  ElectroType et = ElectroTypeLocalServiceUtil.getElectroType(etId);
  etName = et.getElectroTypeName();
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
		
		<aui:select name="electroTypeId" id="electroTypeId">
		<aui:option value="<%= etId %>" selected="true"><%= etName %></aui:option>
		<c:forEach var="electroType" items="${listElectroTypes}">
    	<aui:option value="${electroType.getElectroTypeId()}">${electroType.getElectroTypeName()}</aui:option>
		</c:forEach>
		<aui:validator name="required" />
		<aui:validator name="minLength">2</aui:validator>
		</aui:select>
		
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



