package org.mytms.customer.domain;

import java.util.*;
import javax.persistence.*;

import org.mytms.common.domain.OrgAssignedEntity;
import lombok.*;

/**
 * Auto-generated by: OpenJPA ReverseMappingTool
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer extends OrgAssignedEntity<Long, Customer> {
    private static final long serialVersionUID = 1L;

    @Basic
    @Column(length = 40)
    private String abbrev;

    @Basic
    @Column(name = "AREA_CODE", length = 64)
    private String areaCode;

    @Basic
    @Column(name = "AREA_NAME", length = 64)
    private String areaName;

    @Basic
    @Column(name = "AUDIT_STATUS", columnDefinition = "INT")
    private Integer auditStatus;

    @Basic
    @Column(length = 64)
    private String auditor;

    @Basic
    @Column(name = "BANK_ACCOUNT", length = 64)
    private String bankAccount;

    @Basic
    @Column(name = "BANK_ACCOUNT_NAME", length = 64)
    private String bankAccountName;

    @Basic
    @Column(name = "BANK_CARD_NO", length = 64)
    private String bankCardNo;

    @Basic
    @Column(name = "BUSINESS_COVER", length = 64)
    private String businessCover;

    @Basic
    @Column(name = "BUSINESS_SCOPE", length = 256)
    private String businessScope;

    @Basic
    @Column(name = "BUSINESS_TYPE", columnDefinition = "INT")
    private Integer businessType;

    @Basic
    private Boolean ccir;

    @Basic
    @Column(name = "CITY_CODE", length = 64)
    private String cityCode;

    @Basic
    @Column(name = "CITY_NAME", length = 64)
    private String cityName;

    @Basic
    @Column(name = "COMPANY_TYPE", columnDefinition = "INT")
    private Integer companyType;

    @Basic
    @Column(length = 60)
    private String corporation;

    @Basic
    @Column(name = "CUSTOMER_CODE", length = 20)
    private String customerCode;

    @Basic
    @Column(name = "CUSTOMER_NAME", length = 60)
    private String customerName;

    @Basic
    @Column(name = "CUSTOMER_TYPE", columnDefinition = "INT")
    private Integer customerType;

    @Basic
    @Column(name = "DELIVERY_TYPE", columnDefinition = "INT")
    private Integer deliveryType;

    @Basic
    @Column(name = "EMPLOYEE_NUM", columnDefinition = "INT")
    private Integer employeeNum;

    @Basic
    @Column(length = 20)
    private String fax;

    @Basic
    @Column(name = "FREEZER_AREA")
    private Double freezerArea;

    @Basic
    @Column(name = "FREEZER_VOLUME")
    private Double freezerVolume;

    @Basic
    @Column(name = "HAS_CAR")
    private Boolean hasCar;

    @Basic
    @Column(name = "HAS_QMS")
    private Boolean hasQms;

    @Basic
    @Column(name = "HAS_WH")
    private Boolean hasWh;

    @Basic
    @Column(name = "image_bank", length = 1024)
    private String imageBank;

    @Basic
    @Column(name = "image_cold", length = 1024)
    private String imageCold;

    @Basic
    @Column(name = "image_license", length = 1024)
    private String imageLicense;

    @Basic
    @Column(name = "image_logo", length = 1024)
    private String imageLogo;

    @Basic
    @Column(name = "image_organ", length = 1024)
    private String imageOrgan;

    @Basic
    @Column(name = "image_policy", length = 1024)
    private String imagePolicy;

    @Basic
    @Column(name = "image_tax", length = 1024)
    private String imageTax;

    @Basic
    @Column(name = "IMG_BANK", length = 1024)
    private String imgBank;

    @Basic
    @Column(name = "IMG_COLD", length = 1024)
    private String imgCold;

    @Basic
    @Column(name = "IMG_LICENSE", length = 1024)
    private String imgLicense;

    @Basic
    @Column(name = "IMG_LOGO", length = 1024)
    private String imgLogo;

    @Basic
    @Column(name = "IMG_ORGAN", length = 1024)
    private String imgOrgan;

    @Basic
    @Column(name = "IMG_POLICY", length = 1024)
    private String imgPolicy;

    @Basic
    @Column(name = "IMG_TAX", length = 1024)
    private String imgTax;

    @Basic
    @Column(name = "IMG_TRANSPORT", length = 1024)
    private String imgTransport;

    @Basic
    @Column(name = "IMG_WAREHOUSE", length = 1024)
    private String imgWarehouse;

    @Basic
    @Column(name = "INDUSTRY_EXPERIENCE", length = 64)
    private String industryExperience;

    @Basic
    @Column(name = "INVOICE_TYPE", columnDefinition = "INT")
    private Integer invoiceType;

    @Basic
    @Column(columnDefinition = "FLOAT")
    private Float latitude;

    @Basic
    @Column(columnDefinition = "FLOAT")
    private Float longitude;

    @Basic
    @Column(name = "NETWORK_NUM", columnDefinition = "INT")
    private Integer networkNum;

    @Basic
    @Column(name = "OFFICE_ADDRESS", length = 256)
    private String officeAddress;

    @Basic
    @Column(name = "ORGANIZATION_NO", length = 60)
    private String organizationNo;

    @Basic
    @Column(name = "OWNCAR_NUM", columnDefinition = "INT")
    private Integer owncarNum;

    @Basic
    @Column(length = 20)
    private String phone;

    @Basic
    @Column(name = "POSTAL_CODE", length = 20)
    private String postalCode;

    @Basic
    @Column(name = "PRODUCT_LIFE", length = 64)
    private String productLife;

    @Basic
    @Column(name = "PRODUCT_PROCESSING")
    private Boolean productProcessing;

    @Basic
    @Column(name = "PRODUCTION_LICENSE", length = 64)
    private String productionLicense;

    @Basic
    @Column(length = 2048)
    private String profile;

    @Basic
    @Column(name = "PROVINCE_CODE", length = 64)
    private String provinceCode;

    @Basic
    @Column(name = "PROVINCE_NAME", length = 64)
    private String provinceName;

    @Basic
    @Column(name = "PROXY_AREA", length = 64)
    private String proxyArea;

    @Basic
    @Column(name = "PROXY_DEADLINE")
    @Temporal(TemporalType.DATE)
    private Date proxyDeadline;

    @Basic
    @Column(name = "PROXY_NO", length = 64)
    private String proxyNo;

    @Basic
    @Column(name = "PY_CODE", length = 40)
    private String pyCode;

    @Basic
    @Column(name = "REFRIGERAT_NUM", columnDefinition = "INT")
    private Integer refrigeratNum;

    @Basic
    @Column(name = "REGISTER_ADDRESS", length = 256)
    private String registerAddress;

    @Basic
    @Column(name = "REGISTER_CAPITAL", length = 64)
    private String registerCapital;

    @Basic
    @Column(name = "REGISTER_NO", length = 64)
    private String registerNo;

    @Basic
    @Column(length = 256)
    private String remark;

    @Basic
    @Column(name = "SUPPLY_INDUSTRY", length = 64)
    private String supplyIndustry;

    @Basic
    private Double taxrate;

    @Basic
    @Column(name = "TFN_NO", length = 64)
    private String tfnNo;

    @Basic
    @Column(length = 256)
    private String website;

    @Basic
    @Column(name = "WH_AREA")
    private Double whArea;

    @Basic
    @Column(name = "WH_NETWORK_NUM", columnDefinition = "INT")
    private Integer whNetworkNum;

    @Basic
    @Column(name = "WH_NUM", columnDefinition = "INT")
    private Integer whNum;

    @Basic
    @Column(name = "WH_VOLUME")
    private Double whVolume;
}