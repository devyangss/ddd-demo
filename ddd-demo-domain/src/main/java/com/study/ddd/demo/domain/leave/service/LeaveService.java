package com.study.ddd.demo.domain.leave.service;

import com.study.ddd.demo.domain.leave.entity.Leave;
import com.study.ddd.demo.domain.leave.vo.ApproverVO;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
public interface LeaveService {

    public void createLeave(Leave leave, ApproverVO approverVO);
}
