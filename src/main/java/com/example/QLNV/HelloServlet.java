package com.example.QLNV;

import java.io.*;

import com.example.QLNV.util.Hibernate;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.hibernate.Session;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try(Session session = Hibernate.getFactory().openSession()){
            System.out.println("sucsess");
        }catch(Exception e){
            System.out.println("faild");
        }
    }

    public void destroy() {
    }
}