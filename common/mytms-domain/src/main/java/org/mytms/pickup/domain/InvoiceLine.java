package org.mytms.pickup.domain;

import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.customer.domain.Customer;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Martin on 2016/4/11.
 */
@Entity
@Table(name = "LOG_INVOICE_LINE")
public class InvoiceLine extends OrgAssignedEntity<Long, InvoiceLine> {

    @Column(name = "CHARGE_ID")
    private Long chargeID;

    @ManyToOne(targetEntity = Customer.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "USER1_ID", referencedColumnName = "ID")
    private Customer user1;

    @ManyToOne(targetEntity = Customer.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "USER2_ID", referencedColumnName = "ID")
    private Customer user2;

    @Column(name = "LINE_AMT")
    private BigDecimal lineAmt;

    @ManyToOne(targetEntity = Order.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ORDER_ID", referencedColumnName = "ID")
    private Order order;

    @ManyToOne(targetEntity = Invoice.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "INVOICE_ID", referencedColumnName = "ID")
    private Invoice invoice;

    public Long getChargeID() {
        return chargeID;
    }

    public void setChargeID(Long chargeID) {
        this.chargeID = chargeID;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public BigDecimal getLineAmt() {
        return lineAmt;
    }

    public void setLineAmt(BigDecimal lineAmt) {
        this.lineAmt = lineAmt;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Customer getUser1() {
        return user1;
    }

    public void setUser1(Customer user1) {
        this.user1 = user1;
    }

    public Customer getUser2() {
        return user2;
    }

    public void setUser2(Customer user2) {
        this.user2 = user2;
    }
}
