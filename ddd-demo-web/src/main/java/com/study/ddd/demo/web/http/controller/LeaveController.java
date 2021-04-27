package com.study.ddd.demo.web.http.controller;

import com.study.ddd.demo.application.command.LeaveApplicationCommand;
import com.study.ddd.demo.web.assembler.LeaveAssembler;
import com.study.ddd.demo.web.dto.CreateLeaveReqDTO;
import com.study.ddd.demo.web.dto.CreateLeaveRespDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author shuaishuai.yang@medbanks.cn
 * @date 2020/12/30
 */
@RestController
@RequestMapping("/leave")
@Api(value = "请假", tags = {"请假"})
@RequiredArgsConstructor
public class LeaveController {

    private final LeaveApplicationCommand leaveApplicationCommand;

    @PostMapping
    @ApiOperation("创建请假单")
    public ResponseEntity<CreateLeaveRespDTO> create(@RequestBody CreateLeaveReqDTO request) {
        leaveApplicationCommand.createLeaveInfo(LeaveAssembler.toLeave(request));
        CreateLeaveRespDTO createLeaveRespDTO = new CreateLeaveRespDTO();
        return ResponseEntity.ok(createLeaveRespDTO);
    }
}
