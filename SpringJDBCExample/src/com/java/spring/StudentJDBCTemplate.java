package com.java.spring;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

public class StudentJDBCTemplate implements StudentDAO{
    private DataSource datasource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource ds) {
        this.datasource = ds;
        this.jdbcTemplate = new JdbcTemplate(ds);
    }

    @Override
    public Student getStudent(Integer id) {
        String sql = "select * from student where id =?";
        Student student = jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Student>(Student.class));
        return student;
    }

    @Override
    public List<Student> getStudentList() {
        String sql = "select * from student";
        List<Student> students = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        return students;
    }

    @Override
    public void create(String name, Integer age) {

        String sql = "insert into student (name,age) values(?, ?)";
        jdbcTemplate.update(sql, name, age);

    }

    @Override
    public void delete(Integer id) {

        String sql = "delete from student where id = ?";
        jdbcTemplate.update(sql, id);
    }
}
