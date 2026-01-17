/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.UserDAO;
import DTO.UserDTO;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Windows
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res){
        try {
            String username = req.getParameter("txtusername");
            String email = req.getParameter("txtemail");
            String password = req.getParameter("txtpassword");

            UserDTO dto = new UserDTO(username, password, email);
            UserDAO dao = new UserDAO();

            dao.insert(dto);

            System.out.println(">>> REGISTER SUCCESS <<<");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
