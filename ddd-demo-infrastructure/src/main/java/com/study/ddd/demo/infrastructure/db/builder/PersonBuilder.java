package com.study.ddd.demo.infrastructure.db.builder;

import com.study.ddd.demo.domain.person.entity.Person;
import com.study.ddd.demo.infrastructure.db.dataobject.PersonDO;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
public class PersonBuilder {

    public static Person toPerson(PersonDO personDO) {
        if (Objects.isNull(personDO)) {
            return null;
        }
        Person person = new Person();
        BeanUtils.copyProperties(personDO, person);

        return person;
    }
}
