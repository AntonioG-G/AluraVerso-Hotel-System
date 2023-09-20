package com.mx.antonioguerrero.aluraverso.model;

public class Users {
    private Integer id;
    private String uname;
    private String password;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Users(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
