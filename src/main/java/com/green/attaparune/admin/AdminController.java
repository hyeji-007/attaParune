package com.green.attaparune.admin;

import com.green.attaparune.admin.model.AdminSignUpReq;
import com.green.attaparune.common.model.ResultResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("admin")
public class AdminController {
    private final AdminService adminService;

    @PostMapping("sign-up")
    @Operation(summary = "회원가입")
    ResultResponse<Integer> adminSignUp(@RequestBody AdminSignUpReq p){
        int result = adminService.adminSignUp(p);
        return ResultResponse.<Integer>builder()
                .statusCode("200")
                .resultMsg("관리자 회원가입")
                .resultData(result)
                .build();
    }
}
