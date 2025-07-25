package com.prep.DesignPatterns.ProtoType;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String,Student> studentRegistry = new HashMap<>();

    public void register(String key,Student student){
        studentRegistry.put(key,student);
    }

    public Student getStudent(String key){
        return studentRegistry.get(key);
    }
}
