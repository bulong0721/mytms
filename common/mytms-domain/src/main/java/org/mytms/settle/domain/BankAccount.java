package org.mytms.settle.domain;

import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/7/8.
 */
@Entity
@Table(name = "RES_BANKACCOUNT")
public class BankAccount extends OrgAssignedEntity<Long, BankAccount> {

}
