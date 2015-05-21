<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>書籍詳細資訊</title>
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

<h3>書籍詳細資料</h3>

<img align = "right" src=<s:property value = "imgPath"/>>
<table  align = "center" cellpadding="5" cellspacing="15">
  <tr>
    <td>書籍名稱</td>
    <td><s:property value = "book.bookName"/></td>
  </tr>
  <tr>
    <td>書籍類別</td>
    <td><s:property value = "book.bookType"/></td>
  </tr>
  <tr>
    <td>作者</td>
    <td><s:property value = "book.author"/></td>
  </tr>
  <tr>
    <td>出版社</td>
    <td><s:property value = "book.bookPress"/></td>
  </tr>
  <tr>
    <td>出版日期</td>
    <td><s:property value = "book.publishDate"/></td>
  </tr>
  <tr>
    <td>語言</td>
    <td><s:property value = "book.language"/></td>
  </tr>
  <tr>
    <td>價格</td>
    <td><s:property value = "book.price"/></td>
  </tr>
  <tr>
    <td>頁數</td>
    <td><s:property value = "book.pages"/></td>
  </tr>
  <tr>
    <td>簡介</td>
    <td><s:property value = "book.bookDiscription"/></td>
  </tr>
</table>

  
 

</body>
</html>