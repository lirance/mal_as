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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author java1
 */
public class updatestatus extends HttpServlet {

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

			HttpSession ses = request.getSession(true);
			String agno = request.getParameter("agno");
			String name = request.getParameter("name");
			System.out.println("nmae:" + name);
			String bank = request.getParameter("bank");
			System.out.println("bank" + bank);
			String detail = request.getParameter("detail");
			System.out.println("detail" + detail);
			String mail = request.getParameter("email");
			String add = request.getParameter("address");
			String sex = request.getParameter("sex");
			String age = request.getParameter("age");

			String sql = "update agent set name ='" + name + "',bank ='" + bank + "',detail ='" + detail + "',email='"
					+ mail + "',address='" + add + "',sex='" + sex + "',age='" + age + "' where agno = '" + agno + "'";
			// String sql1 = "insert into hist (id, dev, status, summary) values
			// ('"+id+"','"+user+"','"+sts+"','"+sum+"')";
			Connection con = Dbcon.getCon();
			Statement st = con.createStatement();
			Statement st1 = con.createStatement();
			int i = st.executeUpdate(sql);
			// int i1 = st1.executeUpdate(sql1);
			if (i != 0) {
				response.sendRedirect("agentlist.jsp?Status_Updated");
			} else {
				response.sendRedirect("updateAgent.jsp?Try_Again");
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
