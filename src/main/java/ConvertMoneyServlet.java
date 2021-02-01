import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/index")
public class ConvertMoneyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float amount = Float.parseFloat(request.getParameter("amount"));
        Float rate = Float.parseFloat(request.getParameter("rate"));
        PrintWriter writer = response.getWriter();
        writer.println("<html>" + amount * rate + "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
