package org.mytms.transfer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.customer.domain.Customer;
import org.mytms.partner.domain.BPartner;
import org.mytms.pickup.domain.Order;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "LOG_INOUT")
public class Inout extends OrgAssignedEntity<Long, Inout> {

    @OneToOne(targetEntity = Movement.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "MOVEMENT_ID", referencedColumnName = "ID")
    private Movement movement;

    @OneToOne(targetEntity = Order.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ORDER_ID", referencedColumnName = "ID")
    private Order order;

    @Column(name = "WAREHOUSE_ID")
    private Long warehouse;

    @ManyToOne(targetEntity = Customer.class, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "SIGNED_USER_ID", referencedColumnName = "ID")
    private Customer signedUser;

    @ManyToOne(targetEntity = BPartner.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "SIGNED_BPARTNER_ID", referencedColumnName = "ID")
    private BPartner signedBPartner;

    @Column(name = "HANDLE_METHOD", length = 10)
    private String handleMethod;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIME_INOUTED")
    private Date timeInouted;

    @Column(name = "INOUT_TYPE", length = 10, nullable = false)
    private String inoutType;

    @Column(name = "SIGNED_TYPE", length = 10)
    private String signedType;

    @Column(name = "COMMENT", length = 60)
    private String comment;

    @Column(name = "TOTAL_AMOUNT")
    private Integer totalAmount;

    @Column(name = "TOTAL_VOLUME")
    private BigDecimal totalVolume;

    @Column(name = "TOTAL_WEIGHT")
    private BigDecimal totalWeight;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "inout")
    private List<InoutLine> lines;

}
