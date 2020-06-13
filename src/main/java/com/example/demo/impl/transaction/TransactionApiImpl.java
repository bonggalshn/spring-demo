package com.example.demo.impl.transaction;

import com.example.demo.api.TransactionApi;
import com.example.demo.impl.transaction.request.TransactionDetailRequest;
import com.example.demo.impl.transaction.result.TransactionDetailResult;


public class TransactionApiImpl implements TransactionApi {

    @Override
    public TransactionDetailResult getTransactionDetail(TransactionDetailRequest request) {
        TransactionDetailResult result = new TransactionDetailResult();
        result.setSuccess(true);
        result.setTransactionTitle(request.getTransactionId());
        return result;
    }
}
