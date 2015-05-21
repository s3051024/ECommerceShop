<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
	if(session.getAttribute("userName")!=null){
%>
	<h5 align="right">hello! 貴賓 <%=session.getAttribute("userName")%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h5>
<%		
	}
%>

<h2 style="text-align: center;">ECommerceShop</h2>
      <br />

<s:a href = "UserMainPage.action">回到主頁面</s:a>
<s:a href = "userViewBooks.action">瀏覽書籍</s:a>
<s:a href = "userQueryAllOrder.action">檢視訂單記錄</s:a>
<s:a href = "updateUserInfo.action">更新使用者資訊</s:a>
<s:a href = "userLogout.action">登出</s:a>