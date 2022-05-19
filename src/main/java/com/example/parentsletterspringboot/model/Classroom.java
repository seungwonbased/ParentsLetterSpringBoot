package com.example.parentsletterspringboot.model;

public class Classroom {

    private int classId;
    private String className;
    private String tName;
    private String tId;

    public Classroom(int classId, String className, String tName, String tId) {
        super();
        this.classId = classId;
        this.className = className;
        this.tName = tName;
        this.tId = tId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
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

    public String getTId() {
        return tId;
    }

    public void setTId(String tId) {
        this.tId = tId;
    }
}
