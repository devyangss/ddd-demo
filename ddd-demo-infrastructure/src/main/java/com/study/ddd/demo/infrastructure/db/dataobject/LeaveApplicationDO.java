package com.study.ddd.demo.infrastructure.db.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * 请假申请单
 * 与数据库表结构一一对应，通过DAO层向上传输数据源对象
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/29
 */
@Data
@TableName("leave_application")
@Builder
public class LeaveApplicationDO {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 申请人id
     */
    private Long applicantId;
    /**
     * 申请人姓名
     */
    private String applicantName;
    /**
     * 审批人id
     */
    private Long approverId;
    /**
     * 审批人姓名
     */
    private String approverName;
    /**
     * 请假类型
     */
    @EnumValue
    private Integer leaveType;
    /**
     * 请假开始时间
     */
    private Date beginTime;
    /**
     * 请假结束时间
     */
    private Date endTime;
    /**
     * 审批状态
     */
    private Integer approveStatus;

    private Integer isDelete;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifiedTime;

}
