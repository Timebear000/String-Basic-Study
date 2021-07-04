package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="helloServlet",urlPatterns ="/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {


        System.out.println("HelloServlet service ");
        System.out.println("req = " + req);
        System.out.println("res = " + response);
        //request
        String username = req.getParameter("username");
        System.out.println("username = " + username);

        //response
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("name : " + username);
    }

}
