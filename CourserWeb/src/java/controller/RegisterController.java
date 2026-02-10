/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.RegisterDAO;
import dto.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author admin
 */
public class RegisterController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8"); // Đặt mã hóa cho request, nếu có dữ liệu đầu vào là Unicode thì sẽ không bị lỗi
        response.setContentType("text/html;charset=UTF-8"); // Đặt mã hóa cho response, nếu có dữ liệu đầu ra là Unicode thì sẽ không bị lỗi
        response.setCharacterEncoding("UTF-8"); // khác với cái trên ở chỗ này đặt mã hóa cho chính response, vdi như bạn in ra bằng PrintWriter thì sẽ không bị lỗi
          try{
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phone = request.getParameter("phone");
            RegisterDAO dao = new RegisterDAO();
            String role = request.getParameter("role");
            int roleID = Integer.parseInt(role);
            
            
            if (dao.emailExist(email)) {
                  request.setAttribute("EmailExist", "Email already exist, Enter another email");
                  request.getRequestDispatcher("register.jsp").forward(request, response);
                  return;
              }


                User u = new User();
                u.setEmail(email);
                u.setPasswordHash(password);
                u.setFirstName(firstName);
                u.setLastName(lastName);
                u.setPhoneNumber(phone);
                u.setRoleID(roleID);

                boolean success = dao.insertRegister(u);
                if(success){
                    //Mo trang dashboard.jsp
                    HttpSession session = request.getSession();
                    session.setAttribute("User", u);
                    request.getRequestDispatcher("dashboard.jsp").forward(request, response);
                }else{
                    String error = "Registration failed. Please try again.";
                    request.setAttribute("ERROR", error);
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                }

        }catch(NumberFormatException e){
            System.out.print("Invalid email format. Email should be a number." + e.getMessage());
        }catch(Exception e){
            System.out.println("Error in LoginController: " + e.getMessage());

        }
  
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
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
