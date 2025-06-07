<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<%-- 지시자: 컨테이너(엔진) 서블릿을 만들어라! --%>
<h1>로그인 정보 받아서 세션을 저장</h1>
<%-- 1) 받아서 처리하는 부분(controller) --%>
<%-- 2) html로 생성하는 부분(view.jsp)--%>
<%
  // 스크립트릿(service()내로 들어감)
  // 스크립트릿 안에 만들어진 변수는 지역변수
  String id = request.getParameter("userid");
  // id가 전달 된 것이 있으면 pw 까지 추출해서 session 저장
  // id가 전달 되지 않았으면 다시 로그인 하는 페이지를 호출하려고
  // 브라우저에 명령
  if (id == null) {
    response.sendRedirect("loginForm.html");
    // 새로운 요청이 시작됨. 이전 기록이 없는 상태에서 새로운 요청 시작
  } else {
    // 브라우저가 input 태그로 보낸 value는 모두 서버에서 String으로 인식
    String pw = request.getParameter("password");
    // 세션이 유지되는 동안 일반적으로 id, name, nicename, tel로 설정하는 편
    // 실무에서는 pw를 세션으로 잡지 않음!
    session.setAttribute("userid", id); // 값은 Object로 다 형변환 되어 들어감
    session.setAttribute("password", pw); // 값은 Object로 형변환 되어 들어감.
    out.print("안녕하세요" + id + "<br>");
    out.print("<a href='loginInfo.jsp'>정보보기</a>");
  }
%>
</body