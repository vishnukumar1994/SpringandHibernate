package com.vishnu;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class repositoryImpl implements Repository {

    @Override
    public List<Employee> findCustomerAll() {
        List<Employee>  employee= new ArrayList<Employee>();

        SessionFactory sessionFactory = buildSessionFactory(Employee.class);
        Session session = sessionFactory.openSession();
        Employee employee1 = session.get(Employee.class,1);
        employee.add(employee1);
        session.close();
        sessionFactory.close();
        return employee;
    }
    private static SessionFactory buildSessionFactory(Class clazz)
    {
        return new Configuration().configure().addAnnotatedClass(clazz).buildSessionFactory();
    }



    }


