<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>瀏覽書籍</title>
</head>
<body>
<% 
   session = request.getSession(false);
   if(session.getAttribute("user")==null ){
	   response.sendRedirect("userLogin.action");
   }

%>


<jsp:include page="header.jsp"/>

<s:form action = "userQueryByBookName">

   <s:textfield name = "bookName" label = "輸入書籍名稱"/>
     <s:submit value = "送出"/>
     
</s:form>
<p></p>

<s:form action = "userQueryByBookType">

    <s:select list="{'Java','Scala','Groovy','JRuby','Spring framework','Seam framework','Play! framework','Tomcat','WebLogic','JBOSS','WebShpere'}" label = "請選擇書籍種類" name = "bookType" headerKey="-1" headerValue="---請選擇 ---"/>
	<s:submit value = "送出"/>
</s:form>


<h3>書籍</h3>


<display:table  id = "books" name = "books" pagesize = "5" export = "false" requestURI = "userViewBooks">
  
  	<display:column  property = "bookType" title = "書籍類別"  sortable="true"/>
  	<display:column property = "bookName" title = "書名" sortable="true"  paramId="id"  paramProperty="id" url = "/user/userViewBooksDetail.action"/>
    <display:column  property = "author" title = "作者" sortable="true"/>
    <display:column property = "bookPress"  title = "出版社" sortable="true"/>
    <display:column property = "language" title = "語言" sortable="true"/>
    
    <display:setProperty name="paging.banner.placement" value="bottom" />
  
  </display:table>






</body>
</html>