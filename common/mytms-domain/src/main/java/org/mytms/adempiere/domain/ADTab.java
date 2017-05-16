package org.mytms.adempiere.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mytms.common.GenericEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by admin on 2017/5/12.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ad_tab")
public class ADTab extends GenericEntity<Long, ADTab> {

    @Basic
    @Column(name = "data_index", length = 20)
    private String key;

    @Basic
    @Column(length = 20)
    private String title;

    @Basic
    @Column(name = "editor_span")
    private int editorSpan = 12;

    @Basic
    private boolean nested = false;

    @Basic
    @Column(name = "filter_span")
    private int filterSpan = 6;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tab", targetEntity = ADField.class)
    private List<ADField> fields;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tab", targetEntity = ADNested.class)
    private List<ADNested> nesteds;
}
