package com.demo.lab1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans2.xml");

        Employee emp = (Employee) context.getBean("employee");

        emp.display();
    }
}