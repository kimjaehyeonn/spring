<%--
  Created by IntelliJ IDEA.
  User: 김재현
  Date: 2025-06-07
  Time: 오후 3:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> JSP 스크립팅요소  </h2>
<%-- 이 주석은 서블릿으로 변환 시 제거됩니다. --%>
<p> jsp  주석 태그 </p>
<%
  // 이 주석은 서블릿 코드에 포함됩니다.
  /*이 주석도~~*/
  String message = "jsp 주석 예제";
  System.out.println(message);
%>

<p> 선언 태그</p>
<%!
  // JSP 페이지 내에서 전역적으로 사용할 변수/메서드 선언
  // 전역 변수 선언
      private  int count =0;
    public String getGreeting() {
      return "안녕하세요!";
    }
%>
<%-- 스크립틀릿 태그 -> 자바 코드블록 삽입--%>
<% count++; %>
<%-- 표현식 태그 -> 자바 표현식의 결과를 html 페이지에 출력, ; 불필요, out,println()과 동일한 기능 --%>
<p> 방문 횟수: <%= count %></p>
<p> <%= getGreeting() %></p>
</body>
</html>
