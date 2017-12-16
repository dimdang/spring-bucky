package com.bucky.crazy.services.UserServiceImp;

import com.bucky.crazy.model.core.AbstractEntities;
import com.bucky.crazy.repositories.EntityDao;
import com.bucky.crazy.services.EntityService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dang Dim
 * Date     : 12-Dec-17, 5:06 PM
 * Email    : d.dim@gl-f.com
 */
@Service
public abstract class AbstractEntityService implements EntityService {

    public abstract EntityDao getDao();

    @Override
    public SessionFactory getSessionFactory() {
        return getDao().getSessionFactory();
    }

    @Override
    public Session getCurrentSession() {
        return getDao().getCurrentSession();
    }

    @Override
    public Connection getConnection() throws SQLException {
        return getDao().getConnection();
    }

    @Override
    public <T> T getEntityById(Long id, Class<T> tClass) {
        return getDao().getEntityById(id, tClass);
    }

    @Override
    public <T> T loadEntityById(Long id, Class<T> clazz) {
        return getDao().loadEntityById(id, clazz);
    }

    @Override
    public <T> List<T> list(Class<T> tClass) {
        return getDao().list(tClass);
    }

    @Override
    public <T extends AbstractEntities> void save(T entity) {
        getDao().save(entity);
    }

    @Override
    public <T extends AbstractEntities> void update(T entity) {
        getDao().update(entity);
    }

    @Override
    public <T> void saveUpdate(T entity) {
        getDao().saveUpdate(entity);
    }

    @Override
    public <T extends AbstractEntities> void save(List<T> list) {
        getDao().save(list);
    }

    @Override
    public <T extends AbstractEntities> void update(List<T> list) {
        getDao().update(list);
    }

    @Override
    public <T> void saveUpdate(List<T> list) {
        getDao().saveUpdate(list);
    }

    @Override
    public <T> void delete(T entity) {
        getDao().delete(entity);
    }

    @Override
    public <T> List<T> getList(String sql, Class<T> tClass) {
        return getDao().getList(sql, tClass);
    }

    @Override
    public int exCuteSQL(String sql) {
        return getDao().exCuteSQL(sql);
    }
}
