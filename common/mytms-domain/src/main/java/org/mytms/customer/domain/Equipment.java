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
@Table(name = "equipment")
public class Equipment extends OrgAssignedEntity<Long, Equipment> {
    private static final long serialVersionUID = 1L;

    @Basic
    @Column(name = "AUDIT_STATUS", columnDefinition = "INT")
    private Integer auditStatus;

    @Basic
    @Column(name = "EQUIPMENT_NAME", length = 64)
    private String equipmentName;

    @Basic
    @Column(name = "EQUIPMENT_NO", length = 64)
    private String equipmentNo;

    @Basic
    @Column(name = "EQUIPMENT_TYPE", columnDefinition = "INT")
    private Integer equipmentType;

    @Basic
    @Column(name = "MANUFACTURER_ID")
    private Long manufacturerId;

    @Basic
    @Column(name = "OUT_NO", length = 64)
    private String outNo;

    @Basic
    @Column(length = 256)
    private String remark;

    @Basic
    @Column(name = "SERIAL_NO", length = 64)
    private String serialNo;

    @Basic
    @Column(name = "SPEC_MODEL", length = 64)
    private String specModel;
}