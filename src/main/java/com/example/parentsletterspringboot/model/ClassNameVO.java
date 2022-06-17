package com.example.parentsletterspringboot.model;

public class ClassNameVO {

    private String className;

    public ClassNameVO(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ClassNameVO{" +
                "className='" + className + '\'' +
                '}';
    }

}
