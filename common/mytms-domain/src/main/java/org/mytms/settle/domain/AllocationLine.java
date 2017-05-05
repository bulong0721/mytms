package org.mytms.settle.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.partner.domain.BPartner;
import org.mytms.pickup.domain.Invoice;
import org.mytms.pickup.domain.Order;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "LOG_ALLOCATION_LINE")
public class AllocationLine extends OrgAssignedEntity<Long, AllocationLine> {

    @ManyToOne(targetEntity = BPartner.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "BPARTNER_ID", referencedColumnName = "ID")
    private BPartner bPartner;

    @ManyToOne(targetEntity = CashLine.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "CASH_LINE_ID", referencedColumnName = "ID")
    private CashLine cashLine;

    @OneToOne(targetEntity = Invoice.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "INVOICE_ID", referencedColumnName = "ID")
    private Invoice invoice;

    @OneToOne(targetEntity = Order.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ORDER_ID", referencedColumnName = "ID")
    private Order order;

    @OneToOne(targetEntity = Payment.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "PAYMENT_ID", referencedColumnName = "ID")
    private Payment payment;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "DISCOUNT_AMT")
    private BigDecimal discountAmt;

    @Column(name = "OVERUNDER_AMT")
    private BigDecimal overunderAmt;

    @Column(name = "WRITEOFF_AMT")
    private BigDecimal writeoffAmt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIME_TRX")
    private Date timeTrx;

    @ManyToOne(targetEntity = Allocation.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ALLOCATION_ID")
    private Allocation allocation;
}
