package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Lớp này dùng để điều phối các request dựa trên tham số "action" gửi lên từ client
 * Tùy vào giá trị của "action", request sẽ được chuyển tiếp (forward) đến các servlet hoặc trang JSP tương ứng
 * @author admin
 */
public class MainController extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response){
        String url="error.jsp";
        try{
            //lay value cua nut submit
            String ac=request.getParameter("action");
            //neu ac null thi gan mac dinh la HOME
            if(ac==null){
                ac="HOME";
            }
            switch(ac){
                case "HOME":
                    url="login.jsp";
                    break;
                case "login":
                    url="LoginController"; //forward den LoginController de xu ly
                    break;
                case "register":
                    url="RegisterController"; //forward den RegisterController de xu ly
                    break;
                case "logout":
                    url="LogoutController"; //forward den LogoutController de xu ly
                    break;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                request.getRequestDispatcher(url).forward(request, response);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request,response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}