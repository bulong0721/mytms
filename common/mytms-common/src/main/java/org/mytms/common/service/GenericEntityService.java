package org.mytms.common.service;

import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;
import org.mytms.common.GenericEntity;
import org.mytms.common.data.Page;
import org.mytms.common.data.Pageable;
import org.mytms.common.data.Sort;
import org.mytms.common.exception.ServiceException;

import java.io.Serializable;
import java.util.List;

public interface GenericEntityService<K extends Serializable & Comparable<K>, E extends GenericEntity<K, ?>> extends TransactionalAspectAware {

    <S extends E> S update(S entity) throws ServiceException;

    <S extends E> List<S> update(Iterable<S> entities) throws ServiceException;

    <S extends E> S updateAndFlush(S entity) throws ServiceException;

    void remove(E entity) throws ServiceException;

    void remove(Iterable<? extends E> entities) throws ServiceException;

    void create(E entity) throws ServiceException;

    E refresh(E entity);

    E findById(K id);

    List<E> list();

    E getEntity(Class<? extends E> clazz, K id);

    void flush();

    void clear();

    E findOne(Predicate predicate);

    List<E> findAll(Predicate predicate);

    List<E> findAll(Predicate predicate, OrderSpecifier<?>... orders);

    List<E> findAll(Predicate predicate, Sort sort);

    List<E> findAll(OrderSpecifier<?>... orders);

    Page<E> findAll(Predicate predicate, Pageable pageable);

    long count(Predicate predicate);

    boolean exists(Predicate predicate);

}
