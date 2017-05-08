package org.mytms.scaffold.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mytms.common.GenericEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Martin.Xu on 2017/5/8.
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "DEV_FUNCTION")
public class Function extends GenericEntity<Long, Function> {

    @Column(name = "icon", length = 40)
    private String icon;
}
