package org.mytms.settle.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.GenericEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "RES_BANK")
public class Bank extends GenericEntity<Long, Bank> {

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "NAME", length = 20)
    private String name;

    @Column(name = "SWIFT_CODE", length = 60)
    private String swiftCode;
}
