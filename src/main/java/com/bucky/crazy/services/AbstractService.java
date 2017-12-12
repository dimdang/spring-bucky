package com.bucky.crazy.services;

import com.bucky.crazy.model.core.AbstractEntities;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dang Dim
 * Date     : 12-Dec-17, 3:09 PM
 * Email    : d.dim@gl-f.com
 */
public interface AbstractService {

    SessionFactory getSessionFactory();
    Session getCurrentSession();

    Connection getConnection() throws SQLException;

    <T> T getEntityById(Long id , Class<T> tClass);

    <T> T loadEntityById(Long id, Class<T> clazz);

    <T>List<T> list(Class<T> tClass);

    <T extends AbstractEntities> void save(T entity);

    <T extends AbstractEntities> void update(T entity);

    <T> void saveUpdate(T entity);

    <T extends AbstractEntities> void save(List<T> list);

    <T extends AbstractEntities> void update(List<T> list);

    <T> void saveUpdate(List<T> list);

    <T> void delete(T entity);

    <T> List<T> getList(String sql, Class<T> tClass);

    int exCuteSQL(String sql);
}
