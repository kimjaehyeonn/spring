package org.scoula.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="you", value = "/you")
public class YourServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Yourservlet init 호출");
        System.out.println("필드 초기화..");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("YourServlet doGet"); // 서버 쪽 컴퓨터의 프린트내용!
        // 제어하는 부분 --> db 연동해야 하는 경우(DAO 써서 결과 받아오는 코드)

        // 응답해보자!! --> html로 생성해야 함
        // 컨테이너에 의해 만들어진 req, resp 객체를 이용해서
        // 요청들어온 정보를 추출할 수도 있고
        // 처리 결과를 html로 만들어서 응답할 수도 있음.

        /* HttpServletRequest
        * - 클라이언트(웹 브라우저)가 보낸 HTTP 요청에 대한 모든 정보를 담고 있는 객체
        * - 클라이언트가 보낸 데이터(파라미터, 헤더, 쿠키, 세션정보 등)를 얻어 올 수 있음
        *
        * 주요 메서드:
        * getHeader(String name): HTTP 헤더 값 조회
        * getParameter(String name): 요청 파라미터 값 조회
        * getParameterNAme(): 모든 파라미터 이름 조회
        * getRequestURI(): 요청 URI 조회
        * getServletPath(): 서블릿 경로 조회
        * getSession(): 세션 객체 조회
        * setAttribute(String, Object): 속성 설정
        *  // 클라이언트가 서버로 보낸 요청을 생성된 req 객체에 서버가 속성을 추가.
        *  // 다음 단계로 포워딩될 때 그대로 전달됨. (redirect x)
        *  // JSP에서 getAttribute() 나 ${}로 꺼내서 사용.
        * getAttribute(String): 속성 조회.
        * */

        /* HttpServletResponse
        * - 서블릿이 클라이언트에 보낼 HTTP 응답을 생성하는데 사용되는 객체
        * - 응답의 내용(HTML, JSON 등), 헤더, 쿠키, 상태 코드 등을 설정하여 클라이언트에 전송
        *
        * 주요 메서드:
        * setContentType(String) : 응답 컨텐츠 타입 설정
        * getWriter(): 문자 출력 스트림
        * getOutputStream(): 바이너리 출력 스트림
        * sendRedirect(String): 리다이렉트 처리
        * addHeader(String, String): 응답 헤더 추가
        * setStatus(int): HTTP 상태코드 설정
        * */
        resp.setContentType("text/html;charset=utf-8"); // 보낼 데이터 타입 지정

        // html 문자를 만들어줄 객체가 필요 --> PrintWriter
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head> <title> 브라우저로 전송되는 출력 내용</title></head>");
        out.println("<body bgcolor = 'yellow'>");
        out.println("<h1> 서버에서 브라우저로 전송되는 내용</h1>");
        out.println("</body>");
        out.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post 요청 들어줌");
    }

    @Override
    public void destroy() {
        System.out.println("서블릿 소멸시 한전 자동 호출");
        System.out.println("db close 해줄 것이나");
        System.out.println("파일 삭제해주는 것이나");
    }
}
