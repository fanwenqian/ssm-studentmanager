package com.fan.entity;

import java.util.Date;

/**
 * Student 实体类
 *
 * @author fanwenqian
 * @create: 2019-04-23-下午 13:34
 */
public class Student {

    private int id;
    private int studentId;
    private String name;
    private int age;
    private String sex;
    private Date birthday;

    /* getter and setter */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}


