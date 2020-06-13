package com.example.demo.impl.transaction.request;

import com.example.demo.core.request.BaseRequest;

public class TransactionDetailRequest extends BaseRequest {
    private String transactionId;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
