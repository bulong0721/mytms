package org.mytms.partner.domain;

import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.settle.domain.Bank;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/11.
 */
@Entity
@Table(name = "LOG_BPARTNER_ACCOUNT")
public class BPartnerAccount extends OrgAssignedEntity<Long, BPartnerAccount> {

    @OneToOne(targetEntity = Bank.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "BANK_ID", referencedColumnName = "ID")
    private Bank bank;

    @ManyToOne(targetEntity = BPartner.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "BPARTNER_ID", referencedColumnName = "ID")
    protected BPartner bPartner;

    @Column(name = "NAME", length = 10)
    private String name;

    @Column(name = "ACCOUNT_NO", length = 20)
    private String accountNo;

    @Column(name = "ACCOUNT_TYPE", length = 10)
    private String accountType;

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public BPartner getBPartner() {
        return bPartner;
    }

    public void setBPartner(BPartner bPartner) {
        this.bPartner = bPartner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
