package com.demo.lab1_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans1.xml");

        Employee emp = (Employee) context.getBean("employee");

        emp.display();
    }
}