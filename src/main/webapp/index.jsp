<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body >
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%-- call.jsp에서는 상대위치 지정, 해당 파일과 같은 위치에서 찾음--%>
<hr color = "red">
<a href = "call.jsp"> call.jsp 파일 호출은 jsp파일명을 지정함</a> <br>
<%--YourServlet.java를 호출하는 경우는 호출할 수 있는 호출할 주소를 임의로 생성해주어야 한다. --%>
<a href="/you">Your Servlet.java 파일 호출은 임의로 생성해준 주소를 지정함. </a>
</body>
</html>