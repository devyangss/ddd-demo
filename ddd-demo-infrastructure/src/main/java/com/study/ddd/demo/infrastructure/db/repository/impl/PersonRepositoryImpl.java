package com.study.ddd.demo.infrastructure.db.repository.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.study.ddd.demo.domain.person.entity.Person;
import com.study.ddd.demo.domain.person.repository.PersonRepository;
import com.study.ddd.demo.infrastructure.db.builder.PersonBuilder;
import com.study.ddd.demo.infrastructure.db.dataobject.PersonDO;
import com.study.ddd.demo.infrastructure.db.mapper.PersonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@Repository
@RequiredArgsConstructor
public class PersonRepositoryImpl implements PersonRepository {

    private final PersonMapper personMapper;

    @Override
    public Person queryByPersonId(Long personId) {
        LambdaQueryWrapper<PersonDO> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(PersonDO::getId, personId);
        PersonDO personDO = personMapper.selectOne(queryWrapper);

        return PersonBuilder.toPerson(personDO);
    }
}
