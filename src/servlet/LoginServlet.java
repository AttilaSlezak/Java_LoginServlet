package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	private Map<String, String> users = new HashMap<>();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		users.put("Lincoln", "secret");
		users.put("Washington", "mypassword");
				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		try {
			if (users.containsKey(username) && users.get(username).equals(password)) {
				HttpSession session = request.getSession();
				System.out.println(session.getId());
				System.out.println(session.getAttribute("user") == null);
				if (session.getAttribute("user") == null) {
					session.setAttribute("user", username);
					RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
					rd.forward(request, response);
				} else {
					request.setAttribute("reason", "logged");
					RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
					rd.forward(request, response);
				}
			} else {
				request.setAttribute("reason", "password");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
		} finally {
		out.close();
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
