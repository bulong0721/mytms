package org.mytms.settle.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "RES_CASH")
public class Cash extends OrgAssignedEntity<Long, Cash> {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_ACCT")
    private Date dateAcct;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "END_BALANCE")
    private BigDecimal endBalance = BigDecimal.ZERO;

    @Column(name = "NAME", length = 20)
    private String name;

    @Column(name = "START_BALANCE")
    private BigDecimal startBalance = BigDecimal.ZERO;

}
