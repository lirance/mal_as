/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author java1
 */
public class RegisterActionPH extends HttpServlet {

	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
	 * methods.
	 *
	 * @param request  servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException      if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String name = request.getParameter("name");
			System.out.println("nmae:" + name);
			String pass = request.getParameter("pass");
			int agno = Integer.parseInt(request.getParameter("agno"));
			int policy = Integer.parseInt(request.getParameter("policy"));
			String bank = request.getParameter("bank");
			System.out.println("bank" + bank);
			String organization = request.getParameter("organization");
			System.out.println("organization" + organization);
			String occupation = request.getParameter("occupation");
			System.out.println("organization" + occupation);
			String mail = request.getParameter("email");
			String add = request.getParameter("address");
			String sex = request.getParameter("sex");
			String age = request.getParameter("age");
			Connection con = Dbcon.getCon();
			Statement st = con.createStatement();
			String insertQuery = "insert into client(agno,policy,name, pass, bank,organization, occupation, email, address, sex, age) values('"
					+ agno + "','" + policy + "','" + name + "','" + pass + "','" + bank + "','" + organization + "','"
					+ occupation + "','" + mail + "','" + add + "','" + sex + "','" + age + "')";

			int i = st.executeUpdate(insertQuery);

			if (i != 0) {
				response.sendRedirect("index.jsp?msg=Registration_success");
			} else {
				response.sendRedirect("index.jsp?msg=Register Error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
	// + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request  servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException      if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request  servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException      if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Returns a short description of the servlet.
	 *
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
