<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>登入</title>
</head>
<body>
<h3 align = "center">使用者登入</h3>
<a href = "/ECommerceShop/index.jsp" align = "left">回到首頁</a>
<br>
<br>
<br>
<center>
<s:form action = "userLoginAction">

    <s:textfield name = "name" label = "名稱"/>
    <s:password name = "password" label = "密碼"/>
    <s:submit value = "確定"/>

</s:form>



</center>

</body>
</html>