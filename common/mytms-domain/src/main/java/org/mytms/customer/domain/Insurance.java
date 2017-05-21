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
@Table(name = "insurance")
public class Insurance extends OrgAssignedEntity<Long, Insurance> {
    private static final long serialVersionUID = 1L;

    @Basic
    @Column(name = "INSURANCE_COMPANY", length = 64)
    private String insuranceCompany;

    @Basic
    @Column(name = "INSURANCE_DEADLINE")
    private Date insuranceDeadline;

    @Basic
    @Column(name = "INSURANCE_MAXAMOUNT", columnDefinition = "INT")
    private Integer insuranceMaxamount;

    @Basic
    @Column(name = "INSURANCE_NO", length = 64)
    private String insuranceNo;

    @Basic
    @Column(length = 256)
    private String remark;
}