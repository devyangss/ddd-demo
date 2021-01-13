package com.study.ddd.demo.infrastructure.db.repository.impl;

import com.study.ddd.demo.domain.leave.entity.ApprovalInfo;
import com.study.ddd.demo.domain.leave.entity.Leave;
import com.study.ddd.demo.domain.leave.repository.LeaveRepository;
import com.study.ddd.demo.infrastructure.db.builder.LeaveBuilder;
import com.study.ddd.demo.infrastructure.db.dataobject.LeaveApplicationDO;
import com.study.ddd.demo.infrastructure.db.mapper.ApprovalInfoHistoryMapper;
import com.study.ddd.demo.infrastructure.db.mapper.LeaveMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@Repository
@RequiredArgsConstructor
public class LeaveRepositoryImpl implements LeaveRepository {

    private final LeaveMapper leaveMapper;
    private final ApprovalInfoHistoryMapper approvalInfoHistoryMapper;

    @Override
    public Long save(Leave leave) {
        LeaveApplicationDO leaveApplicationDO = LeaveBuilder.fromLeave(leave);
       leaveMapper.insert(leaveApplicationDO);

        return leaveApplicationDO.getId();
    }
}
