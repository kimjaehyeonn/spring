<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Input Form</title>
</head>
<body>
<%-- post 방식으로 전송 시 한글이 깨져서 도착함
받는 서블릿에서 한글을 utf-8로 인코딩하여 받겠다고 설정해야 함
서블릿에서 받기전 전처리 목적 --%>
<form action="/utf8.do" method="post">
  name : <input name="name" value="홍길동"> <br>
  <button>한글처리요청</button>
</form>
</body>
</html>



