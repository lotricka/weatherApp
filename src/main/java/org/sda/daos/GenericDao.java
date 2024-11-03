package org.sda.daos;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.sda.util.HibernateUtil;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

public class GenericDao<T, ID extends Serializable> {
    private final Class<T> entityType;

    public GenericDao(Class<T> entityType) {
        this.entityType = entityType;
    }

    public void save(T entity) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        }
    }

    public T getById(ID id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(entityType, id);
        }
    }
//
//    public List<T> getAll(){
//        try(Session session = HibernateUtil.getSessionFactory().)
//        Query<T> query = session.createQuery("from " + entityType.getName(), entityType);
//        return query.getResultList();
//    }


    public void update(T entity){
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(entity);
            transaction.commit();
        }
    }
    public void delete(T entity){
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(entity);
            transaction.commit();
        }
    }}