package com.example.QLNV.util;

import com.example.QLNV.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class Hibernate {
    private static final SessionFactory FACTORY;

    static {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Employee.class);
        Properties properties = new Properties();
        properties.put(
                Environment.DIALECT,
                "org.hibernate.dialect.SQLServer2016Dialect"
        );

        // JDBC Driver của SQL Server
        properties.put(
                Environment.DRIVER,
                "com.microsoft.sqlserver.jdbc.SQLServerDriver"
        );
        properties.put(
                Environment.URL,
                "jdbc:sqlserver://localhost:1433;"
                        + "databaseName=QuanLyNhanVien;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
        );

        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "123");
        properties.put(Environment.SHOW_SQL, "true");
        configuration.setProperties(properties);
        ServiceRegistry serviceRegistry =
                new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties())
                        .build();
        FACTORY = configuration.buildSessionFactory(serviceRegistry);
    }


    public static SessionFactory getFACTORY() { return FACTORY; }
    public static void main(String[] args) {
        try (Session session = getFACTORY().openSession()) {
            System.out.println(">>> KẾT NỐI HIBERNATE THÀNH CÔNG! <<<");
        } catch (Exception e) {
            System.out.println(">>> KẾT NỐI THẤT BẠI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
