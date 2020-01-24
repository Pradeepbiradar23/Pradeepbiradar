package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Model;

public class GetLogin extends HttpServlet 
{
public void service(HttpServletRequest x, HttpServletResponse y)
{
	String username=x.getParameter("username");
	String password=x.getParameter("password");
	Model m=new Model();
	m.setUsername(username);
	m.setPassword(password);
	boolean temp=m.getLogin();
	HttpSession hs=x.getSession(true);
	try {
		PrintWriter pw=y.getWriter();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	if(temp==true)
	{
		try {
			y.sendRedirect("/MVC/Success.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else
	{
		try {
			y.sendRedirect("/MVC/Failure.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}
