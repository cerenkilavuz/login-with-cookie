package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        String rememberMe = request.getParameter("rememberMe");

      

        if ("on".equals(rememberMe)) {
        	Cookie ck = new Cookie("uname", username);
			Cookie ck2 = new Cookie("upass", password);
			
			ck.setMaxAge(60 * 60 * 24 * 30);
			ck2.setMaxAge(60 * 60 * 24 * 30);
			
			response.addCookie(ck);
			response.addCookie(ck2);
        }

        response.sendRedirect("HomeServlet");
    }
}



