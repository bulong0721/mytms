package org.mytms.partner.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "RES_BPARTNER")
public class BPartner extends OrgAssignedEntity<Long, BPartner> {
    @Column(name = "PAY_METHOD")
    private String payMethod;
    @Column(name = "INDUSTRY_TYPE")
    private Integer industryType;
    @Column(name = "CONSIGNEE")
    private boolean consignee = true;
    @Column(name = "CONSIGNOR")
    private boolean consignor = false;
    @Column(name = "SHIPPER")
    private boolean shipper = false;
    @Column(name = "CONTRACT_NO")
    private String contractNo;
    @Column(name = "DATE_FIRSTSALE")
    private Date dateFirstsale;
    @Column(name = "DOCK_ADDR")
    private String dockAddr;
    @Column(name = "FAX", length = 20)
    private String fax;
    @Column(name = "IMPORTANT_NOTE")
    private String importantNote;
    @Column(name = "MOBILE", length = 20)
    private String mobile;
    @Column(name = "NAME", length = 20)
    private String name;
    @Column(name = "ORG_NAME", length = 40)
    private String orgName;
    @Column(name = "PHONE", length = 20)
    private String phone;
    @Column(name = "ADDR", length = 60)
    private String addr;
    @Column(name = "ZIP", length = 10)
    private String zip;
    @Column(name = "CREDIT_QUOTA")
    private BigDecimal creditQuota;
    @Column(name = "ACCOUNT_BALANCE")
    private BigDecimal accountBalance;
    @Column(name = "CREDIT_BALANCE")
    private BigDecimal creditBalance;
}
