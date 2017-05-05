package org.mytms.customer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.mytms.common.GenericEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/14.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "RES_CHALLENGE_QUESTION")
public class ChallengeQuestion extends GenericEntity<Long, ChallengeQuestion> {

    @Column(name = "QUESTION", nullable=false)
    protected String question;
}
