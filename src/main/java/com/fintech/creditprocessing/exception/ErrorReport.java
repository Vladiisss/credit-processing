package com.fintech.creditprocessing.exception;


import com.fintech.creditprocessing.constant.ErrorCode;

public record ErrorReport(ErrorCode code, String message) {}
