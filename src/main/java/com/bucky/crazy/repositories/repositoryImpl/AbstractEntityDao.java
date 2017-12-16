package com.bucky.crazy.repositories.repositoryImpl;

import com.bucky.crazy.model.core.AbstractEntities;
import com.bucky.crazy.repositories.EntityDao;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dang Dim
 * Date     : 12-Dec-17, 4:23 PM
 * Email    : d.dim@gl-f.com
 */
public abstract class AbstractEntityDao implements EntityDao {

    @Autowired
    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Connection getConnection() throws SQLException {
        return getSessionFactory().getSessionFactoryOptions().getServiceRegistry().getService(ConnectionProvider.class).getConnection();
    }

    @Override
    public <T> T getEntityById(Long id, Class<T> tClass) {
        T bean = null;
        if (id != null && id > 0 && tClass != null){
            bean = getCurrentSession().get(tClass, id);
        }
        return bean;
    }

    @Override
    public <T> T loadEntityById(Long id, Class<T> clazz) {
        T bean = null;
        if (id != null && id > 0 && clazz != null){
            bean = getCurrentSession().get(clazz, id);
        }
        return bean;
    }

    @Override
    public <T> List<T> list(Class<T> tClass) {
        if (tClass != null){
            Criteria criteria = getCurrentSession().createCriteria(tClass);
            criteria.addOrder(Order.asc("updateDate"));
            return criteria.list();
        }
        return null;
    }

    @Override
    public <T extends AbstractEntities> void save(T entity) {
        if (entity != null && entity.getId() == null){
            getCurrentSession().save(entity);
        }
    }

    @Override
    public <T extends AbstractEntities> void update(T entity) {
        if (entity != null && entity.getId() != null){
            getCurrentSession().update(entity);
        }
    }

    @Override
    public <T> void saveUpdate(T entity) {
        if (entity != null){
            getCurrentSession().saveOrUpdate(entity);
        }
    }

    @Override
    public <T extends AbstractEntities> void save(List<T> list) {
        if (list !=null && !list.isEmpty()){
            for (T entity : list){
                save(entity);
            }
        }
    }

    @Override
    public <T extends AbstractEntities> void update(List<T> list) {
        if (list != null && !list.isEmpty()){
            for (T entity : list){
                update(entity);
            }
        }
    }

    @Override
    public <T> void saveUpdate(List<T> list) {
        if (list != null && !list.isEmpty()){
            for (T entity : list){
                saveUpdate(entity);
            }
        }
    }

    @Override
    public <T> void delete(T entity) {
        if (entity != null){
            getCurrentSession().delete(entity);
        }
    }

    @Override
    public <T> List<T> getList(String sql, Class<T> tClass) {
        return entityManager.createNativeQuery(sql, tClass).getResultList();
    }

    @Override
    public int exCuteSQL(String sql) {
        if (sql != null && !sql.isEmpty()){
            return getCurrentSession().createSQLQuery(sql).executeUpdate();
        }
        return 0;
    }
}
