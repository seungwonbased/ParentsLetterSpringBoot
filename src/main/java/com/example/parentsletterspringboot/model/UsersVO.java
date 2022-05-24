package com.example.parentsletterspringboot.model;

public class UsersVO {

    private String id;
    private String pw;
    private String phone;
    private String name;
    private int isTeacher;

    public UsersVO(String id, String pw, String phone, String name, int isTeacher) {
        this.id = id;
        this.pw = pw;
        this.phone = phone;
        this.name = name;
        this.isTeacher = isTeacher;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsTeacher() {
        return isTeacher;
    }

    public void setIsTeacher(int isTeacher) {
        this.isTeacher = isTeacher;
    }

}
