package com.vishnu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = applicationContext.getBean("service", Service.class);
        System.out.print(service.findCustomerAll().get(0).getFirstName());


    }
}
