package org.mytms.customer.dao.impl;

import org.mytms.customer.dao.ChallengeQuestionDao;
import org.mytms.customer.domain.ChallengeQuestion;
import org.mytms.customer.domain.QChallengeQuestion;

import org.springframework.stereotype.Repository;
import org.mytms.common.dao.GenericEntityDaoImpl;

@Repository
public class ChallengeQuestionDaoImpl extends GenericEntityDaoImpl<Long, ChallengeQuestion> implements ChallengeQuestionDao {

    protected final QChallengeQuestion path = QChallengeQuestion.challengeQuestion;

    public ChallengeQuestionDaoImpl() {
        super(QChallengeQuestion.challengeQuestion);
    }

}

