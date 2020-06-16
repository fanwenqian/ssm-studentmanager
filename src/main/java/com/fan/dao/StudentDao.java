package com.fan.dao;

import com.fan.entity.Student;

import java.util.List;

/**
 * @author fanwenqian
 */
public interface StudentDao {
    int getTotal();
    void addStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
    Student getStudent(int id);
    List<Student> list(int start, int count);
}
