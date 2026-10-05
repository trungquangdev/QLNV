package com.example.QLNV.repository;

import com.example.QLNV.entity.Employee;

import com.example.QLNV.util.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import java.util.List;

public class EmployeeRepository {
    public List<Employee> getAll(){
        try(Session s = Hibernate.getFactory().openSession()){
            return s.createQuery("from Employee ", Employee.class).list();
        }
    }
    public Employee getOne(Long id){
        try(Session s = Hibernate.getFactory().openSession()){
            return s.find(Employee.class, id);
        }
    }
    public void add(Employee e){
        try(Session s = Hibernate.getFactory().openSession()){

        }
    }
    public void update(Employee e){
        try(Session s = Hibernate.getFactory().openSession()){

        }
    }
    public void delete(Long id){
        try(Session s = Hibernate.getFactory().openSession()){

        }
    }
    public List<Employee> search(){
        try(Session s = Hibernate.getFactory().openSession()){

        }
        return null;
    }
}
