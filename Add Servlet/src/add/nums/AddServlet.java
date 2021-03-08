package add.nums;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

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
			
			out.println("<html><body>" + "<input type='text' readonly='readonly' value='" + i + "'/>"
					+ " + <input type='text' readonly='readonly' value='" + j + "'/>"
					+ " = <input type='text' readonly='readonly' value='" + sum + "'/><br>" + "</body></html>");
			out.println("<html><body>" + "<input type='text' readonly='readonly' value='" + k + "'/>"
					+ " * <input type='text' readonly='readonly' value='" + l + "'/>"
					+ " = <input type='text' readonly='readonly' value='" + res + "'/>" + "</body></html>");
		}
		
		else if (!(request.getParameter("num1").trim().equals("")) && !(request.getParameter("num2")).trim().equals("") && 
				(request.getParameter("num3").trim().equals("")) && (request.getParameter("num4")).trim().equals("")) {
			
			int i = Integer.parseInt(request.getParameter("num1"));
			int j = Integer.parseInt(request.getParameter("num2"));
			
			int sum = i + j; 
			
			PrintWriter out = response.getWriter();
			out.println("<html><body>" + "<input type='text' readonly='readonly' value='" + i + "'/>"
					+ " + <input type='text' readonly='readonly' value='" + j + "'/>"
					+ " = <input type='text' readonly='readonly' value='" + sum + "'/><br>" + "</body></html>");
			out.println("<html><body>" + "<input type='text' readonly='readonly' value=''/>"
					+ " * <input type='text' readonly='readonly' value=''/>"
					+ " = <input type='text' readonly='readonly' value=''/>" + "</body></html>");
		}
		
		
		else if ((request.getParameter("num1").trim().equals("")) && (request.getParameter("num2")).trim().equals("") && 
				!(request.getParameter("num3").trim().equals("")) && !(request.getParameter("num4")).trim().equals("")) {
			
			int k = Integer.parseInt(request.getParameter("num3"));
			int l = Integer.parseInt(request.getParameter("num4"));
			int result = k * l; 
			
			PrintWriter out = response.getWriter();
			
			out.println("<html><body>" + "<input type='text' readonly='readonly' value=''/>"
					+ " + <input type='text' readonly='readonly' value=''/>"
					+ " = <input type='text' readonly='readonly' value=''/><br>" + "</body></html>");
			
			out.println("<html><body>" + "<input type='text' readonly='readonly' value='" + k + "'/>"
					+ " * <input type='text' readonly='readonly' value='" + l + "'/>"
					+ " = <input type='text' readonly='readonly' value='" + result + "'/><br>" + "</body></html>");
			
		}
		
		else {
			PrintWriter out = response.getWriter();

			out.println("<html><body>" + "<input type='text' readonly='readonly' value=''/>"
					+ " + <input type='text' readonly='readonly' value=''/>"
					+ " = <input type='text' readonly='readonly' value=''/>" + "</body></html>");
			out.println("<html><body>" + "<input type='text' readonly='readonly' value=''/>"
					+ " * <input type='text' readonly='readonly' value=''/>"
					+ " = <input type='text' readonly='readonly' value=''/>" + "</body></html>");
		}
	}
}
