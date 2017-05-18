package org.mytms.common.dao;

import com.querydsl.core.types.EntityPath;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.PathBuilder;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.AbstractJPAQuery;
import org.mytms.common.GenericEntity;
import org.mytms.common.dao.querydsl.QSort;
import org.mytms.common.dao.querydsl.Querydsl;
import org.mytms.common.data.Page;
import org.mytms.common.data.PageUtil;
import org.mytms.common.data.Pageable;
import org.mytms.common.data.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin.Xu on 2017/4/13.
 */
@Repository("queryDslDao")
@Transactional
public class QuerydslJpaDaoSupport<K extends Serializable & Comparable<K>, E extends GenericEntity<K, ?>> {
    private static final String ID_MUST_NOT_BE_NULL = "The given id must not be null!";
    @PersistenceContext
    protected EntityManager entityManager;
    protected final EntityPath<E> entityPath;
    private Querydsl querydsl;

    public QuerydslJpaDaoSupport(EntityPath<E> entityPath) {
        this.entityPath = entityPath;
        PathBuilder<E> builder = new PathBuilder<E>(entityPath.getType(), entityPath.getMetadata());

    }

    protected Querydsl getQuerydsl() {
        if (null == querydsl) {
            synchronized (this) {
                querydsl = new Querydsl(getEntityManager());
            }
        }
        return querydsl;
    }

    public void flush() {
        getEntityManager().flush();
    }

    public void clear() {
        getEntityManager().clear();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public E findOne(Predicate predicate) {
        return createQuery(predicate).select(entityPath).fetchOne();
    }

    public List<E> findAll(Predicate predicate) {
        return createQuery(predicate).select(entityPath).fetch();
    }

    public List<E> findAll(Predicate predicate, OrderSpecifier<?>... orders) {
        return executeSorted(createQuery(predicate).select(entityPath), orders);
    }

    public List<E> findAll(Predicate predicate, Sort sort) {
        Assert.notNull(sort, "Sort must not be null!");
        return executeSorted(createQuery(predicate).select(entityPath), sort);
    }

    public List<E> findAll(OrderSpecifier<?>... orders) {
        Assert.notNull(orders, "Order specifiers must not be null!");
        return executeSorted(createQuery().select(entityPath), orders);
    }

    public Page<E> findAll(Predicate predicate, Pageable pageable) {
        Assert.notNull(pageable, "Pageable must not be null!");
        final JPQLQuery<?> countQuery = createCountQuery(predicate);
        JPQLQuery<E> query = getQuerydsl().applyPagination(pageable, createQuery(predicate).select(entityPath));

        return PageUtil.getPage(query.fetch(), pageable, () -> countQuery.fetchCount());
    }

    public long count(Predicate predicate) {
        return createQuery(predicate).fetchCount();
    }

    public boolean exists(Predicate predicate) {
        return createQuery(predicate).fetchCount() > 0;
    }

    protected JPQLQuery<?> createQuery(Predicate... predicate) {
        AbstractJPAQuery<?, ?> query = getQuerydsl().createQuery(entityPath).where(predicate);
        return query;
    }

    protected JPQLQuery<?> createCountQuery(Predicate predicate) {
        return getQuerydsl().createQuery(entityPath).where(predicate);
    }

    private List<E> executeSorted(JPQLQuery<E> query, OrderSpecifier<?>... orders) {
        return executeSorted(query, new QSort(orders));
    }

    private List<E> executeSorted(JPQLQuery<E> query, Sort sort) {
        return getQuerydsl().applySorting(sort, query).fetch();
    }

    public void delete(E entity) {
        Assert.notNull(entity, "The entity must not be null!");
        getEntityManager().remove(getEntityManager().contains(entity) ? entity : getEntityManager().merge(entity));
    }

    public void delete(Iterable<? extends E> entities) {
        Assert.notNull(entities, "The given Iterable of entities not be null!");
        for (E entity : entities) {
            delete(entity);
        }
    }

    public <S extends E> S save(S entity) {
        if (entity.isNew()) {
            getEntityManager().persist(entity);
            return entity;
        } else {
            return getEntityManager().merge(entity);
        }
    }

    public <S extends E> S saveAndFlush(S entity) {
        S result = save(entity);
        flush();
        return result;
    }

    public <S extends E> List<S> save(Iterable<S> entities) {
        List<S> result = new ArrayList<S>();
        if (entities == null) {
            return result;
        }
        for (S entity : entities) {
            result.add(save(entity));
        }
        return result;
    }

    public E refresh(E entity) {
        getEntityManager().refresh(entity);

        return entity;
    }

    public E getEntity(Class<? extends E> clazz, K id) {
        return getEntityManager().find(clazz, id);
    }

}
