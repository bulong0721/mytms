package org.mytms.pickup.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.customer.domain.Customer;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "LOG_INVOICE_LINE")
public class InvoiceLine extends OrgAssignedEntity<Long, InvoiceLine> {

    @Column(name = "CHARGE_ID")
    private Long chargeID;

    @ManyToOne(targetEntity = Customer.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "USER1_ID", referencedColumnName = "ID")
    private Customer user1;

    @ManyToOne(targetEntity = Customer.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "USER2_ID", referencedColumnName = "ID")
    private Customer user2;

    @Column(name = "LINE_AMT")
    private BigDecimal lineAmt;

    @ManyToOne(targetEntity = Order.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ORDER_ID", referencedColumnName = "ID")
    private Order order;

    @ManyToOne(targetEntity = Invoice.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "INVOICE_ID", referencedColumnName = "ID")
    private Invoice invoice;
}
