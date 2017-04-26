package org.mytms.transfer.domain;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getHandleMethod() {
        return handleMethod;
    }

    public void setHandleMethod(String handleMethod) {
        this.handleMethod = handleMethod;
    }

    public String getInoutType() {
        return inoutType;
    }

    public void setInoutType(String inoutType) {
        this.inoutType = inoutType;
    }

    public List<InoutLine> getLines() {
        return lines;
    }

    public void setLines(List<InoutLine> lines) {
        this.lines = lines;
    }

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public BPartner getSignedBPartner() {
        return signedBPartner;
    }

    public void setSignedBPartner(BPartner signedBPartner) {
        this.signedBPartner = signedBPartner;
    }

    public String getSignedType() {
        return signedType;
    }

    public void setSignedType(String signedType) {
        this.signedType = signedType;
    }

    public Customer getSignedUser() {
        return signedUser;
    }

    public void setSignedUser(Customer signedUser) {
        this.signedUser = signedUser;
    }

    public Date getTimeInouted() {
        return timeInouted;
    }

    public void setTimeInouted(Date timeInouted) {
        this.timeInouted = timeInouted;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(BigDecimal totalVolume) {
        this.totalVolume = totalVolume;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Long getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse;
    }
}
