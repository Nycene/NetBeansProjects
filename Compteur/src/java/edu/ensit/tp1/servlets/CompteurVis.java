/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ensit.tp1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Naycene Boussoffara
 */
@WebServlet(name = "CompteurVis", urlPatterns = {"/CompteurVis"})
public class CompteurVis extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CompteurVis</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CompteurVis at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            //****************************
            Cookie[] cookies = request.getCookies();
            Integer visites = 0;
            //Traitements des cas
            if( cookies != null){
                // On cherche le cookie concerné
                for(Cookie c : cookies){
                    if(c.getName().equals("visites")){
                        visites = Integer.parseInt(c.getValue());
                        out.println("C'est votre visite num : "+(++visites)+"<br/>");
                        c.setValue(visites.toString());
                        c.setMaxAge(60*60*24*365);
                        response.addCookie(c);
                    }
                }
                
            }
            
            if(visites == 0){
                
                out.println("<p>C'est votre premiere visite depuis un an !</p>");
                Cookie c =new Cookie("visites", "1");
                c.setMaxAge(60*60*24*365);
                response.addCookie(c);
                
            }
            
            
            //***************************
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
