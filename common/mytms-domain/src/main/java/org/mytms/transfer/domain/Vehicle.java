package org.mytms.transfer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;
import org.mytms.customer.domain.Customer;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "LOG_VEHICLE")
public class Vehicle extends OrgAssignedEntity<Long, Vehicle> {
    //车主
    @ManyToOne(targetEntity = Customer.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "OWNER_ID", referencedColumnName = "ID")
    private Customer owner;

    //在途发车
    @OneToOne(targetEntity = Movement.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "ENTRUST_MOVE_ID", referencedColumnName = "ID")
    private Movement entrustMovement;

    //司机
    @ManyToOne(targetEntity = Customer.class, fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "DRIVER_ID", referencedColumnName = "ID")
    private Customer driver;

    //车辆性质
    @Column(name = "VEHICLE_NATURE", length = 10)
    private String vehicleNature;

    //注释
    @Column(name = "COMMENT", length = 20)
    private String comment;

    //合同编号
    @Column(name = "CONTRACT_NO", length = 20)
    private String contractNo;

    //出发日期
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_DEPART")
    private Date dateDepart;

    //报废日期
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_SCRAP")
    private Date dateScrap;

    //使用日期
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_USING")
    private Date dateUsing;

    //司机姓名
    @Column(name = "DRIVER_NAME", length = 10)
    private String driverName;

    //司机地址
    @Column(name = "DRIVER_ADDR", length = 60)
    private String driverAddr;

    //车名
    @Column(name = "NAME", length = 20)
    private String name;

    //行驶证号
    @Column(name = "OPERATION_NO")
    private String operationNo;

    //车主
    @Column(name = "OWNER_NAME", length = 20)
    private String ownerName;

    //车主地址
    @Column(name = "OWNER_ADDR", length = 60)
    private String ownerAddr;

    //车主电话
    @Column(name = "OWNER_PHONE", length = 20)
    private String ownerPhone;

    //车牌号
    @Column(name = "PLATE_NO", length = 10)
    private String plateNo;

    //挂车车牌号
    @Column(name = "TRAILER_PLATE_NO", length = 10)
    private String trailerPlateNo;

    //司机驾驶证号
    @Column(name = "DRIVER_LICENCE_NO", length = 30)
    private String driverLicenceNo;

    //司机电话
    @Column(name = "DRIVER_PHONE", length = 20)
    private String driverPhone;

    //发动机号
    @Column(name = "ENGINE_NO", length = 30)
    private String engineNo;

    //保险单号
    @Column(name = "INSURANCE_NO", length = 30)
    private String insuranceNo;

    //车架号
    @Column(name = "LICENSE_NO")
    private String licenseNo;

    //限行
    @Column(name = "LIMITED", length = 60)
    private String limited;

    //当前里程
    @Column(name = "MILEAGE_CURRENT")
    private BigDecimal mileageCurrent;

    //开始里程
    @Column(name = "MILEAGE_START")
    private BigDecimal mileageStart;

    //报废里程
    @Column(name = "MILEAGE_TERMINAL")
    private BigDecimal mileageTerminal;

    //油耗
    @Column(name = "OIL_CONSUMPTION")
    private BigDecimal oilConsumption;

    //吨位
    @Column(name = "TONNAGE")
    private BigDecimal tonnage;

    //折旧费
    @Column(name = "DEPRECIATION_CHARGE")
    private BigDecimal depreciationCharge;
}
