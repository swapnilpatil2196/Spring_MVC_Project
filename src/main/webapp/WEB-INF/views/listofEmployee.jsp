<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="menu.jsp" />

</head>

<body>

<%
String msg1 = (String)request.getAttribute("msg1");
if(msg1!=null){
%>
<script type="text/javascript">
alert("${msg1}")
</script>
<%
}
%>

<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">EMPID</th>
      <th scope="col">USERNAME</th>
            
      <% String type = (String)session.getAttribute("type");
         if(type.equals("ADMIN")){
       %> 	 
            <th scope="col">PASSWORD</th>

      <%     
         }
      %>      
      
      <th scope="col">DEPARTMENT</th>
      <th scope="col">SALARY</th>
      <th scope="col">TYPE</th>
      <th scope="col">STATUS</th>
      
      
      <%  type = (String)session.getAttribute("type");
         if(type.equals("ADMIN")){
       %> 	 
      <th scope="col">QUESTION</th>
      <th scope="col">ANSWER</th>
      <th scope="col">ACTION</th>
      <%     
         }
      %>
      
    </tr>
  </thead>
  <c:forEach items="${employees}" var="emp">
  <tbody>
    <tr>
      <th scope="row"><c:out value="${emp.empid}"></c:out></th>
      <th scope="row"><c:out value="${emp.username}"></c:out></th>
      
     <%  type = (String)session.getAttribute("type");
         if(type.equals("ADMIN")){
       %> 	 
      <th scope="row"><c:out value="${emp.password}"></c:out></th>
      <%     
         }
      %>
      
      <th scope="row"><c:out value="${emp.department}"></c:out></th>
      <th scope="row"><c:out value="${emp.salary}"></c:out></th>
      <th scope="row"><c:out value="${emp.type}"></c:out></th>
      <th scope="row"><c:out value="${emp.status}"></c:out></th>
      
      <%  type = (String)session.getAttribute("type");
         if(type.equals("ADMIN")){
       %> 	 
      <th scope="row"><c:out value="${emp.question}"></c:out></th>
      <th scope="row"><c:out value="${emp.answer}"></c:out></th>
      <th scope="row"> 
 <a href="profile?un=${emp.username}" title="Go to profile page of ${emp.username} "> <button type="button"  class="btn btn-success btn-sm">UPDATE</button> </a>          <br> <br>
         <a href="deleteEmp?empid=${emp.empid}"> <button type="button" class="btn btn-danger btn-sm">DELETE</button> </a>
       
      </th>      

      <%     
         }
      %>      
          
    </tr>
  </tbody>
  </c:forEach>
</table>


</body>

</html>