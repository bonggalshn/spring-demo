package com.example.demo.core.error;

import java.util.Map;

public class BaseErrorContext {
    private String errorMessage;
    private String errorCode;
    private Map<String, String> extendErrorInfo;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Map<String, String> getExtendErrorInfo() {
        return extendErrorInfo;
    }

    public void setExtendErrorInfo(Map<String, String> extendErrorInfo) {
        this.extendErrorInfo = extendErrorInfo;
    }

    public void addExtendErrorInfo(String key, String value){
        this.extendErrorInfo.put(key, value);
    }
}
