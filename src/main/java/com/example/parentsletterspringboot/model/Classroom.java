package com.example.parentsletterspringboot.model;

public class Classroom {

    private String classId;
    private String className;
    private String teacherInCharge;

    public Classroom(String classId, String className, String teacherInCharge) {
        super();
        this.classId = classId;
        this.className = className;
        this.teacherInCharge = teacherInCharge;
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

    public String getTeacherInCharge() {
        return teacherInCharge;
    }

    public void setTeacherInCharge(String teacherInCharge) {
        this.teacherInCharge = teacherInCharge;
    }
}
