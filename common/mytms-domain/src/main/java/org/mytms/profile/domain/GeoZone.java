package org.mytms.profile.domain;

import org.hibernate.validator.constraints.NotEmpty;
import org.mytms.common.GenericEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/14.
 */
@Entity
@Table(name = "C_GEO_ZONE")
@Cacheable
public class GeoZone extends GenericEntity<Long, GeoZone> {

    @NotEmpty
    @Column(name = "ZONE_NAME")
    private String name;

    @NotEmpty
    @Column(name = "ZONE_CODE")
    private String code;//区号

    @Column(name = "PARENT")
    private Long parent;

    @Column(name = "ZONE_LEVEL")
    private int level;//区域级别0国家，1省/直辖市，2市，3区县

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
