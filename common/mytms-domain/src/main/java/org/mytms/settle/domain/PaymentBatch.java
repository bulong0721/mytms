package org.mytms.settle.domain;

import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Martin on 2016/4/11.
 */
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPaymentProcessor() {
        return paymentProcessor;
    }

    public void setPaymentProcessor(Long paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    public boolean isProcessing() {
        return processing;
    }

    public void setProcessing(boolean processing) {
        this.processing = processing;
    }
}
