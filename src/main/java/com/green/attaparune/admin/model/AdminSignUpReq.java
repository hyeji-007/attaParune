package com.green.attaparune.admin.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(title = "관리자 로그인")
public class AdminSignUpReq {
    @Schema(title = "관리자 권한", example = "ROLE_RESTAURANT")
    private String roleId;
    @Schema(title = "관리자 아이디", example = "asd")
    private String aid;
    @Schema(title = "관리자 비밀번호", example = "asd")
    private String apw;
    @Schema(title = "관리자 이름", example = "홍길동")
    private String name;
    @Schema(title = "관리자 이메일", example = "asd@naver.com")
    private String email;
    @Schema(title = "관리자 폰 전화", example = "01012345678")
    private String phone;
}
