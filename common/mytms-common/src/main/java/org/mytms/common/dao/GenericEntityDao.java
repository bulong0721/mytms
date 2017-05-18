package org.mytms.common.dao;

import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;
import org.mytms.common.GenericEntity;
import org.mytms.common.data.Page;
import org.mytms.common.data.Pageable;
import org.mytms.common.data.Sort;

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

    <S extends E> S save(S entity);

    <S extends E> List<S> save(Iterable<S> entities);

    <S extends E> S saveAndFlush(S entity);

    void delete(E entity);

    void delete(Iterable<? extends E> entities);

    E refresh(E entity);

    E getEntity(Class<? extends E> clazz, K id);

    E getById(K id);
}
