package org.mytms.settle.domain;

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

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public boolean isAllocated() {
        return allocated;
    }

    public void setAllocated(boolean allocated) {
        this.allocated = allocated;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BPartner getbPartner() {
        return bPartner;
    }

    public void setbPartner(BPartner bPartner) {
        this.bPartner = bPartner;
    }

    public BPartnerAccount getbPBankAccount() {
        return bPBankAccount;
    }

    public void setbPBankAccount(BPartnerAccount bPBankAccount) {
        this.bPBankAccount = bPBankAccount;
    }

    public BigDecimal getChargeAmt() {
        return chargeAmt;
    }

    public void setChargeAmt(BigDecimal chargeAmt) {
        this.chargeAmt = chargeAmt;
    }

    public Long getChargeID() {
        return chargeID;
    }

    public void setChargeID(Long chargeID) {
        this.chargeID = chargeID;
    }

    public String getCheckNo() {
        return checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(BigDecimal discountAmt) {
        this.discountAmt = discountAmt;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public PaymentBatch getPaymentBatch() {
        return paymentBatch;
    }

    public void setPaymentBatch(PaymentBatch paymentBatch) {
        this.paymentBatch = paymentBatch;
    }

    public boolean isPrepayment() {
        return prepayment;
    }

    public void setPrepayment(boolean prepayment) {
        this.prepayment = prepayment;
    }

    public boolean isReceipt() {
        return receipt;
    }

    public void setReceipt(boolean receipt) {
        this.receipt = receipt;
    }

    public String getTenderType() {
        return tenderType;
    }

    public void setTenderType(String tenderType) {
        this.tenderType = tenderType;
    }

    public Date getTimeAcct() {
        return timeAcct;
    }

    public void setTimeAcct(Date timeAcct) {
        this.timeAcct = timeAcct;
    }

    public Date getTimeTrx() {
        return timeTrx;
    }

    public void setTimeTrx(Date timeTrx) {
        this.timeTrx = timeTrx;
    }

    public BigDecimal getWriteoffAmt() {
        return writeoffAmt;
    }

    public void setWriteoffAmt(BigDecimal writeoffAmt) {
        this.writeoffAmt = writeoffAmt;
    }
}
