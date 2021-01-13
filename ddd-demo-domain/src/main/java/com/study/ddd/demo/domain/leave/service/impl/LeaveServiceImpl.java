package com.study.ddd.demo.domain.leave.service.impl;

import com.study.ddd.demo.domain.leave.entity.Leave;
import com.study.ddd.demo.domain.leave.repository.LeaveRepository;
import com.study.ddd.demo.domain.leave.service.LeaveService;
import com.study.ddd.demo.domain.leave.vo.ApproverVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@Service
@RequiredArgsConstructor
public class LeaveServiceImpl implements LeaveService {

    private final LeaveRepository leaveRepository;

    @Override
    public void createLeave(Leave leave, ApproverVO approverVO) {
        leave.setApproverVO(approverVO);
        leave.create();
        leaveRepository.save(leave);
    }
}
