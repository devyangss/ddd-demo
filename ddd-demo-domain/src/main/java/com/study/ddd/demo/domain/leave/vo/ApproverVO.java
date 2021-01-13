package com.study.ddd.demo.domain.leave.vo;

import com.study.ddd.demo.domain.person.entity.Person;
import lombok.Builder;
import lombok.Data;

/**
 * 审批人(值对象)
 * 值对象除了属性集之外，还可以有简单的数据查询和转换服务
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@Data
@Builder
public class ApproverVO {

    private Long approverId;
    private String approverName;

    public static ApproverVO fromPerson(Person person) {
        return ApproverVO.builder()
                .approverId(person.getPersonId())
                .approverName(person.getPersonName())
                .build();
    }
}
