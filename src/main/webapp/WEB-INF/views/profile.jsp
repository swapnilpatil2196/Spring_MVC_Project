<jsp:include page="prevent.jsp"></jsp:include>

<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="css/styles1.css">
	<jsp:include page="menu.jsp" />
	
</head>
<body>



<section class="h-50" style="background-color: #8fc4b7;">
  <div class="container py-5 h-80">
    <div class="row d-flex justify-content-center align-items-center h-300">
      <div class="col-lg-20 col-xl-10">
        <div class="card rounded-3">
          <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img3.webp"
            class="w-100" class="h-100" style="border-top-left-radius: .1rem; border-top-right-radius: .1rem;"
            alt="Sample photo">
          <div class="card-body p-4 p-md-5">
            <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Profile Page</h3>
            
            <% 
            String msg = (String )request.getAttribute("msg");
            if(msg!=null){
            %>	
            <script type="text/javascript">
            alert("${msg}")
            </script>
            <% 	
            }
            %>

            <form  action="updateEmployee" method="post">
            
					<div class="input-group form-group">
						<div class="input-group-prepend">
						</div>
						<input type="text" class="form-control" placeholder="empid"  hidden value="${emp.empid}" name="empid">	
					</div>          
					
					
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" placeholder="username"  value="${emp.username}" name="username">	
					</div>
					
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" placeholder="password" value="${emp.password}" name="password">
					</div>  
					
					
					<div class="input-group form-group">
						<div class="input-group-prepend">
						</div>
						<input type="text" class="form-control" placeholder="department" value="${emp.department}" name="department">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
						</div>
						<input type="text" class="form-control" placeholder="salary" value="${emp.salary}" name="salary">
					</div>  
					
					
					<div class="input-group form-group">
						<div class="input-group-prepend">
						</div>
						<input type="text" class="form-control" placeholder="type" value="${emp.type}" name="type">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
						</div>
						<input type="text" class="form-control" placeholder="status" value="${emp.status}" name="status">
					</div>  
					
					
					<div class="input-group form-group">
						<div class="input-group-prepend">
						</div>
						<input type="text" class="form-control" placeholder="question" value="${emp.question}" name="question">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
						</div>
						<input type="text" class="form-control" placeholder="answer" value="${emp.answer}" name="answer">
					</div>  
              

					<div class="form-group">
						<input type="submit" value="UPDATE" class="btn float-right login_btn">
					</div>
            </form>

          </div>
        </div>
      </div>
    </div>
  </div>
</section>





</body>
</html>