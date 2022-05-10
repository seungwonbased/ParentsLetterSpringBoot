package com.example.parentsletterspringboot.model;

public class Classroom {

    private String classId;
    private String className;
    private String tName;

    public Classroom(String classId, String className, String tName) {
        super();
        this.classId = classId;
        this.className = className;
        this.tName = tName;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTName() {
        return tName;
    }

    public void setTName(String tName) {
        this.tName = tName;
    }
}
