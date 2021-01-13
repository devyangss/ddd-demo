package com.study.ddd.demo.domain.leave.enums;

/**
 * 请假类型枚举
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
public enum LeaveTypeEnum {

    /**
     * 请假类型枚举定义
     */
    LEAVE_TYPE_YEAR(1, "年假"),
    LEAVE_TYPE_PERSONAL(2, "事假"),
    LEAVE_TYPE_SICK(3, "病假"),
    LEAVE_TYPE_MARRIAGE(4, "婚假"),
    LEAVE_TYPE_MATERNITY(5, "产假"),
    LEAVE_TYPE_PATERNITY(6, "陪产假");


    private Integer index;
    private String name;

    LeaveTypeEnum(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    public Integer getIndex() {
        return this.index;
    }
}
