package org.mytms.settle.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "LOG_ALLOCATION")
public class Allocation extends OrgAssignedEntity<Long, Allocation> {

    @Column(name = "MANUAL")
    private boolean manual = false;

    @Column(name = "APPROVAL_AMT")
    private BigDecimal approvalAmt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIME_ACCT")
    private Date timeAcct;

    @OneToMany(targetEntity = AllocationLine.class, fetch = FetchType.LAZY, mappedBy = "allocation")
    private List<AllocationLine> lines;
}
