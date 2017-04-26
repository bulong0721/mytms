package org.mytms.common.dao;

import org.mytms.common.GenericEntity;
import org.mytms.common.util.GenericEntityUtil;
import com.querydsl.core.types.EntityPath;

import java.io.Serializable;

/**
 * @param <K> entity type
 */
public abstract class GenericEntityDaoImpl<K extends Serializable & Comparable<K>, E extends GenericEntity<K, ?>>
        extends QuerydslJpaDaoSupport<K, E>
        implements GenericEntityDao<K, E> {

    private Class<E> entityClass;

    @SuppressWarnings("unchecked")
    public GenericEntityDaoImpl(EntityPath<E> entityPath) {
        super(entityPath);
        this.entityClass = (Class<E>) GenericEntityUtil.getEntityClass(getClass());
    }

    public E getById(K id) {
        return super.getEntity(entityClass, id);
    }

}
