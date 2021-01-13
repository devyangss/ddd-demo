package com.study.ddd.demo.domain.person.entity;

import lombok.Data;

/**
 * 人员(聚合根)
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@Data
public class Person {

    private Long personId;
    private String personName;
}
