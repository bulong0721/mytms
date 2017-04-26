package org.mytms.common.service;

import org.mytms.common.GenericEntity;
import org.mytms.common.dao.GenericEntityDao;
import org.mytms.common.data.Page;
import org.mytms.common.data.Pageable;
import org.mytms.common.data.Sort;
import org.mytms.common.exception.ServiceException;
import org.mytms.common.util.GenericEntityUtil;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;

import java.io.Serializable;
import java.util.List;

/**
 *
 */
public abstract class GenericEntityServiceImpl<K extends Serializable & Comparable<K>, E extends GenericEntity<K, ?>>
        implements GenericEntityService<K, E> {

    private Class<E> objectClass;

    private GenericEntityDao<K, E> genericDao;

    @SuppressWarnings("unchecked")
    public GenericEntityServiceImpl(GenericEntityDao<K, E> genericDao) {
        this.genericDao = genericDao;

        this.objectClass = (Class<E>) GenericEntityUtil.getEntityClass(getClass());
    }

    public E getEntity(Class<? extends E> clazz, K id) {
        return genericDao.getEntity(clazz, id);
    }

    public E findById(K id) {
        return genericDao.getById(id);
    }

    public void save(E entity) throws ServiceException {
        genericDao.save(entity);
    }

    public void create(E entity) throws ServiceException {
        createEntity(entity);
    }

    protected void createEntity(E entity) throws ServiceException {
        save(entity);
    }

    public void update(E entity) throws ServiceException {
        updateEntity(entity);
    }

    protected void updateEntity(E entity) throws ServiceException {
        genericDao.update(entity);
    }

    public void delete(E entity) throws ServiceException {
        genericDao.delete(entity);
    }

    public void flush() {
        genericDao.flush();
    }

    public void clear() {
        genericDao.clear();
    }

    public E refresh(E entity) {
        return genericDao.refresh(entity);
    }

    public List<E> list() {
        return genericDao.findAll();
    }

    @Override
    public E findOne(Predicate predicate) {
        return genericDao.findOne(predicate);
    }

    @Override
    public List<E> findAll(Predicate predicate) {
        return genericDao.findAll(predicate);
    }

    @Override
    public List<E> findAll(Predicate predicate, OrderSpecifier<?>[] orders) {
        return genericDao.findAll(predicate, orders);
    }

    @Override
    public List<E> findAll(Predicate predicate, Sort sort) {
        return genericDao.findAll(predicate, sort);
    }

    @Override
    public List<E> findAll(OrderSpecifier<?>[] orders) {
        return genericDao.findAll(orders);
    }

    @Override
    public Page<E> findAll(Predicate predicate, Pageable pageable) {
        return genericDao.findAll(predicate, pageable);
    }

    @Override
    public long count(Predicate predicate) {
        return genericDao.count(predicate);
    }

    @Override
    public boolean exists(Predicate predicate) {
        return genericDao.exists(predicate);
    }
}