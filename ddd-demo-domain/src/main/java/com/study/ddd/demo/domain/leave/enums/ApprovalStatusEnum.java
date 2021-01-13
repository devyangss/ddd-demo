package com.study.ddd.demo.domain.leave.enums;

/**
 * 审批状态枚举
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
public enum ApprovalStatusEnum {

    /**
     * 审批状态枚举定义
     */
    APPROVAL_STATUS_WAITING(1, "审批中"),
    APPROVAL_STATUS_PASS(2, "审批通过"),
    APPROVAL_STATUS_REJECT(3, "审批拒绝");

    private Integer index;
    private String name;

    ApprovalStatusEnum(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    public Integer getIndex() {
        return this.index;
    }
}
