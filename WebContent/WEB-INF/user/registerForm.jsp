<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>註冊會員</title>
</head>
<body>
<h3 align = "center">會員註冊表單</h3>
<a href = "/ECommerceShop/index.jsp">回到首頁</a>
<br>
<br>
<br>
<center>
<s:form action = "registerAction">

<s:textfield name = "user.name" label = "會員名稱"></s:textfield>
<s:textfield name = "user.userRealName" label = "會員真實姓名"></s:textfield>
<s:password  name = "user.password" label = "密碼"></s:password>         
<s:textfield name = "user.address" label = "地址"></s:textfield>     
<s:textfield name = "user.email" label = "電子信箱"></s:textfield>    
<s:textfield name = "user.phone" label = "電話"></s:textfield>
<s:textfield name = "user.mobilePhone" label = "手機"></s:textfield>     
<s:submit value = "確定"></s:submit>
</s:form>
</center>

</body>
</html>