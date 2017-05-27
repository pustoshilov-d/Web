package com.dip.lab;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		HttpSession session = request.getSession(true);
//
//		if (request.getSession().getAttribute("you_login") != null ? (boolean) session.getAttribute("you_login") : false) {
//			getServletConfig().getServletContext().getRequestDispatcher("/Site").forward(request, response);
//		} else
		getServletConfig().getServletContext().getRequestDispatcher("/MainReg.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Дмитрий\\Desktop\\2_course_4_semester-master\\WEB\\file\\logpas.txt", true), "UTF-8"));
		}
		catch(FileNotFoundException e) {
			printWriter = new PrintWriter("C:\\Users\\Дмитрий\\Desktop\\2_course_4_semester-master\\WEB\\file\\logpas.txt", "UTF-8");
		}
		printWriter.println(login);
		printWriter.println(password);
		printWriter.println(role);
		printWriter.close();
		getServletConfig().getServletContext().getRequestDispatcher("/RegistrationComplete.jsp").forward(request, response);
		
	}

}

