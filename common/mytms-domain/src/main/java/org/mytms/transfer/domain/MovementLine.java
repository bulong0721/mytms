package org.mytms.transfer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.Org;
import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.pickup.domain.OrderLine;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "LOG_MOVEMENT_LINE")
public class MovementLine extends OrgAssignedEntity<Long, MovementLine> {

    @OneToOne(targetEntity = Movement.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "MOVEMENT_ID", referencedColumnName = "ID")
    private Movement movement;

    @OneToOne(targetEntity = Inventory.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "INVENTORY_ID", referencedColumnName = "ID")
    private Inventory inventory;

    @OneToOne(targetEntity = OrderLine.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ORDER_LINE_ID", referencedColumnName = "ID")
    private OrderLine orderLine;

    @ManyToOne(targetEntity = Org.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "DEPART_ORG_ID", referencedColumnName = "ID")
    private Org departOrg;

    @ManyToOne(targetEntity = Org.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "DEST_ORG_ID", referencedColumnName = "ID")
    private Org destOrg;

    @Column(name = "line_status", length = 10)
    private String lineStatus;
}
