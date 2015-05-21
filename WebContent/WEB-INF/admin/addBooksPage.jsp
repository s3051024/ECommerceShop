<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>新增書籍</title>
</head>
<h2 style="text-align: center;">ECommerceShop</h2><br>

<%
   session = request.getSession(false);
   if(session.getAttribute("AdminName")==null){
	   response.sendRedirect("adminLogin.action");
   }
%>

<jsp:include page="header.jsp"></jsp:include>


<h3>新增書籍表單</h3>

<s:form action = "addBooks"   method="POST" enctype="multipart/form-data">

	<s:textfield name = "bookNumber" label = "書籍編號"/>
	<s:textfield name = "isbn" label = " ISBN"/>
	<s:textfield name = "bookName" label = "書籍名稱"/>
	<s:select  name = "bookType" list="{'Java','Scala','Groovy','JRuby','Spring framework','Seam framework','Play! framework','Tomcat','WebLogic','JBOSS','WebShpere'}" label = "請選擇書籍種類" />
	<s:textfield name = "author" label = "作者"/>
	<s:textfield name = "bookPress" label = "出版社"/>
	<s:textfield name = "language" label = "語言"/>
	<s:textfield name = "price" label = "價格"/>
	<s:textfield  name = "pages" label = "頁數"/>
	<s:textarea name = "bookDiscription" label = "書籍介紹"/>
	<s:file name = "bookImageFile" label = "上傳書籍封面"/>
	<s:textfield name = "bookAmount" label = "書籍存貨"/>
	<s:textfield name = "bookSales" label = "銷售量"/>
	<s:submit value = "送出"/>



</s:form>






</head>
<body>

</body>
</html>