package com.prep.DesignPatterns.ProtoType;

public class Client {

    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student apr23BeginnerBatch = new Student();
        apr23BeginnerBatch.setBatchName("Apr23 Beginner Batch");
        apr23BeginnerBatch.setCollegeName("Scaler");
        apr23BeginnerBatch.setAvgPSP(70.0);
        studentRegistry.register("apr23Beginner", apr23BeginnerBatch);

        IntelligentStudent apr23IntelligentStudent = new IntelligentStudent();
        apr23IntelligentStudent.setBatchName("Apr23 Beginner Batch");
        apr23IntelligentStudent.setAvgPSP(70.0);
        apr23IntelligentStudent.setIq(160);
        apr23IntelligentStudent.setCollegeName("Scaler");
        studentRegistry.register("apr23Intelligent", apr23IntelligentStudent);
    }


    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student teja = studentRegistry.getStudent("apr23Beginner").clone();
        teja.setName("Teja");
        teja.setAge(22);
        teja.setAddress("Hyderabad");

        Student intelligentTeja = studentRegistry.getStudent("apr23Intelligent").clone();
        intelligentTeja.setName("Intelligent Teja");
        intelligentTeja.setAge(22);
        intelligentTeja.setAddress("Hyderabad");

        System.out.println("Teja's Details:");
        System.out.println("Name: " + teja.getName());
        System.out.println("Age: " + teja.getAge());
        System.out.println("Address: " + teja.getAddress());
        System.out.println("Avg PSP: " + teja.getAvgPSP());
        System.out.println("College Name: " + teja.getCollegeName());
        System.out.println("Batch Name: " + teja.getBatchName());
        System.out.println("\nIntelligent Teja's Details:");
        System.out.println("Name: " + intelligentTeja.getName());
        System.out.println("Age: " + intelligentTeja.getAge());
        System.out.println("Address: " + intelligentTeja.getAddress());
        System.out.println("Avg PSP: " + intelligentTeja.getAvgPSP());
        System.out.println("College Name: " + intelligentTeja.getCollegeName());
        System.out.println("Batch Name: " + intelligentTeja.getBatchName());
        System.out.println("IQ: " + ((IntelligentStudent) intelligentTeja).getIq());
        System.out.println("--------------------------------------------------");
        System.out.println("Prototype Pattern Example Completed Successfully!");

    }
}
