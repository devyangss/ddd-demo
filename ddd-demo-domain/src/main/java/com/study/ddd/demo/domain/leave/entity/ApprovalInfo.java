package com.study.ddd.demo.domain.leave.entity;

import com.study.ddd.demo.domain.leave.vo.ApproverVO;
import lombok.Data;

/**
 * 审批意见(实体)
 * 有唯一标识,且标识在经历各种状态变更后仍能保持一致
 * 具有业务属性、业务行为和业务逻辑
 * 有 ID 标识，通过 ID 判断相等性，ID 在聚合内唯一即可。状态可变，它依附于聚合根，其生命周期由聚合根管理
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@Data
public class ApprovalInfo {

    private String approvalInfoId;
    private ApproverVO approverVO;
    private String description;
}
