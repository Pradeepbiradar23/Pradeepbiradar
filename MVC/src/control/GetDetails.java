package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Model;
public class GetDetails extends HttpServlet 
{
public void service(HttpServletRequest x, HttpServletResponse y)
{
	Model m=new Model();
	String books[] = x.getParameterValues("book");
	 
	if (books != null) {
	    System.out.println("your selected books ");
	    for (String lang : books) {
	    	m.setTotal(Integer.parseInt(lang));
	    	m.getInfo();
	    }
	}
	 
	 
	try {
		String s=m.getBooks();
		int pricetotal=m.getPriceTotal();
		PrintWriter pw =y.getWriter();
		y.setContentType("text/html");
		pw.println("Your Purchase orders are");
		pw.println("</br>");
		pw.println(s);
		if(pricetotal<600)
		{
		pw.println("</br>");
		pw.println("Delivary charge will be included min:50");
		pw.println("</br>");
		pw.println(pricetotal+50);
		}
		else
		{
			pw.println("</br>");
			pw.println(pricetotal);	
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}