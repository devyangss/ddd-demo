package com.study.ddd.demo.application.command;

import com.study.ddd.demo.domain.leave.entity.Leave;
import com.study.ddd.demo.domain.leave.service.LeaveService;
import com.study.ddd.demo.domain.leave.vo.ApproverVO;
import com.study.ddd.demo.domain.person.entity.Person;
import com.study.ddd.demo.domain.person.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 请假
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@Component
@RequiredArgsConstructor
public class LeaveApplicationCommand {

    private final PersonService personService;
    private final LeaveService leaveService;

    public void createLeaveInfo(Leave leave) {
        // find first approver
        Person approver = personService.getFirstApprover(leave.getApplicantVO().getApplicantId());
        leaveService.createLeave(leave, ApproverVO.fromPerson(approver));
    }
}
