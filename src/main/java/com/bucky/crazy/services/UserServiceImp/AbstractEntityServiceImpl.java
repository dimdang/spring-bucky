package com.bucky.crazy.services.UserServiceImp;

import com.bucky.crazy.model.core.AbstractEntities;
import com.bucky.crazy.repositories.RepositoryEntity;
import com.bucky.crazy.services.AbstractService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dang Dim
 * Date     : 12-Dec-17, 5:06 PM
 * Email    : d.dim@gl-f.com
 */
public class AbstractEntityServiceImpl implements AbstractService {

    public RepositoryEntity rptEntity;

    @Override
    public SessionFactory getSessionFactory() {
        return rptEntity.getSessionFactory();
    }

    @Override
    public Session getCurrentSession() {
        return rptEntity.getCurrentSession();
    }

    @Override
    public Connection getConnection() throws SQLException {
        return rptEntity.getConnection();
    }

    @Override
    public <T> T getEntityById(Long id, Class<T> tClass) {
        return rptEntity.getEntityById(id, tClass);
    }

    @Override
    public <T> T loadEntityById(Long id, Class<T> clazz) {
        return rptEntity.loadEntityById(id, clazz);
    }

    @Override
    public <T> List<T> list(Class<T> tClass) {
        return rptEntity.list(tClass);
    }

    @Override
    public <T extends AbstractEntities> void save(T entity) {
        rptEntity.save(entity);
    }

    @Override
    public <T extends AbstractEntities> void update(T entity) {
        rptEntity.update(entity);
    }

    @Override
    public <T> void saveUpdate(T entity) {
        rptEntity.saveUpdate(entity);
    }

    @Override
    public <T extends AbstractEntities> void save(List<T> list) {
        rptEntity.save(list);
    }

    @Override
    public <T extends AbstractEntities> void update(List<T> list) {
        rptEntity.update(list);
    }

    @Override
    public <T> void saveUpdate(List<T> list) {
        rptEntity.saveUpdate(list);
    }

    @Override
    public <T> void delete(T entity) {
        rptEntity.delete(entity);
    }

    @Override
    public <T> List<T> getList(String sql, Class<T> tClass) {
        return rptEntity.getList(sql, tClass);
    }

    @Override
    public int exCuteSQL(String sql) {
        return rptEntity.exCuteSQL(sql);
    }
}
