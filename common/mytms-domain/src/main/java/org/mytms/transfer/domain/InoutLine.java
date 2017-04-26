package org.mytms.transfer.domain;

import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.pickup.domain.OrderLine;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/11.
 */
@Entity
@Table(name = "LOG_INOUT_LINE")
public class InoutLine extends OrgAssignedEntity<Long, InoutLine> {

    @Column(name = "CONFIRMED_QTY")
    private Integer confirmedQty = 0;

    @Column(name = "MOVE_QTY")
    private Integer moveQty = 0;

    @Column(name = "PICK_QTY")
    private Integer pickQty = 0;

    @Column(name = "SCRAPPED_QTY")
    private Integer scrappedQty = 0;

    @Column(name = "TARGET_QTY")
    private Integer targetQty = 0;

    @ManyToOne(targetEntity = Inout.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "INOUT_ID", referencedColumnName = "ID")
    private Inout inout;

    @OneToOne(targetEntity = OrderLine.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ORDER_LINE_ID", referencedColumnName = "ID")
    private OrderLine orderLine;

    public Integer getConfirmedQty() {
        return confirmedQty;
    }

    public void setConfirmedQty(Integer confirmedQty) {
        this.confirmedQty = confirmedQty;
    }

    public Inout getInout() {
        return inout;
    }

    public void setInout(Inout inout) {
        this.inout = inout;
    }

    public Integer getMoveQty() {
        return moveQty;
    }

    public void setMoveQty(Integer moveQty) {
        this.moveQty = moveQty;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }

    public Integer getPickQty() {
        return pickQty;
    }

    public void setPickQty(Integer pickQty) {
        this.pickQty = pickQty;
    }

    public Integer getScrappedQty() {
        return scrappedQty;
    }

    public void setScrappedQty(Integer scrappedQty) {
        this.scrappedQty = scrappedQty;
    }

    public Integer getTargetQty() {
        return targetQty;
    }

    public void setTargetQty(Integer targetQty) {
        this.targetQty = targetQty;
    }
}
