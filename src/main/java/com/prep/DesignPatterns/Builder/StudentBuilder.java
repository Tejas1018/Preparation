package com.LLD.DesignPatterns.Builder;

import java.util.List;

public abstract class StudentBuilder {
    int rollNo;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    StudentBuilder setRollNo(int rollNo){
        this.rollNo = rollNo;
        return this;
    }

    StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    StudentBuilder setfatherName(String fatherName){
        this.fatherName = fatherName;
        return this;
    }

    StudentBuilder setMotherName(String motherName){
        this.motherName = motherName;
        return this;
    }
    abstract public StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }

}
