package com.study.ddd.demo.web.dto;

import lombok.Data;

import java.util.Date;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@Data
public class CreateLeaveReqDTO {

    private String id;
    private Long approverId;
    private String approverName;
    private Integer leaveType;
    private Date beginTime;
    private Date endTime;
}
