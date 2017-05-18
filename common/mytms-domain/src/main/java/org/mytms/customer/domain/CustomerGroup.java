package org.mytms.customer.domain;

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
@Table(name="crm_customer_group")
public class CustomerGroup extends OrgAssignedEntity<Long, CustomerGroup> {
	private static final long serialVersionUID = 1L;

	@Basic
	@Column(name="CCG_ADDRESS", length=256)
	private String ccgAddress;

	@Basic
	@Column(name="CCG_COMPANY", length=64)
	private String ccgCompany;

	@Basic
	@Column(name="CCG_CONTACT", length=64)
	private String ccgContact;

	@Basic
	@Column(name="CCG_CONTACT_PHONE", length=64)
	private String ccgContactPhone;

	@Basic
	@Column(name="CCG_COOPERA_PERIOD", length=64)
	private String ccgCooperaPeriod;

	@Basic
	@Column(name="CCG_CUSTOMER_PM_CODE", length=64)
	private String ccgCustomerPmCode;

	@Basic
	@Column(name="CCG_MANAGEMENT_INDUSTRY", length=64)
	private String ccgManagementIndustry;

	@Basic
	@Column(name="CCG_PORTFOLIO")
	private String ccgPortfolio;

	@Basic
	@Column(name="CCG_REMARK", length=256)
	private String ccgRemark;

	@Basic
	@Column(name="CCG_TYPE", length=64)
	private String ccgType;

	@Id
	@Column(columnDefinition="BIGINT UNSIGNED")
	private long id;

	@Basic
	@Column(name="PM_CODE", length=64)
	private String pmCode;
}