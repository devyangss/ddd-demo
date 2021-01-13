package com.study.ddd.demo.domain.person.service;

import com.study.ddd.demo.domain.person.entity.Person;

/**
 * 人员领域服务
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
public interface PersonService {

    /**
     * 根据申请人id获取审批人
     *
     * @param applicantId
     * @return
     */
    public Person getFirstApprover(Long applicantId);
}
