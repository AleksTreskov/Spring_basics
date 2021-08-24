package com.example.gbee1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ProductsList", value = "/products-list")
public class Product extends HttpServlet {
    private int id;
    private String title;
    private int cost;
    private Product[] products;

    public Product() {
    }

    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public void init() {


    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        products = new Product[10];
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product(i + 1, "Product" + (i + 1), (int) (Math.random() * 100));
        }
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        for (Product product : products
        ) {
            out.println("<h1>" + product.toString() + "</h1>");
        }
        out.println("</body></html>");
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", cost=" + getCost() +
                '}';
    }
}
