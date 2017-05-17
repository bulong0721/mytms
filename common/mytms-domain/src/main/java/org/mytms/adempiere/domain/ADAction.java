package org.mytms.adempiere.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mytms.common.GenericEntity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by admin on 2017/5/12.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ad_action")
public class ADAction extends GenericEntity<Long, ADAction> {

    @Basic
    @Column(name = "data_index", length = 20)
    private String key;

    @Basic
    @Column(length = 20)
    private String title;

    @Basic
    @Column(length = 20)
    private String icon;

    @Basic
    @Column(length = 20)
    private String type;

    @Basic
    @Column(length = 20)
    private String action;

    @Basic
    @Column(name = "popup_editor")
    private Boolean popupEditor;

    private String component;

}
