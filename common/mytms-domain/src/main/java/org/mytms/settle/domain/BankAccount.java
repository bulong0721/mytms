package org.mytms.settle.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/7/8.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "RES_BANKACCOUNT")
public class BankAccount extends OrgAssignedEntity<Long, BankAccount> {

}
