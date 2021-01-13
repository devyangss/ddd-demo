package com.study.ddd.demo.domain.leave.vo;

import lombok.Builder;
import lombok.Data;

/**
 * 申请人(值对象)
 * 没有唯一标识,通过对象属性来识别的对象,它讲多个相关属性组合为一个概念整体。
 * 若干个属性的集合
 * 无 ID，不可变，无生命周期，用完即扔。值对象之间通过属性值判断相等性。它的核心本质是值，是一组概念完整的属性组成的集合，用于描述实体的状态和特征。值对象尽量只引用值对象
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@Data
@Builder
public class ApplicantVO {

    private Long applicantId;
    private String applicantName;
}
