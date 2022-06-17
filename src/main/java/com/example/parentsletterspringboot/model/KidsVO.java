package com.example.parentsletterspringboot.model;

public class KidsVO {

    private int kidsId;
    private String kidsName;
    private int classId;

    public KidsVO(int kidsId, String kidsName, int classId) {
        this.kidsId = kidsId;
        this.kidsName = kidsName;
        this.classId = classId;
    }

    public int getKidsId() {
        return kidsId;
    }

    public void setKidsId(int kidsId) {
        this.kidsId = kidsId;
    }

    public String getKidsName() {
        return kidsName;
    }

    public void setKidsName(String kidsName) {
        this.kidsName = kidsName;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "KidsVO{" +
                "kidsId=" + kidsId +
                ", kidsName='" + kidsName + '\'' +
                ", classId=" + classId +
                '}';
    }
}
