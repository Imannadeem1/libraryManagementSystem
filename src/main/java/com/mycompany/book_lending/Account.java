/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_management;

/**
 *
 * @author lenovo
 */
public class Account {
    private String name;
    private String gender;
    private String email;
    private String user_id;
    private String password;
    private long phone_no;

    public Account(String name, String gender, String email, String user_id, String password, long phone_no) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.user_id = user_id;
        this.password = password;
        this.phone_no = phone_no;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }
    
    public void login(String user_id,String password )
    {
        
    }
    public void logout()
    {
        
    }
    public void signup(String user_id,String password,String email,long phone_no,String gender)
    {
        
    }
    
    
}

    
    
    

