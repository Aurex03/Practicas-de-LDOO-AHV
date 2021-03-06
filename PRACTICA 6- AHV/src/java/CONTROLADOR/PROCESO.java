package CONTROLADOR;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

public class PROCESO extends HttpServlet {
    /**
     * Autor: Aurelio Hernandez Valdes
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //try (PrintWriter out = response.getWriter()) {
        String usuario = request.getParameter("usuario");
        String contrasena=request.getParameter("contrasena");
        HttpSession sesion = request.getSession();
        String username = (String) sesion.getAttribute("username");
        String password = (String) sesion.getAttribute("password");
        
        if(username==null || password==null){
            response.sendRedirect("RegistroIncompleto.jsp");
        }
        else{
            if(usuario == null || contrasena == null){
                response.sendRedirect("ERROR.jsp");
            }
            else{
                if(username.equals(usuario) && password.equals(contrasena)){
                    response.sendRedirect("Entrando.jsp");
                }
                else{
                    response.sendRedirect("ERROR.jsp");
                }
                
            }
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