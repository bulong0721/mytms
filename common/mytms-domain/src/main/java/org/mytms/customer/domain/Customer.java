package org.mytms.customer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Where;
import org.mytms.common.domain.OrgAssignedEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 2016/4/14.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "RES_CUSTOMER")
public class Customer extends OrgAssignedEntity<Long, Customer> {

    @Column(name = "USER_NAME")
    protected String username;

    @Column(name = "PASSWORD")
    protected String password;

    @Column(name = "EMAIL_ADDRESS")
    protected String emailAddress;

    @Column(name = "FIRST_NAME")
    protected String firstName;

    @Column(name = "LAST_NAME")
    protected String lastName;

    @ManyToOne(targetEntity = ChallengeQuestion.class)
    @JoinColumn(foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT), name = "CHALLENGE_QUESTION_ID")
    protected ChallengeQuestion challengeQuestion;

    @Column(name = "CHALLENGE_ANSWER")
    protected String challengeAnswer;

    @Column(name = "PASSWORD_CHANGE_REQUIRED")
    protected boolean passwordChangeRequired = false;

    @Column(name = "RECEIVE_EMAIL")
    protected boolean receiveEmail = true;

    @Column(name = "IS_REGISTERED")
    protected boolean registered = false;

    @Column(name = "DEACTIVATED")
    protected boolean deactivated = false;

    @OneToMany(mappedBy = "customer", targetEntity = CustomerAttribute.class, cascade = {CascadeType.ALL}, orphanRemoval = true)
    @MapKey(name = "name")
    protected Map<String, CustomerAttribute> customerAttributes = new HashMap<String, CustomerAttribute>();

    @OneToMany(mappedBy = "customer", targetEntity = CustomerAddress.class, cascade = {CascadeType.ALL})
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL, org.hibernate.annotations.CascadeType.DELETE_ORPHAN})
    @Where(clause = "archived != 'Y'")
    protected List<CustomerAddress> customerAddresses = new ArrayList<CustomerAddress>();

    @Column(name = "TAX_EXEMPTION_CODE")
    protected String taxExemptionCode;

    @Transient
    protected String unencodedPassword;

    @Transient
    protected String unencodedChallengeAnswer;

    @Transient
    protected boolean anonymous;

    @Transient
    protected boolean cookied;

    @Transient
    protected boolean loggedIn;

    @Transient
    protected Map<String, Object> transientProperties = new HashMap<String, Object>();
}
