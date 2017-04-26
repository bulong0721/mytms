package org.mytms.common.dao;

import org.mytms.common.GenericEntity;
import org.mytms.common.data.Page;
import org.mytms.common.data.Pageable;
import org.mytms.common.data.Sort;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;


/**
 * @param <E> type entity
 */
public interface GenericEntityDao<K extends Serializable & Comparable<K>, E extends GenericEntity<K, ?>> {

    EntityManager getEntityManager();

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

    <T> void update(T entity);

    <T> void save(T entity);

    <T> void delete(T entity);

    <T> T refresh(T entity);

    E getEntity(Class<? extends E> clazz, K id);

    E getById(K id);
}
