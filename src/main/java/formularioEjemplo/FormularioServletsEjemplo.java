package formularioEjemplo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FormularioServletsEjemplo extends HttpServlet { 
    private static final long serialVersionUID = 1L;

    public FormularioServletsEjemplo() {
        super();
    }

    // Método GET: muestra el formulario directamente desde el servlet
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Formulario desde GET</title></head><body>");
        out.println("<h1>Formulario cargado con GET</h1>");
        out.println("<form method='post' action='FormularioServletsEjemplo'>");
        out.println("Nombre: <input type='text' name='nombre'><br><br>");
        out.println("Correo Electrónico: <input type='email' name='email'><br><br>");
        out.println("Mensaje:<br><textarea name='mensaje' rows='4' cols='50'></textarea><br><br>");
        out.println("<input type='submit' value='Enviar'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    // Método POST: procesa los datos enviados por el formulario
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String mensaje = request.getParameter("mensaje");

        request.setAttribute("nombre", nombre);
        request.setAttribute("email", email);
        request.setAttribute("mensaje", mensaje);

        RequestDispatcher dispatcher = request.getRequestDispatcher("FormularioEjemplo.jsp");
        dispatcher.forward(request, response);
    }
}

