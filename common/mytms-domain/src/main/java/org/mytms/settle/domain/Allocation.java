package org.mytms.settle.domain;

import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Martin on 2016/4/11.
 */
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

    public BigDecimal getApprovalAmt() {
        return approvalAmt;
    }

    public void setApprovalAmt(BigDecimal approvalAmt) {
        this.approvalAmt = approvalAmt;
    }

    public List<AllocationLine> getLines() {
        return lines;
    }

    public void setLines(List<AllocationLine> lines) {
        this.lines = lines;
    }

    public boolean isManual() {
        return manual;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public Date getTimeAcct() {
        return timeAcct;
    }

    public void setTimeAcct(Date timeAcct) {
        this.timeAcct = timeAcct;
    }
}
