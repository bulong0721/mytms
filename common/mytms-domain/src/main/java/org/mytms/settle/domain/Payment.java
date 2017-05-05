package org.mytms.settle.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.partner.domain.BPartner;
import org.mytms.partner.domain.BPartnerAccount;
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
@Table(name = "LOG_PAYMENT")
public class Payment extends OrgAssignedEntity<Long, Payment> {

    @ManyToOne(targetEntity = BankAccount.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ACCOUNT_ID", referencedColumnName = "ID")
    private BankAccount bankAccount;

    @ManyToOne(targetEntity = BPartnerAccount.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "BP_ACCOUNT_ID", referencedColumnName = "ID")
    private BPartnerAccount bPBankAccount;

    @ManyToOne(targetEntity = BPartner.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "BPARTNER_ID", referencedColumnName = "ID")
    private BPartner bPartner;

    @Column(name = "charge_id")
    private Long chargeID;

    @OneToOne(targetEntity = Invoice.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "INVOICE_ID", referencedColumnName = "ID")
    private Invoice invoice;

    @OneToOne(targetEntity = Order.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ORDER_ID", referencedColumnName = "ID")
    private Order order;

    @ManyToOne(targetEntity = PaymentBatch.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "PAYMENT_BATCH_ID", referencedColumnName = "ID")
    private PaymentBatch paymentBatch;

    //在线支付
    @Column(name = "ONLINE")
    private boolean online = false;

    //
    @Column(name = "ALLOCATED")
    private boolean allocated = false;

    //预付
    @Column(name = "PREPAYMENT")
    private boolean prepayment = false;

    //收款
    @Column(name = "RECEIPT")
    private boolean receipt = false;

    @Column(name = "ACCOUNT_NO", length = 20)
    private String accountNo;

    @Column(name = "CHECK_NO", length = 20)
    private String checkNo;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TENDER_TYPE")
    private String tenderType;

    //账期
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIME_ACCT")
    private Date timeAcct;

    //支付时间
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIME_TRX")
    private Date timeTrx;

    @Column(name = "PAY_AMT")
    private BigDecimal payAmt = BigDecimal.ZERO;

    @Column(name = "CHARGE_AMT")
    private BigDecimal chargeAmt = BigDecimal.ZERO;

    @Column(name = "DISCOUNT_AMT")
    private BigDecimal discountAmt = BigDecimal.ZERO;

    @Column(name = "WRITEOFF_AMT")
    private BigDecimal writeoffAmt = BigDecimal.ZERO;
}
