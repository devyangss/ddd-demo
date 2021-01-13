package com.study.ddd.demo.infrastructure.db.builder;

import com.study.ddd.demo.domain.leave.entity.Leave;
import com.study.ddd.demo.infrastructure.db.dataobject.LeaveApplicationDO;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
public class LeaveBuilder {

    public static LeaveApplicationDO fromLeave(Leave leave) {
        return LeaveApplicationDO.builder()
                .applicantId(leave.getApplicantVO().getApplicantId())
                .applicantName(leave.getApplicantVO().getApplicantName())
                .approverId(leave.getApproverVO().getApproverId())
                .approverName(leave.getApproverVO().getApproverName())
                .leaveType(leave.getLeaveTypeEnum().getIndex())
                .beginTime(leave.getBeginTime())
                .endTime(leave.getEndTime())
                .approveStatus(leave.getApprovalStatusEnum().getIndex())
                .build();
    }
}
