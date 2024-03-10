<jsp:include page="prevent.jsp"></jsp:include>
<html>
<head>
<title></title>
</head>

<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home.jsp">HOME PAGE <span class="sr-only">(current)</span></a>
      </li>
      
      <% String type = (String)session.getAttribute("type");
         if(type.equals("ADMIN")){
       %> 	 
             <li class="nav-item">
             <a class="nav-link" href="addEmployeePage">Add Employee</a>
           </li>
      <%     
         }
      %>
      <li class="nav-item">
        <a class="nav-link" href="listofEmployee?msg1=null">List of Employee</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="profile?un=<%= session.getAttribute("uName") %>"><%= session.getAttribute("uName") %></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="logoutServlet?un=<%= session.getAttribute("uName") %>">Logout</a>
      </li>
    </ul>
  </div>
</nav>
</body>
</html>