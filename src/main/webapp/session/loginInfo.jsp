<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>로그인 정보 보기</h1>
<%
  // 스클비트릿
  String id = (String) session.getAttribute("userid");
  if (id == null) {
    response.sendRedirect("loginForm.html");
  } else {
    String pw = (String) session.getAttribute("password");
    out.print("사용자 id : " + id + "<br>");
    out.print("사용자 pw : " + pw + "<br>");
    out.print("<a href='logout.jsp'>로그아웃</a>");
  }
%>
</body>
</html>

