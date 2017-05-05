package org.mytms.partner.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.settle.domain.Bank;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "RES_BPARTNER_ACCOUNT")
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
}
