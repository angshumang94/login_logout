package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Register;
import classes.UserValid;

/**
 * Servlet implementation class SignupServ
 */
public class SignupServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
        response.setDateHeader("Expires", 0);
		
		
		
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(new UserValid().usernameAvail(username)){
			if(new Register().add(username, password)){
				out.println("<html><head><b>Success</b><br><br>You will now be redirected to Login page</head></html>");
				response.setHeader("Refresh", "3; URL=" + request.getContextPath() + "/Login.jsp");
				
			}
			else{
				out.println("Try Again");
			}
		}
		else{
			out.println("<html><head>Username <b>"+ username +"</b> is taken<br><br>You will now be redirected to Sign Up page</head></html>");
			response.setHeader("Refresh", "3; URL=" + request.getContextPath() + "/SignUp.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
