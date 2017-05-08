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
@Table(name = "DEV_OPERATOR")
public class Operator extends GenericEntity<Long, Operator> {

    @Column(name = "icon", length = 40)
    private String icon;

    @Column(name = "title", length = 20)
    private String title;

    @Column(name = "type", length = 20)
    private String type;

    @Column(name = "action", length = 40)
    private String action;

    @Column(name = "target", length = 10)
    private String target;

    @Column(name = "popup_editor")
    private Boolean popupEditor;

    @Column(name = "component", length = 20)
    private String component;
}
