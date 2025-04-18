package com.LLD.DesignPatterns.BuilderDesignPattern;

public class Director {

    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        //if(studentBuilder instanceof StudentBuilder)
        return null;
    }


}
