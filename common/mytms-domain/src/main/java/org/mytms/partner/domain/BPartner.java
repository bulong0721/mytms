package org.mytms.partner.domain;

import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by Martin on 2016/4/11.
 */
@Entity
@Table(name = "LOG_BPARTNER")
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

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public Integer getIndustryType() {
        return industryType;
    }

    public void setIndustryType(Integer industryType) {
        this.industryType = industryType;
    }

    public boolean isConsignee() {
        return consignee;
    }

    public void setConsignee(boolean consignee) {
        this.consignee = consignee;
    }

    public boolean isConsignor() {
        return consignor;
    }

    public void setConsignor(boolean consignor) {
        this.consignor = consignor;
    }

    public boolean isShipper() {
        return shipper;
    }

    public void setShipper(boolean shipper) {
        this.shipper = shipper;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Date getDateFirstsale() {
        return dateFirstsale;
    }

    public void setDateFirstsale(Date dateFirstsale) {
        this.dateFirstsale = dateFirstsale;
    }

    public String getDockAddr() {
        return dockAddr;
    }

    public void setDockAddr(String dockAddr) {
        this.dockAddr = dockAddr;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getImportantNote() {
        return importantNote;
    }

    public void setImportantNote(String importantNote) {
        this.importantNote = importantNote;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public BigDecimal getCreditQuota() {
        return creditQuota;
    }

    public void setCreditQuota(BigDecimal creditQuota) {
        this.creditQuota = creditQuota;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public BigDecimal getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(BigDecimal creditBalance) {
        this.creditBalance = creditBalance;
    }
}
