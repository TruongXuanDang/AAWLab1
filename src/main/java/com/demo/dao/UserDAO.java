package com.demo.dao;

import com.demo.entity.UserA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UserDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public UserDAO() {
    }

    public void insertUser(UserA p)
    {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }


    public List<UserA> getUser()
    {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<UserA> list = em.createQuery("SELECT c from UserA c", UserA.class).getResultList();

        em.getTransaction().commit();
        em.close();
        return list;
    }
}
