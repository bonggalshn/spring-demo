package com.example.demo.api.transaction.request;

import com.example.demo.core.model.request.BaseRequest;

public class TransactionDetailRequest extends BaseRequest {
    private String transactionId;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
