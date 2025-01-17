package com.rag.rag4j.template.enums.code;

import com.rag.rag4j.common.enums.code.ICommonCustomCode;
import com.rag.rag4j.common.exception.response.ICommonResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum TempSuccessCode implements ICommonResponseCode {

    DEFAULT(HttpStatus.OK, TempCustomSuccessCode.DEFAULT.getCode(), TempCustomSuccessCode.DEFAULT.getMessage()),
    ;

    private final HttpStatus httpStatus;

    private final long customCode;

    private final String message;


}
