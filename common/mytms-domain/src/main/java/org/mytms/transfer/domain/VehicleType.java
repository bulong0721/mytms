package org.mytms.transfer.domain;

import org.mytms.common.GenericEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/11.
 */
@Entity
@Table(name = "LOG_VEHICLE_TYPE")
public class VehicleType extends GenericEntity<Long, VehicleType> {

    @Column(name = "NAME", length = 40)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
