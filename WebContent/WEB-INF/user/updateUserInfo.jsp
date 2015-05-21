<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>更新使用者資訊</title>
</head>
<body>
<% 
   session = request.getSession(false);
   if(session.getAttribute("user")==null ){
	   response.sendRedirect("userLogin.action");
   }

%>


<jsp:include page="header.jsp"/>
<h3>使用者資訊</h3>


<s:form action = "updateUserInfoForm">

<s:textfield name = "userRealName" label = "會員真實姓名"  value = "%{#session.user.userRealName}"/>       
<s:textfield name = "address" label = "地址" value = "%{#session.user.address}"/>     
<s:textfield name = "email" label = "電子信箱" value = "%{#session.user.email}"/>    
<s:textfield name = "phone" label = "電話" value = "%{#session.user.phone}"/>
<s:textfield name = "mobilePhone" label = "手機" value = "%{#session.user.mobilePhone}"/>

<s:submit value = "更新"/>
</s:form>





</body>
</html>