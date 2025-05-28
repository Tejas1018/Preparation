package com.LLD.DesignPatterns.Builder;

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
