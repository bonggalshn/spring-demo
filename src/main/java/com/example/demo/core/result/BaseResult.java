package com.example.demo.core.result;

import com.example.demo.core.error.ErrorContext;

import java.util.Map;

public class BaseResult {
    private boolean success;
    private Map<String, String> extendInfo;
    private ErrorContext errorContext;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Map<String, String> getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(Map<String, String> extendInfo) {
        this.extendInfo = extendInfo;
    }

    public ErrorContext getErrorContext() {
        return errorContext;
    }

    public void setErrorContext(ErrorContext errorContext) {
        this.errorContext = errorContext;
    }
}
