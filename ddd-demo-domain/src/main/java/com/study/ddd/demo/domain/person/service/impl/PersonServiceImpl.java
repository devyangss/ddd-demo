package com.study.ddd.demo.domain.person.service.impl;

import com.study.ddd.demo.domain.person.entity.Person;
import com.study.ddd.demo.domain.person.repository.PersonRepository;
import com.study.ddd.demo.domain.person.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Person getFirstApprover(Long applicantId) {
        return personRepository.queryByPersonId(applicantId);
    }
}
