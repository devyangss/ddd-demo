package com.study.ddd.demo.domain.leave.repository;

import com.study.ddd.demo.domain.leave.entity.Leave;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
public interface LeaveRepository {

    public Long save(Leave leave);
}
