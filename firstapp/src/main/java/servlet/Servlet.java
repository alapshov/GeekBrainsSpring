package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "src.main.webapp.Servlet", urlPatterns = "/product")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = Arrays.asList(
                new Product(1, "Продукт 1", 50.0),
                new Product(2, "Продукт 2", 120.0),
                new Product(3, "Продукт 3", 130.0),
                new Product(4, "Продукт 4", 140.0),
                new Product(5, "Продукт 5", 150.0),
                new Product(6, "Продукт 6", 160.0),
                new Product(7, "Продукт 7", 170.0),
                new Product(8, "Продукт 8", 180.0),
                new Product(9, "Продукт 9", 190.0),
                new Product(10, "Продукт 10", 100.0)
        );
        for (Product product : products) {
            resp.getWriter().println("|ProductId: " + product.getId() + " | " + "Title: " + product.getTitle() + " | " + "Cost: " +product.getCost());
        }

    }

}