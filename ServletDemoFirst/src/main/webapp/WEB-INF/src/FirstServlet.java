import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 使FirstServlet類繼承自HttpServlet
public class FirstServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init method is called...");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        System.out.println("service method is called...");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("destroy method is called...");
    }

    /** Handle the HTTP GET method.
     * @param req servlet request
     * @param resp servlet response
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        java.io.PrintWriter out = resp.getWriter();
        // output your page here
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Serlvet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Hello, Java Servlets");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
