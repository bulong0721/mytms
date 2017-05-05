package org.mytms.pickup.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.Org;
import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.customer.domain.Customer;
import org.mytms.partner.domain.BPartner;

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
@Table(name = "LOG_ORDER")
public class Order extends OrgAssignedEntity<Long, Order> {

    @ManyToOne(targetEntity = BPartner.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "CONSIGNEE_BPARTNER_ID", referencedColumnName = "ID")
    private BPartner consigneeBPartner;

    @ManyToOne(targetEntity = BPartner.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "CONSIGNOR_BPARTNER_ID", referencedColumnName = "ID")
    private BPartner consignorBPartner;

    @ManyToOne(targetEntity = BPartner.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "SHIPPER_BPARTNER_ID", referencedColumnName = "ID")
    private BPartner shipperBPartner;

    @ManyToOne(targetEntity = Org.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "DEPARTURE_ORG_ID", referencedColumnName = "ID")
    private Org departureOrg;

    @ManyToOne(targetEntity = Org.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ARRIVAL_ORG_ID", referencedColumnName = "ID")
    private Org arrivalOrg;

    @ManyToOne(targetEntity = Customer.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "USER1_ID", referencedColumnName = "ID")
    private Customer user1;

    @ManyToOne(targetEntity = Customer.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "USER2_ID", referencedColumnName = "ID")
    private Long user2;

    @OneToOne(targetEntity = Invoice.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "INVOICE_ID", referencedColumnName = "ID")
    private Invoice invoice;

    @Column(name = "RECEIPT_COPIES")
    private Integer receiptCopies;

    @Column(name = "TOTAL_CHARGE")
    private BigDecimal totalCharge;

    @Column(name = "CHARGE_ADDITIONAL")
    private BigDecimal chargeAdditional;

    @Column(name = "CHARGE_DELIVERY")
    private BigDecimal chargeDelivery;

    @Column(name = "CHARGE_DOCK")
    private BigDecimal chargeDock;

    @Column(name = "CHARGE_INSURANCE")
    private BigDecimal chargeInsurance;

    @Column(name = "CHARGE_PACKAGE")
    private BigDecimal chargePackage;

    @Column(name = "CHARGE_PICKUP")
    private BigDecimal chargePickup;

    @Column(name = "CHARGE_STORE")
    private BigDecimal chargeStore;

    @Column(name = "CHARGE_FREIGHT")
    private BigDecimal chargeFreight;

    @Column(name = "INSURANCE_LIMIT")
    private BigDecimal insuranceLimit;

    @Column(name = "PAID_CONSIGNEE")
    private BigDecimal paidConsignee;

    @Column(name = "PAID_CONSIGNOR")
    private BigDecimal paidConsignor;

    @Column(name = "PAID_MONTHLY")
    private BigDecimal paidMonthly;

    @Column(name = "PAID_RECEIPT")
    private BigDecimal paidReceipt;

    @Column(name = "COST_ADDITIONAL")
    private BigDecimal costAdditional;

    @Column(name = "COST_CLAIM")
    private BigDecimal costClaim;

    @Column(name = "COST_COMMISSION")
    private BigDecimal costCommission;

    @Column(name = "DELIVERY")
    private boolean delivery = false;

    @Column(name = "PICKUP")
    private boolean pickup = false;

    @Column(name = "PICKUPED")
    private boolean pickuped = false;

    @Column(name = "SOTRX")
    private boolean sotrx = false;

    @Column(name = "COMMENT", length = 60)
    private String comment;

    @Column(name = "COMMENT_RECEIPT", length = 10)
    private String commentReceipt;

    @Column(name = "PAYMENT_RULE", length = 10)
    private String paymentRule;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_ORDERED")
    private Date dateOrdered;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_PROMISE")
    private Date datePromise;

    @Column(name = "DESCRIPTION", length = 255)
    private String description;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "order")
    private List<OrderLine> lines;
}
