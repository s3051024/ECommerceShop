<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>購物明細</title>
</head>
<body>
<% 
   session = request.getSession(false);
   if(session.getAttribute("user")==null ){
	   response.sendRedirect("userLogin.action");
   }

%>


<jsp:include page="header.jsp"/>

<p></p>
<br>
<br>
  <table border="1" style="width: 938px; height: 30px;">
      <tbody>
        <tr>
          <th style="width: 699px;">書籍名稱
          </th>
          <th style="margin-left: -3px;">單價
          </th>
          <th>數量
          </th>
          <th>動作
          </th>
        </tr>
    
        <s:iterator value = "#session.selectbooks" status = "listbook">
         <tr>
         
          <td><s:property value = "bookName" />
          </td>
          
          
          <td><s:property value = "price" />
          </td>
          
          <td> 
              
				<input type="text" id="bookAmount<s:property value="Id"/>" value='<s:property value="bookAmount"/>' maxlength="2" size="2"/>
				<input type="button" value="修改" onclick="updateBookAmount('<s:property value="Id"/>')">
          	   
          </td>
                  
          <td>
             
             <s:url action="cancelOder.action" var="URLtag">
   				<s:param name="Id"><s:property value = "Id"/></s:param>   
 			 </s:url>

 			 <s:a href="%{URLtag}" >取消</s:a>
              
          
          </td>
        </tr>
        </s:iterator>

      </tbody>
    </table>
    <p><br />
    </p>
購物總金額為:<s:property value = "#session.totalPrice"/>

<br>
<br>
<s:a href = "userViewBooks.action">繼續購物</s:a>                   <s:a href = "processOrder.action">進行結帳</s:a>


</body>

<SCRIPT type="text/javascript">
<!--
	function updateBookAmount(Id){
		var pattern = /^[1-9][0-9]{0,}$/;
		var bookAmount = document.getElementById("bookAmount"+Id).value;
		if(pattern.test(bookAmount)){
			location.href = "updateBookQuantity.action?Id="+Id+"&bookAmount="+bookAmount;
		}
	}
	
//-->
</SCRIPT>

</html>