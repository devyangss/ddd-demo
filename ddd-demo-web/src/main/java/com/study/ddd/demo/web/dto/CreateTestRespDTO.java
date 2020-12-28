package com.study.ddd.demo.web.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/25
 */
@Data
@Builder
public class CreateTestRespDTO {

    @ApiModelProperty(value = "测试id")
    private Long id;
}
