package com.dip.lab;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Site
 */
public class Site extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Site() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletConfig().getServletContext().getRequestDispatcher("/Site.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Дмитрий\\Desktop\\2_course_4_semester-master\\WEB\\file\\logpas.txt"), StandardCharsets.UTF_8);
		int role = Integer.parseInt(request.getParameter("role")) - 1; //��������� ������ � ��� (��� ����� ���������� ��������, ��� ��������)
		if (lines.size() - 1 > role * 3) {
			lines.remove(role * 3);
			lines.remove(role * 3);
			lines.remove(role * 3);
        }
		PrintWriter printWriter = new PrintWriter("C:\\Users\\Дмитрий\\Desktop\\2_course_4_semester-master\\WEB\\file\\logpas.txt", "UTF-8");
		for (String line : lines) {
			printWriter.println(line);
		}
		printWriter.close();
		response.getWriter().write("<html><h1>Correct deleted!</h1></html>");
		//getServletConfig().getServletContext().getRequestDispatcher("/Site.jsp").forward(request, response);
		//doGet(request, response);
	}
}
