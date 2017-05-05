package org.mytms.pickup.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "LOG_ORDER_LINE")
public class OrderLine extends OrgAssignedEntity<Long, OrderLine> {

    @Column(name = "LINE_NO")
    private Integer lineNo;

    @Basic
    private Integer amount = 1;

    @Column(name = "NAME", length = 20)
    private String name;

    @Column(name = "PACKAGE_TYPE", length = 10)
    private String packageType;

    @Column(name = "VALUE", nullable = false)
    private BigDecimal value;

    @Column(name = "VOLUME",nullable = false)
    private BigDecimal volume;

    @Column(name = "WEIGHT",nullable = false)
    private BigDecimal weight;

    @ManyToOne(targetEntity = Order.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ORDER_ID")
    private Order order;
}
