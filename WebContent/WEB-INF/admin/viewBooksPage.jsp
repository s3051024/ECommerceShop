<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>查詢檢視書籍</title>
</head>
<body>
<%
   session = request.getSession(false);
   if(session.getAttribute("AdminName")==null){
	   response.sendRedirect("adminLogin.action");
   }
%>
<h2 style="text-align: center;">ECommerceShop</h2><br>

<jsp:include page="header.jsp"></jsp:include>

<h3>查詢書籍表單</h3>


<s:form action = "queryByBookName">

   <s:textfield name = "bookName" label = "輸入書籍名稱"/>
     <s:submit value = "送出"/>
     
</s:form>
<p></p>

<s:form action = "queryByBookType">

    <s:select list="{'Java','Scala','Groovy','JRuby','Spring framework','Seam framework','Play! framework','Tomcat','WebLogic','JBOSS','WebShpere'}" label = "請選擇書籍種類" name = "bookType"/>
	<s:submit value = "送出"/>
</s:form>


<p></p>

  <display:table  id = "books" name = "books" pagesize = "5" export = "false" requestURI = "viewBooks">
  
  	<display:column  property = "bookType" title = "書籍類別"  sortable="true"/>
  	<display:column property = "bookName" title = "書名" sortable="true"  paramId="id"  paramProperty="id" url = "/admin/viewBookDetail.action"/>
    <display:column  property = "author" title = "作者" sortable="true"/>
    <display:column property = "bookPress"  title = "出版社" sortable="true"/>
    <display:column property = "language" title = "語言" sortable="true"/>
    <display:column property = "bookName" title = "刪除" sortable="true"  paramId="id"  paramProperty="id" url = "/admin/deleteBookById.action"/>
    <display:column property = "bookName" title = "更新書籍" sortable="true"  paramId="id"  paramProperty="id" url = "/admin/updateBookInfo.action"/>
    <display:setProperty name="paging.banner.placement" value="bottom" />
  
  </display:table>

</body>
</html>