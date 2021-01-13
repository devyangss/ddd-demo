package com.study.ddd.demo.infrastructure.db.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * 人员
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@Data
@TableName("person")
public class PersonDO {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 人员姓名
     */
    private String name;

    private Integer isDelete;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifiedTime;
}
