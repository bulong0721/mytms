package org.mytms.settle.domain;

import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/11.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "RES_CASH_LINE")
public class CashLine extends OrgAssignedEntity<Long, CashLine> {

}
