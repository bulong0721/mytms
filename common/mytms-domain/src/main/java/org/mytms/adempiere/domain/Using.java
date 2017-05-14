package org.mytms.adempiere.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by admin on 2017/5/12.
 */
@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class Using {
    @Basic
    @Column(name = "js_alias", length = 60)
    private String alias;

    @Basic
    @Column(name = "js_path", length = 60)
    private String path;
}
