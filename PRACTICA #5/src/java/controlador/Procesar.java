/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;

/**
 *
 * @author Aurelio Hernandez Valdes
 */
public class Procesar extends HttpServlet {

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
        
        String nombre = request.getParameter("nombree");
        String apellidos = request.getParameter("apellidoss");
        String edad = request.getParameter("edadd");
        String correo = request.getParameter("email");
        String contrasenia = request.getParameter("pass");
        String anio = request.getParameter("anio");
        String mes = request.getParameter("mess");
        String dia= request.getParameter("diaa");
        
        if(nombre.equals("") || apellidos.equals("") || edad.equals("") || correo.equals("") || contrasenia.equals("") || anio.equals("") || mes.equals("")|| dia.equals("")){
            request.getRequestDispatcher("DatosIncorrectos.jsp").forward(request, response);
         }
        else{
            Usuario x1 = new Usuario(nombre, apellidos, edad, correo, contrasenia, anio, mes,dia);
            request.getSession().setAttribute("persona1", x1);
            request.getRequestDispatcher("DatosCorrectos.jsp").forward(request, response);
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
