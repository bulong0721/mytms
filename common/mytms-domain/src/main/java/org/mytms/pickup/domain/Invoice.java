package org.mytms.pickup.domain;

import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.partner.domain.BPartner;
import org.mytms.settle.domain.Payment;
import org.mytms.transfer.domain.Movement;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Martin on 2016/4/11.
 */
@Entity
@Table(name = "LOG_INVOICE")
public class Invoice extends OrgAssignedEntity<Long, Invoice> {

    @ManyToOne(targetEntity = BPartner.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "BPARTNER_ID", referencedColumnName = "ID")
    private BPartner bPartner;

    @Column(name = "CHARGE_ID")
    private Long chargeID;

    @ManyToOne(targetEntity = Payment.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "PAYMENT_ID", referencedColumnName = "ID")
    private Payment payment;

    @Column(name = "CHARGE_AMT")
    private BigDecimal chargeAmt;

    @Column(name = "GRAND_TOTAL")
    private BigDecimal grandTotal;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_INVOICE")
    private Date dateInvoice;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_ORDERED")
    private Date dateOrdered;

    @Column(name = "DESCRIPTION", length = 255)
    private String description;

    @Column(name = "PAYMENT_RULE", length = 10)
    private String paymentRule;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIME_ACCT")
    private Date timeAcct;

    @Column(name = "PAID")
    private boolean paid;

    @Column(name = "PRINTED")
    private boolean printed;

    @Column(name = "SOTRX")
    private boolean sotrx;

    @OneToOne(targetEntity = Movement.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "MOVEMENT_ID", referencedColumnName = "ID")
    private Movement movement;

    @OneToOne(targetEntity = Order.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ORDER_ID", referencedColumnName = "ID")
    private Order order;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "invoice")
    private List<InvoiceLine> lines;

    public BPartner getbPartner() {
        return bPartner;
    }

    public void setbPartner(BPartner bPartner) {
        this.bPartner = bPartner;
    }

    public Long getChargeID() {
        return chargeID;
    }

    public void setChargeID(Long chargeID) {
        this.chargeID = chargeID;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public BigDecimal getChargeAmt() {
        return chargeAmt;
    }

    public void setChargeAmt(BigDecimal chargeAmt) {
        this.chargeAmt = chargeAmt;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Date getDateInvoice() {
        return dateInvoice;
    }

    public void setDateInvoice(Date dateInvoice) {
        this.dateInvoice = dateInvoice;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaymentRule() {
        return paymentRule;
    }

    public void setPaymentRule(String paymentRule) {
        this.paymentRule = paymentRule;
    }

    public Date getTimeAcct() {
        return timeAcct;
    }

    public void setTimeAcct(Date timeAcct) {
        this.timeAcct = timeAcct;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isPrinted() {
        return printed;
    }

    public void setPrinted(boolean printed) {
        this.printed = printed;
    }

    public boolean isSotrx() {
        return sotrx;
    }

    public void setSotrx(boolean sotrx) {
        this.sotrx = sotrx;
    }

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<InvoiceLine> getLines() {
        return lines;
    }

    public void setLines(List<InvoiceLine> lines) {
        this.lines = lines;
    }
}
