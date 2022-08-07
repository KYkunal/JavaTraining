package com.globallogic_04_08.MyMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student student1=(Student)context.getBean("student1");
        System.out.println(student1);
        
        Employe employee1=(Employe)context.getBean("emp1");
        System.out.println(employee1);
    }
}
