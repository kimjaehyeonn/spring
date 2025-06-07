package org.scoula.basic;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        /*
         * 공통 설정 초기화: DB 연결 정보, 파일 경로, 외부 API 키
         *    dbUrl = getServletConfig().getInitParameter("dbUrl");
         * 리소스 생성: DB 커넥션 풀, 객체 캐싱, 속성 값 초기화
         * 로그 작성: 서버 기동 로그, 로딩 성공 여부 출력
         *
         * Spring에서는 @PostConstrcut()
         * */
        System.out.println("서블릿 객체 생성 시 초기화할 내용. 1회 호출.");
    }

    /* doGet과 doPost는 service()가 판단하여 호출함. */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Get 요청됨");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post 요청됨");
        ;
    }

    @Override
    public void destroy() {
        /*
        * 리소스 해제: DB 연결 종료, 쓰레드 종료, 파일 스트림 정리
        * if (connection != null) {
                 try { connection.close(); } catch (SQLException ignored) {}
             }
        * 로그 남기기: 종료 로그, 통계 정보 저장
        * 임시 파일 삭제: 캐시 폴더 정리, 임시 업로드 파일 삭제
        *
        * Spring에서는 @PreDestroy*/
        System.out.println("서블릿 객체 소멸시 정리할 내용. 1회 호출");
    }
}
