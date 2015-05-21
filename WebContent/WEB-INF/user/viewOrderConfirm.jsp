<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>確認訂單</title>
</head>
<body>
<% 
   session = request.getSession(false);
   if(session.getAttribute("user")==null ){
	   response.sendRedirect("userLogin.action");
   }

%>




<jsp:include page="header.jsp"/>


<h3>訂單資料</h3>
 <table border="1" style="width: 938px; height: 30px;">
      <tbody>
        <tr>
          <th style="width: 699px;">書籍名稱
          </th>
          <th style="margin-left: -3px;">單價
          </th>
          <th>數量
          </th>
         
        </tr>
    
        <s:iterator value = "#session.selectbooks" status = "listbook">
         <tr>
         
          <td><s:property value = "bookName" />
          </td>
          
          
          <td><s:property value = "price" />
          </td>
          
          <td><s:property value = "bookAmount"/>          	   
          </td>
                  
        </tr>
        </s:iterator>

      </tbody>
    </table>
購物總金額為:<s:property value = "#session.totalPrice"/>


<h3>收件人資料</h3>

<p></p>
    <table width="60%" border="1">
      <tbody>
        <tr>
          <th>寄件人姓名 </th>
          <th>住家電話 </th>
          <th>行動電話 </th>
          <th>住家住址 </th>
          <th>電子信箱 </th>
        </tr>
        <tr>
          <td><s:property value = "#session.user.userRealName"/>
          </td>
          <td><s:property value  = "#session.user.phone"/>
          </td>
          <td><s:property value = "#session.user.mobilePhone"/>
          </td>
          <td><s:property value = "#session.user.address"/>
          </td>
          <td><s:property value = "#session.user.email"/>
          </td>
        </tr>
      </tbody>
    </table>
    <p><br />
    </p>

 <s:a href = "processOrder.action">回到訂單編輯</s:a>  <s:a href = "addOrder.action">確認無誤結帳</s:a>

</body>
</html>