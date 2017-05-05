package org.mytms.settle.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Martin on 2016/4/11.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "LOG_PAYMENT_BATCH")
public class PaymentBatch extends OrgAssignedEntity<Long, PaymentBatch> {

    @Column(name = "PAYMENT_PROCESSOR_ID")
    private Long paymentProcessor;

    @Column(name = "NAME", length = 20)
    private String name;

    @Column(name = "PROCESSED")
    private boolean processed = false;

    @Column(name = "PROCESSING")
    private boolean processing = true;

}
