package com.example.demo.api;

import com.example.demo.impl.transaction.request.TransactionDetailRequest;
import com.example.demo.impl.transaction.result.TransactionDetailResult;

public interface TransactionApi {
    public TransactionDetailResult queryTransactionDetail(TransactionDetailRequest request);
}