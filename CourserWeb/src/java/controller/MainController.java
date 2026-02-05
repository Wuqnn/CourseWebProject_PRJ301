package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainController extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response){
        String url="error.jsp";
        try{
            //lay value cua nut submit
            String ac=request.getParameter("action");
            if(ac==null){
                ac="HOME";
            }
            switch(ac){
                case "HOME":
                    url="login.jsp";
                    break;
                case "login":
                    url="LoginController";
                    break;
                case "register":
                    url="RegisterController";
                    break;
                case "logout":
                    url="LogoutController";
                    break;
                case "search":
                    url="SearchController";
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