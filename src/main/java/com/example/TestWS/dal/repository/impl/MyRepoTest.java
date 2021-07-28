/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.TestWS.dal.repository.impl;

import com.example.TestWS.dal.model.GnrUsr;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public class MyRepoTest {

    @Autowired
    SessionFactory sessionFactory;
    Session session;

    public void add(List<GnrUsr> users) {
        session = sessionFactory.openSession();
        Transaction trx = session.beginTransaction();
        for (int i = 0; i < users.size(); i++) {
            if(i > 0 && i%1000==0){
                session.flush();
                session.clear();
            }
            session.save(users.get(i));
            System.out.println(users.get(i).toString());
        }
        trx.commit();
        session.close();
    }

    public GnrUsr addOneUser(GnrUsr user) {
        Session ses = getCurrentSession();
        Transaction tx = ses.beginTransaction();
                ses.persist(user);
                tx.commit();
                ses.close();
                
        return user;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getCurrentSession() {
        return this.getSessionFactory().getCurrentSession();
    }
}
