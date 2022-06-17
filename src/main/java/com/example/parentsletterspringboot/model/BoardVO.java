package com.example.parentsletterspringboot.model;

public class BoardVO {

    private int postNum;
    private String postName;
    private String postBody;

    public BoardVO(int postNum, String postName, String postBody) {
        this.postNum = postNum;
        this.postName = postName;
        this.postBody = postBody;
    }

    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "postNum=" + postNum +
                ", postName='" + postName + '\'' +
                ", postBody='" + postBody + '\'' +
                '}';
    }
}
