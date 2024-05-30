package com.study.java_study.ch14_Object;

import java.util.Objects;

public class Student {

    //변수
    private String name;
    private int age;

    //생성자
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter and setter

    //equals
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj.getClass() == this.getClass()) {
            Student student = (Student) obj;
            return Objects.equals(student.name, name) && Objects.equals(student.age, age);
        }
        return false;
    }

    //hashcode
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age +
                '}';
    }
}
