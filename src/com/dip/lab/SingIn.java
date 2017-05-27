package com.dip.lab;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SingIn
 */
public class SingIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SingIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletConfig().getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		String loginReg = "";
		String passwordReg = "";
		String roleReg = "";
		//������� ������ �� ����� �������� �����
		List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Дмитрий\\Desktop\\2_course_4_semester-master\\WEB\\file\\logpas.txt"), StandardCharsets.UTF_8);
        for (int i = 0; i < (lines.size() - 1) && (!login.equals(loginReg) || !password.equals(passwordReg)); i += 3){
            loginReg = lines.get(i);
            passwordReg = lines.get(i + 1);
            role = lines.get(i + 2);
            System.out.println("File " + loginReg + ", " + passwordReg + ", " + roleReg);
        }
        
        Writer out = response.getWriter();
		System.out.println("Checked Reg " + loginReg + ", " + passwordReg + ", " + roleReg);
		System.out.println("Checked form File " + login + ", " + password + ", " + role);
		if (login.equals(loginReg) && password.equals(passwordReg)) {
			out.write("<html><h1>Correct password!</h1>"
					+ "<a href = \"http://localhost:8080/Lab/Main\">Sing up new user</a><br>"
					+ "<a href = \"http://localhost:8080/Lab/Site\">Go to site</a></html>");
		}
		else
			out.write("<html><h1>Incorrect password</h1>"
					+ "<a href = \"http://localhost:8080/Lab/SingIn\">Sing in again</a></html>");
	}
}