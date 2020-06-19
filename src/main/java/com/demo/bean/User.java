package com.demo.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class User implements Serializable {
    private String userName;
    private String password;
    private String gender;
    private List<User> listUser;

    public User() {
    }

    public User(String userName, String password, String gender) {
        this.userName = userName;
        this.password = password;
        this.gender = gender;
    }

    public List<User> getListUser(){
        List<User> list = new ArrayList<User>();
        list.add(new User("Nguyen Van A","123","Male"));
        return list;
    }

    public String goProduct(){
        checkPassword();
        return "product?faces-redirect=true";
    }

    public boolean checkPassword()
    {
        return true;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
