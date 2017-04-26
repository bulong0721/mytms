package org.mytms.profile.domain;

import org.mytms.common.GenericEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/14.
 */
@Entity
@Table(name = "C_ADDRESS")
public class Address extends GenericEntity<Long, Address> {

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity = GeoZone.class)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "PROVINCE_ZONE")
    private GeoZone province;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity = GeoZone.class)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "CITY_ZONE")
    private GeoZone city;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity = GeoZone.class)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "COUNTY_ZONE")
    private GeoZone county;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity = GeoZone.class)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "CIRCLE_ZONE")
    private GeoZone circle;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity = GeoZone.class)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "MALL_ZONE")
    private GeoZone mall;

    @Column(name = "ADDRESS", length = 255)
    private String addr;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "LONGITUDE")
    private Double longitude;

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "TRAVEL_INFO", length = 255)
    private String travelInfo;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public GeoZone getCity() {
        return city;
    }

    public void setCity(GeoZone city) {
        this.city = city;
    }

    public GeoZone getCounty() {
        return county;
    }

    public void setCounty(GeoZone county) {
        this.county = county;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public GeoZone getMall() {
        return mall;
    }

    public void setMall(GeoZone mall) {
        this.mall = mall;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public GeoZone getProvince() {
        return province;
    }

    public void setProvince(GeoZone province) {
        this.province = province;
    }

    public String getTravelInfo() {
        return travelInfo;
    }

    public void setTravelInfo(String travelInfo) {
        this.travelInfo = travelInfo;
    }

    public GeoZone getCircle() {
        return circle;
    }

    public void setCircle(GeoZone circle) {
        this.circle = circle;
    }
}
