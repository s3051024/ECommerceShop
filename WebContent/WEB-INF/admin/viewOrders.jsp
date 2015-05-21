<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>檢視所有訂單</title>
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
<table border="1" style="width: 938px; height: 30px;">
      <tbody>
        <tr>
          <th style="width: 342px;">訂單編號 </th>
          <th style="margin-left: -464px;">下單時間 </th>
          <th>總金額 </th>
          <th>訂單狀態 </th>
        </tr>
    
        <s:iterator value = "#session.orders" status = "listorders">
         <tr>
         
          <td>
            <s:url action="adminViewOrderDetail.action" var="URLtag">
   				<s:param name="id"><s:property value = "id"/></s:param>   
 			 </s:url>

 			 <s:a href="%{URLtag}" ><s:property value = "id" /></s:a>
          </td>
          
          
          <td><s:date name="orderTime" />
          </td>
          
          
          <td><s:property value = "totalPrice"/>
          
          </td>
          
          <td> 
              <s:if test='%{isDealed =="0"}'>
					
			 	<s:url action="adminProcessOrders.action" var="URLtag">
   					<s:param name="id"><s:property value = "id"/></s:param>   
 			 	</s:url>

 			 	<s:a href="%{URLtag}" ><font style="color: green;">未處理</font></s:a>
 			 			
			  </s:if>
			  <s:else>
					<font style="color: red;">已處理</font>
			 </s:else>
          	   
          </td>
                  
        </tr>
        </s:iterator>

      </tbody>
    </table>
    <p><br />
    </p>

</body>
</html>