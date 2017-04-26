package org.mytms.transfer.domain;

import org.mytms.common.domain.Org;
import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Martin on 2016/4/11.
 */
@Entity
@Table(name = "LOG_ROUTE")
public class Route extends OrgAssignedEntity<Long, Route> {

    @Column(name = "NAME", length = 40)
    private String name;

    @Column(name = "UNIT_PRICE")
    private BigDecimal unitPrice;

    @Column(name = "FEE_HIGHWAY")
    private BigDecimal feeHighway;

    @Column(name = "DEPART_ORG")
    private Org departOrg;

    @Column(name = "ARRIVE_ORG")
    private Org arriveOrg;

    @Column(name = "INTERCITY")
    private boolean intercity;

    @Column(name = "TOTAL_MILEAGE")
    private int totalMileage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
