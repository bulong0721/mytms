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
@Table(name = "customer_relationship")
public class CustomerRelationship extends OrgAssignedEntity<Long, CustomerRelationship> {
    private static final long serialVersionUID = 1L;

    @Basic
    @Column(name = "CUSTOMER_CODE", length = 64)
    private String customerCode;

    @Basic
    @Column(name = "CUSTOMER_NAME", length = 64)
    private String customerName;

    @Basic
    @Column(name = "PARENT_PM_CODE")
    private Long parentPmCode;

    @Basic
    @Column(length = 256)
    private String remark;
}