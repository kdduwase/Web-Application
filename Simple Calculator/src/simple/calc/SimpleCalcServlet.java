package simple.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/simplecalc")
public class SimpleCalcServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		if (!(request.getParameter("num1").trim().equals("")) && !(request.getParameter("num2")).trim().equals("") && 
				!(request.getParameter("num3").trim().equals("")) && !(request.getParameter("num4")).trim().equals("")) {
			
			int i = Integer.parseInt(request.getParameter("num1"));
			int j = Integer.parseInt(request.getParameter("num2"));
			int k = Integer.parseInt(request.getParameter("num3"));
			int l = Integer.parseInt(request.getParameter("num4"));

			int sum = i + j; 
			int res = k * l;

			PrintWriter out = response.getWriter();
			
			out.println(i + " + " + j + " = " + sum);
			out.println(k + " * " + l + " = " + res);
		}
		
		else if (!(request.getParameter("num1").trim().equals("")) && !(request.getParameter("num2")).trim().equals("") && 
				(request.getParameter("num3").trim().equals("")) && (request.getParameter("num4")).trim().equals("")) {
			
			int i = Integer.parseInt(request.getParameter("num1"));
			int j = Integer.parseInt(request.getParameter("num2"));
			
			int sum = i + j; 
			
			PrintWriter out = response.getWriter();
			out.println(i + " + " + j + " = " + sum);
		}
		
		
		else if ((request.getParameter("num1").trim().equals("")) && (request.getParameter("num2")).trim().equals("") && 
				!(request.getParameter("num3").trim().equals("")) && !(request.getParameter("num4")).trim().equals("")) {
			
			int k = Integer.parseInt(request.getParameter("num3"));
			int l = Integer.parseInt(request.getParameter("num4"));
			int result = k * l; 
			
			PrintWriter out = response.getWriter();
			
			out.println(k + " * " + l + " = " + result);
			
		}
		
		else {
			PrintWriter out = response.getWriter();

			out.println("");
		}
	}
	
}
