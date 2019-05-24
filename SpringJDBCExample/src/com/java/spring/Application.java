package com.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {

    public static  void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

        System.out.println("------Records Creation--------" );
        studentJDBCTemplate.create("jkl", 11);
        studentJDBCTemplate.create("mno", 2);
        studentJDBCTemplate.create("pqr", 15);

        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.getStudentList();

        for(Student st : students){
            System.out.print("id:"+ st.getId());
            System.out.print((" name:"+ st.getName()));
            System.out.println(" age:"+ st.getAge());
        }

        System.out.println("------Listing Specific Records--------" );
        Student st = studentJDBCTemplate.getStudent(1);
        System.out.print("id:"+ st.getId());
        System.out.print((" name:"+ st.getName()));
        System.out.println(" age:"+ st.getAge());


    }
}
