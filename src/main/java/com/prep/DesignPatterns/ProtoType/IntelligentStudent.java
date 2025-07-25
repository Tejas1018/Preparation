package com.prep.DesignPatterns.ProtoType;

public class IntelligentStudent extends Student{
    private double iq;
    IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }
    IntelligentStudent(){

    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

    public void setIq(double iq) {
        this.iq = iq;
    }

    public double getIq() {
        return iq;
    }
}
