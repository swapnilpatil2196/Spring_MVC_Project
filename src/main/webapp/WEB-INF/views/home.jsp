<jsp:include page="prevent.jsp"></jsp:include>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">



<html>
<head>
<%
String msg = (String)request.getAttribute("msg");
if(msg!=null){
%>

<script type="text/javascript">
alert("${msg}")
</script>	
	
<%	
}
%>
</head>
<body>

<jsp:include page="menu.jsp" />

 <img src="resources/img/pexels-ylanite-koppens-1445416.jpg" height="550" width="1280">
 
</body>

</html>












