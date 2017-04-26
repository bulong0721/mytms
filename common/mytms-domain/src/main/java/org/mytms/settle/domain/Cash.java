package org.mytms.settle.domain;

import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Martin on 2016/4/11.
 */
@Entity
@Table(name = "C_CASH")
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

    public Date getDateAcct() {
        return dateAcct;
    }

    public void setDateAcct(Date dateAcct) {
        this.dateAcct = dateAcct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getEndBalance() {
        return endBalance;
    }

    public void setEndBalance(BigDecimal endBalance) {
        this.endBalance = endBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getStartBalance() {
        return startBalance;
    }

    public void setStartBalance(BigDecimal startBalance) {
        this.startBalance = startBalance;
    }
}
