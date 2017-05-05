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
@Table(name = "LOG_INOUT_LINE")
public class InoutLine extends OrgAssignedEntity<Long, InoutLine> {

    @Column(name = "CONFIRMED_QTY")
    private Integer confirmedQty = 0;

    @Column(name = "MOVE_QTY")
    private Integer moveQty = 0;

    @Column(name = "PICK_QTY")
    private Integer pickQty = 0;

    @Column(name = "SCRAPPED_QTY")
    private Integer scrappedQty = 0;

    @Column(name = "TARGET_QTY")
    private Integer targetQty = 0;

    @ManyToOne(targetEntity = Inout.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "INOUT_ID", referencedColumnName = "ID")
    private Inout inout;

    @OneToOne(targetEntity = OrderLine.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ORDER_LINE_ID", referencedColumnName = "ID")
    private OrderLine orderLine;

}
