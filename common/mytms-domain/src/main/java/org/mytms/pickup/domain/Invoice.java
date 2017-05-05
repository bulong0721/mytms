package org.mytms.pickup.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
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
@Data
@NoArgsConstructor
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
}
