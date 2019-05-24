package com.java.spring;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO{


    // datasource for connection
     public void setDataSource(DataSource ds);

    //create method for insertion
    public void create(String name, Integer age);

    // method for fetching a record
    public Student getStudent(Integer id);

    // method for fetching a list of records
    public List<Student> getStudentList();

    //delete method for deletion
    public void delete(Integer id);
}