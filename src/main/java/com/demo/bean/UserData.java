package com.demo.bean;

import com.demo.dao.UserDAO;
import com.demo.entity.UserA;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "userData", eager = true)
@RequestScoped
public class UserData implements Serializable {

    UserDAO dao = new UserDAO();

    public List<UserA> getUsers() {
        List<UserA> listUser = dao.getUser();
        return listUser;
    }

    public String addUser(UserA user)
    {
        dao.insertUser(user);
        return "userList?faces-redirect=true";
    }
}
