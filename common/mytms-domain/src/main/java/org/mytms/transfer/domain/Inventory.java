package org.mytms.transfer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
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
@Table(name = "LOG_INVENTORY")
public class Inventory extends OrgAssignedEntity<Long, Inventory> {

    @ManyToOne(targetEntity = Warehouse.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "WAREHOUSE_ID", referencedColumnName = "ID")
    private Warehouse warehouse;

    @Column(name = "INVENTORY_STATUS", length = 10)
    private String inventoryStatus;

    @OneToOne(targetEntity = OrderLine.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ORDER_LINE_ID", referencedColumnName = "ID")
    private OrderLine orderLine;
}
