package com.prep.DesignPatterns.ProtoType;

public class Student implements Prototype<Student> {

    private String name;
    private int age;
    private String address;
    private double avgPSP;
    private String collegeName;
    private String batchName;

    //copy constructor
    Student (Student student){
        this.name = student.name;
        this.age = student.age;
        this.address = student.address;
        this.avgPSP = student.avgPSP;
        this.collegeName = student.collegeName;
        this.batchName = student.batchName;
    }
    Student(){

    }
    @Override
    public Student clone() {
        return new Student(this);
    }


    public double getAvgPSP() {
        return avgPSP;
    }

    public void setAvgPSP(double avgPSP) {
        this.avgPSP = avgPSP;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

}
