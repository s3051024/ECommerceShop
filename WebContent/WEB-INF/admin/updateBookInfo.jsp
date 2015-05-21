<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8"  import = "com.model.Book,com.service.BookServiceImpl"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>更新書籍資訊</title>
</head>
<body>
<h2 style="text-align: center;">ECommerceShop</h2>
      <br />
<%
   session = request.getSession(false);
   if(session.getAttribute("AdminName")==null){
	   response.sendRedirect("adminLogin.action");
   }
%>
<jsp:include page="header.jsp"></jsp:include>


<h3>更新書籍資訊</h3>

<s:form action = "updateBookInfoForm"  method="POST" enctype="multipart/form-data">
    
	<s:textfield name = "bookNumber" label = "書籍編號" value = "%{#session.book.bookNumber}"/>
	<s:textfield name = "isbn" label = " ISBN" value = "%{#session.book.isbn}"/>
	<s:textfield name = "bookName" label = "書籍名稱" value = "%{#session.book.bookName}"/>
	<s:textfield name = "author" label = "作者" value = "%{#session.book.author}"/>
	<s:textfield name = "bookPress" label = "出版社" value = "%{#session.book.bookPress}"/>
	<s:textfield name = "language" label = "語言" value = "%{#session.book.language}"/>
	<s:textfield name = "price" label = "價格" value = "%{#session.book.price}"/>
	<s:textfield  name = "pages" label = "頁數" value = "%{#session.book.pages}"/>
	<s:textarea name = "bookDiscription" label = "書籍介紹" value = "%{#session.book.bookDiscription}"/>
	<s:file name = "bookImageFile" label = "上傳書籍封面" />
	<s:textfield name = "bookAmount" label = "書籍存貨" value = "%{#session.book.bookAmount}"/>
	<s:textfield name = "bookSales" label = "銷售量" value = "%{#session.book.bookSales}"/>
	<s:submit value = "送出"/>



</s:form>



</body>
</html>