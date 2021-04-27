package com.study.ddd.demo.web.http.controller;

import com.study.ddd.demo.web.dto.CreateTestReqDTO;
import com.study.ddd.demo.web.dto.CreateTestRespDTO;
import com.study.ddd.demo.web.dto.GetTestRespDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/25
 */
@RestController
@RequestMapping("/test")
@Api(value = "测试", tags = {"测试tag"})
public class TestController {

    @PostMapping
    @ApiOperation(value = "测试添加")
    public ResponseEntity<CreateTestRespDTO> create(@RequestBody CreateTestReqDTO request) {
        CreateTestRespDTO createTestRespDTO = CreateTestRespDTO.builder().id(1000L).build();
        return ResponseEntity.ok(createTestRespDTO);
    }

    @PutMapping
    @ApiOperation(value = "测试更新")
    public ResponseEntity<CreateTestRespDTO> update(@RequestBody CreateTestReqDTO request) {
        CreateTestRespDTO createTestRespDTO = CreateTestRespDTO.builder().id(2000L).build();
        return ResponseEntity.ok(createTestRespDTO);
    }

    @GetMapping(value = "{id}")
    @ApiOperation(value = "根据id获取测试")
    public ResponseEntity<GetTestRespDTO> detail(@PathVariable(value = "id") Long id) {
        GetTestRespDTO getTestRespDTO = GetTestRespDTO.builder()
                .id(3000L)
                .name("developer")
                .age(20)
                .build();
        return ResponseEntity.ok(getTestRespDTO);
    }

    @DeleteMapping(value = "{id}")
    @ApiOperation(value = "删除测试")
    public ResponseEntity<Long> delete(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(id);
    }
}
