<%
String username = (String)session.getAttribute("uName");
if(username == null){
	request.setAttribute("msg", "Please Login First");
	RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
	rd.forward(request, response);
}
%>
