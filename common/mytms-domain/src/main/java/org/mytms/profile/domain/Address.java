package org.mytms.profile.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.GenericEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/14.
 */
@Data
@NoArgsConstructor
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
}
