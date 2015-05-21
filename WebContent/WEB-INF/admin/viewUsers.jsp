<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>檢視所有使用者</title>
</head>
<body>
<%
   session = request.getSession(false);
   if(session.getAttribute("AdminName")==null){
	   response.sendRedirect("adminLogin.action");
   }
%>
<h2 style="text-align: center;">ECommerceShop</h2>
      <br />
<jsp:include page="header.jsp"></jsp:include>
<br>
<br>
<br>
<br>
<h3>使用者清單</h3>

 <p></p>
    <table width="60%" border="1">
      <tbody>
        <tr>
          <th>id
          </th>
          <th>使用者id
          </th>
          <th>使用者姓名
          </th>
          <th>密碼
          </th>
          <th>地址
          </th>
          <th>電話
          </th>
          <th>手機
          </th>
          <th>email
          </th>
        </tr>
        <s:iterator  value = "#session.users" status = "listuser">
         <tr>
          <td><s:property value = "id"/>
          </td>
          <td><s:property value = "name"/>
          </td>
          <td><s:property value = "userRealName"/>
          </td>
          <td><s:property value = "password"/>
          </td>
          <td><s:property value = "address"/>
          </td>
          <td><s:property value = "phone"/>
          </td>
          <td><s:property value = "mobilePhone"/>
          </td>
          <td><s:property value = "email"/>
          </td>
        </tr>
        </s:iterator>
      </tbody>
    </table>
    <p><br />
    </p>



</body>
</html>