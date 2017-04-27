package org.mytms.profile.domain;

import org.mytms.common.GenericEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/14.
 */
@Entity
@Table(name = "RES_ADDRESS")
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

    @Column(name = "ADDRESS", length = 60)
    private String addr;

    @Column(name = "ZIP", length = 10)
    private String zip;

    @Column(name = "LON")
    private Float lon;

    @Column(name = "LAT")
    private Float lat;

    @Column(name = "TRAVEL_INFO", length = 255)
    private String travelInfo;

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

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
}
