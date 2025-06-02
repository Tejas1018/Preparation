package com.prep.DesignPatterns.Builder;

import java.util.List;


//Problem Statement

public class Student {

    int rollNo;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;


    public Student(StudentBuilder studentBuilder) {
        this.rollNo = studentBuilder.rollNo;
        this.name = studentBuilder.name;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }

    @Override
    public String toString() {
        return "rollNo: " + this.rollNo + "Name: " + this.name
                + "FatherName: " + this.fatherName + "MotherName: " + this.motherName
                + "Subjects: " + subjects.get(0) + subjects.get(1) + subjects.get(2);
    }
}

//Let's say rollNo is the mandatory field and remaining are optional
// but when we want to create an object we have some issues
//Need to create a big constructor or small chunks of constructors with mandatory feilds
//Or let's say some might need only (rollNo,name) or (rollNo,fatherName,motherName)
// We need to create multiple constructors

// To overcome this issue

//Need to create a builder object for each attribute and use whenever required