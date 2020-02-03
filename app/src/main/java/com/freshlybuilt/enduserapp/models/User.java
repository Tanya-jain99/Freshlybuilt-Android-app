package com.freshlybuilt.enduserapp.models;

public class User {
    private int id;
    private String email,username;


    public User(int id, String email, String username) {
        this.id = id;
        this.email = email;
        this.username = username;
    }

    public int getId(){
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }
}
