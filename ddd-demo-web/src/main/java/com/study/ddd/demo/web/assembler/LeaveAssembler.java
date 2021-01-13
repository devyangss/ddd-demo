package com.study.ddd.demo.web.assembler;

import com.study.ddd.demo.domain.leave.entity.Leave;
import com.study.ddd.demo.domain.leave.vo.ApplicantVO;
import com.study.ddd.demo.web.dto.CreateLeaveReqDTO;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
public class LeaveAssembler {

    public static Leave toLeave(CreateLeaveReqDTO createLeaveReqDTO) {
        Leave leave = new Leave();

        return leave;
    }
}
