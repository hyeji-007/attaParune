package com.green.attaparune.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailValidationRes {
    @Schema(title = "유효성 검사 결과", example = "true")
    private boolean isValid;

    @Schema(title = "메시지", example = "유효한 이메일입니다.")
    private String message;
}
