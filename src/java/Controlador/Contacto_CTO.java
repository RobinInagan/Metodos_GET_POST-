/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.Contacto_DAO;
import modelo.dto.Contacto_DTO;

/**
 *
 * @author robin
 */
public class Contacto_CTO extends HttpServlet {

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
        
        String accion = request.getParameter("accion");
        Contacto_DAO dao = new Contacto_DAO();
        switch (accion) {
            case "Crear": {
                String nombre = request.getParameter("txt_nombre");
                String Correo = request.getParameter("txt_mail");
                String Asunto = request.getParameter("txt_asunto");
                String Descripcion = request.getParameter("txt_desc");
                
                Contacto_DTO dto = new Contacto_DTO(nombre, Correo, Asunto, Descripcion);
                
                if (dao.Crear(dto) == true) {
                    PrintWriter out = response.getWriter();
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>respuesta</title>");
                    out.println("</head>");
                    out.println("<body><h1> ¡Su comentario fue enviado con exito! </h1>"
                            + "<a href=index.jsp>Volver</a></body>");
                    out.println("</html>");
                    //Esta es la forma de redireccionar a otra página 
                    //request.getRequestDispatcher("dirección de la página destino").forward(request, response);
                }
                break;
            }
            case "Listar": {
                
                List<Contacto_DTO> list = dao.readAll();
                PrintWriter out = response.getWriter();
                out.println("<html>");
                out.println("<head>");
                out.println("<title>respuesta</title>");
                out.println("<style>\n"
                        + "table, th, td {"
                        + "  border: 1px solid black;"
                        + "  border-collapse: collapse;"
                        + "}"
                        + "th,th {"
                        + "padding:15px;}"
                        + "</style>");
                out.println("</head>");
                out.println("<body>");
                out.println("<table>");
                out.println("<caption>Lista De Mensajes</caption>");
                System.out.println("<th>Nombre</th>");
                System.out.println("<th>Correo</th>");
                System.out.println("<th>Asunto</th>");
                System.out.println("<th>Comentario</th>");
                for (Contacto_DTO i : list) {
                    System.out.println("<tr>");
                    System.out.println("<td>" + i.getNombre());
                    System.out.println("</td>");
                    System.out.println("<td>" + i.getCorreo());
                    System.out.println("</td>");
                    System.out.println("<td>" + i.getAsunto());
                    System.out.println("</td>");
                    System.out.println("<td>" + i.getComentario());
                    System.out.println("</td>");
                    System.out.println("</tr>");
                }
                out.println("</table>");
                out.println("</body>");
                out.println("</html>");
                
                break;
            }
            
            default:
                throw new AssertionError();
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
        /*
        String nombre = request.getParameter("txt_nombre");
        String Correo = request.getParameter("txt_mail");
        String Asunto = request.getParameter("txt_asunto");
        String Descripcion = request.getParameter("txt_desc");
        
        Contacto_DTO dto = new Contacto_DTO(nombre, Correo, Asunto, Descripcion);
        Contacto_DAO dao = new Contacto_DAO();
        dao.Crear(dto);
        
        List<Contacto_DTO> list = dao.readAll();
        for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
         */
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
