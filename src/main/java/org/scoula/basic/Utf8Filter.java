package org.scoula.basic;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class Utf8Filter implements Filter {
    // 필터 인터페이스 구현

    private String encoding;

    // init() 필터 객체 생성 시 호출, 초기화 담당.
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encoding = filterConfig.getInitParameter("encoding");
        // FilterConfig --> web.xml에 filter에 사용할 변수들
        // 설정해두고 읽어 올 수 있음.
        if (encoding == null) {
            encoding = "UTF-8"; // 기본 인코딩 설정
        }
        System.out.println("필터 객체 생성됨 ");
    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        /// ////////////////////////
        request.setCharacterEncoding(encoding);
        response.setContentType("text/html; charset=UTF-8");
        chain.doFilter(request, response);
        /// ///////////////////////
    }

    @Override
    public void destroy() {
        System.out.println("필터 객체 소멸됨 ");
        // 필터 종료시 처리할 작업
    }
}

