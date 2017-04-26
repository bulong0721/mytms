package org.mytms.customer.domain;

import org.mytms.common.GenericEntity;

import javax.persistence.*;

/**
 * Created by Martin on 2016/4/14.
 */
@Entity
@Table(name = "C_CHALLENGE_QUESTION")
public class ChallengeQuestion extends GenericEntity<Long, ChallengeQuestion> {

    @Column(name = "QUESTION", nullable=false)
    protected String question;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ChallengeQuestion that = (ChallengeQuestion) o;

        return !(question != null ? !question.equals(that.question) : that.question != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (question != null ? question.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return question;
    }
}
