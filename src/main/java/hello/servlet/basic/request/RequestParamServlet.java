package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "requestParamServlet",urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("[ 전체 파라미터 조회 ] - start ");
        req.getParameterNames().asIterator().forEachRemaining(params -> System.out.println(params + " = " + req.getParameter(params)));
        System.out.println("[ 전체 파라미터 조회 ] - end \n");

        System.out.println("[ 단일 파라미터 조회 ] - start ");
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        System.out.println("username : "+ username);
        System.out.println("age : "+ age);;
        System.out.println("[ 단일 파라미터 조회 ] - end \n");


        System.out.println("[ 이름이 같은 복수 파라미터 조회 ] - start ");
        String[] usernames = req.getParameterValues("username");
        for(String us : usernames){
            System.out.println("us = " + us);
        }

        resp.getWriter().write("ok");
    }

}
