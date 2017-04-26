package org.mytms.customer.service.impl;

import org.mytms.customer.domain.ChallengeQuestion;
import org.mytms.customer.dao.ChallengeQuestionDao;
import org.mytms.customer.service.ChallengeQuestionService;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.mytms.common.service.GenericEntityServiceImpl;

@Service
public class ChallengeQuestionServiceImpl extends GenericEntityServiceImpl<Long, ChallengeQuestion> implements ChallengeQuestionService {

    protected final ChallengeQuestionDao dao;

    @Autowired
    public ChallengeQuestionServiceImpl(ChallengeQuestionDao dao) {
        super(dao);
        this.dao = dao;
    }

}

