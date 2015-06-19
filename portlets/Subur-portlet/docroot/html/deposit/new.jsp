<%@ include file="/html/item.jsp" %>
<%
	String itemId = renderRequest.getParameter("itemId");
	

	List<ItemType> itemTypes = ItemTypeLocalServiceUtil.getItemTypes(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

%>
<portlet:actionURL name="newItem" var="depositItemURL"/>
<aui:form method="post" action="<%=depositItemURL%>" name="fm">
<aui:select size="5" multiple="<%=true %>" label="item-type" name="itemType" onchange='<%= renderResponse.getNamespace() + "itemType();" %>'>

	
	<%for (ItemType itemType: itemTypes) 
	{
	%>
		<aui:option value="<%= itemType.getItemTypeId() %>">
			<%=itemType.getItemTypeName() %>
		</aui:option>
	<%
	}
	%>
</aui:select>

<aui:input type="text" name="title"></aui:input>
<aui:input name="itemAbstract"></aui:input>

<div class="control-group">
	<aui:input type="text" name="otherTitle"></aui:input>
</div>
<aui:button name="submitBtn" type="submit" value="cancel" last="true" />
</aui:form>