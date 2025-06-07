<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSTL Example</title>
</head>
<body>


<h2> 조건문 예제 </h2>
<c:if test="${5>2}">
  <p> 5는 2보다 큽니다.</p>
</c:if>

<h2> 반복문 예제 </h2>
<ul>
  <c:forEach var="i" begin="i" end="5">
    <li> 번호 ${i}</li>
  </c:forEach>
</ul>
<hr>
<%
  Date now = new Date();
  pageContext.setAttribute("now", now); // page 내 속성이 필요한 경우
  pageContext.setAttribute("price", 10000000); // 일반 변수값은 fmt 사용 불가
  // 반드시 사용할 범위를 지정한 속성으로 설정 후 사용해야 함.
%>
<%-- - 날짜 formatting --%>
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss"/>

<%-- - 숫자 formatting--%>
<fmt:formatNumber value="${price}" type="currency"/>

</body>
</html>
