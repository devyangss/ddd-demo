package com.study.ddd.demo.domain.leave.entity;

import com.study.ddd.demo.domain.leave.enums.ApprovalStatusEnum;
import com.study.ddd.demo.domain.leave.enums.LeaveTypeEnum;
import com.study.ddd.demo.domain.leave.vo.ApplicantVO;
import com.study.ddd.demo.domain.leave.vo.ApproverVO;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 请假(聚合根)
 * 聚合根是实体，有实体的特点，具有全局唯一标识，有独立的生命周期。
 * 一个聚合只有一个聚合根，聚合根在聚合内对实体和值对象采用直接对象引用的方式进行组织和协调，
 * 聚合根与聚合根之间通过 ID 关联的方式实现聚合之间的协同
 * 采用充血模型
 * 包含属性、值对象、实体、业务行为
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@Data
public class Leave {

    private String id;
    private ApplicantVO applicantVO;
    private ApproverVO approverVO;
    private LeaveTypeEnum leaveTypeEnum;
    private ApprovalInfo approvalInfo;
    private ApprovalStatusEnum approvalStatusEnum;
    private Date beginTime;
    private Date endTime;
    private long duration;
    private List<ApprovalInfo> approvalInfoHistory;

    public void create() {
        this.setApprovalStatusEnum(ApprovalStatusEnum.APPROVAL_STATUS_WAITING);
        this.setBeginTime(new Date());
    }
}
