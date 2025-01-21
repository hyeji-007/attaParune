package com.green.attaparune.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(title = "이메일 유효성 검사")
public class EmailValidationReq {
    @NotEmpty(message = "이메일을 입력해주세요.")
    @Schema(title = "유저 이메일", example = "test@gmail.com", requiredMode = Schema.RequiredMode.REQUIRED)
    private String email;
}
