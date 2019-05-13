package com.xa.pojo;

public class UserInfo {
    int user_id;
    String user_name;
    String user_pas;
    String user_email;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pas() {
        return user_pas;
    }

    public void setUser_pas(String user_pas) {
        this.user_pas = user_pas;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_pas='" + user_pas + '\'' +
                ", user_email='" + user_email + '\'' +
                '}';
    }
}
