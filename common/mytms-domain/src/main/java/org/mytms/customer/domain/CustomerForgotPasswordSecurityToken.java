package org.mytms.customer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.GenericEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Martin on 2016/4/14.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "RES_CUSTOMER_PASSWORD_TOKEN")
public class CustomerForgotPasswordSecurityToken extends GenericEntity<Long, CustomerForgotPasswordSecurityToken> {

    @Column(name = "CREATE_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createDate;

    @Column(name = "TOKEN_USED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date tokenUsedDate;

    @Column(name = "CUSTOMER_ID", nullable = false)
    protected Long customerId;

    @Column(name = "TOKEN_USED_FLAG", nullable = false)
    protected boolean tokenUsedFlag;
}
