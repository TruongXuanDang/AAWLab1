package com.demo.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class User implements Serializable {
    private String userName;
    private String password;
    private String gender;

    public User() {
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
