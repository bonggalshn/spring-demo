package com.example.api.transaction;

import com.example.api.transaction.request.TransactionDetailRequest;
import com.example.api.transaction.result.TransactionDetailResult;

public interface TransactionApi {
    public TransactionDetailResult getTransactionDetail(TransactionDetailRequest request);
}