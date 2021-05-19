package ge.edu.btu.Avtandili_Gachechiladze_davaleba_2.Avtandili_Gachechiladze_weather;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "weather-by-name", value = "/weather-by-name")
public class WeatherByName extends HttpServlet {
    private String message;

    public void init() {
        message = WeatherApp.getStudent("Tbilisi").toString();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}