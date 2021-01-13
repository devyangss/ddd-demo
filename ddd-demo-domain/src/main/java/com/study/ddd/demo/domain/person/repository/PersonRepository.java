package com.study.ddd.demo.domain.person.repository;

import com.study.ddd.demo.domain.person.entity.Person;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
public interface PersonRepository {

    /**
     * 根据人员id获取人员实体
     *
     * @param personId
     * @return
     */
    public Person queryByPersonId(Long personId);
}
