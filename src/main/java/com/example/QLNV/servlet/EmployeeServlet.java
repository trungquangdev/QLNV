package com.example.QLNV.servlet;

import com.example.QLNV.repository.EmployeeRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "EmployeeServlet", urlPatterns = {
        "/e/show",
        "/e/detail",
        "/e/add",
        "/e/update",
        "/e/remove",
        "/e/search"
})
public class EmployeeServlet extends HttpServlet {
private EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("/e/show")){
            this.showEmployee(req,resp);
        }
    }

    private void showEmployee(HttpServletRequest req, HttpServletResponse resp) {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
