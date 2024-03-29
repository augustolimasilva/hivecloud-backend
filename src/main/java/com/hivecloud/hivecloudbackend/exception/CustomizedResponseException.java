package com.hivecloud.hivecloudbackend.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomizedResponseException {
    private String errorMessage;
    private String statusCode;
}
