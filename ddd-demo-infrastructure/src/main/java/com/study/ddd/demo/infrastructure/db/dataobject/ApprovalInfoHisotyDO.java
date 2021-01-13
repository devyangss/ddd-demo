package com.study.ddd.demo.infrastructure.db.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@Data
@TableName("approval_info_history")
@Builder
public class ApprovalInfoHisotyDO {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private Long leaveApplicationId;

    private Long applicantId;

    private Long approverId;

    private String approverName;

    private String description;

    private Integer isDelete;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifiedTime;

}
