/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.TestWS.dal.repository;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.eclipse.persistence.config.QueryHints;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HP
 */
public abstract class AbstractRepo<E> implements GeneralRepo<E> {

    @Autowired
    private SessionFactory sessionFactory;
    private Class<E> entityType;

    public AbstractRepo(Class<E> entityType) {
        this.entityType = entityType;
    }

    @Override
    @Transactional
    public E add(E entity) {
        getCurrentSession().persist(entity);
        return entity;
    }

    @Override
    public E update(E entity) {
        getCurrentSession().merge(entity);
        return entity;
    }

    @Override
    public void remove(Integer id) {
        E foundEntity = getCurrentSession().load(entityType, id);
        getCurrentSession().delete(foundEntity);
    }

    @Override
    public E findById(Integer id) {
        return (E) getCurrentSession().get(entityType, id);
    }

    @Override
    public List<E> findList() {
        //getCurrentSession().beginTransaction();
        CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<E> entityCriteriaQuery = criteriaBuilder.createQuery(entityType);
        Root<E> from = entityCriteriaQuery.from(entityType);
        entityCriteriaQuery.select(from); 
        Query<E> cityQuery = getCurrentSession().createQuery(entityCriteriaQuery);
        List<E> entityList = cityQuery.getResultList();
     //   getCurrentSession().getTransaction().commit();
        return entityList;
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
