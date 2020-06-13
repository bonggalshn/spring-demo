package com.example.impl.transaction;

import com.example.api.transaction.TransactionApi;
import com.example.api.transaction.request.TransactionDetailRequest;
import com.example.api.transaction.result.TransactionDetailResult;

public class TransactionApiImpl implements TransactionApi {

    @Override
    public TransactionDetailResult getTransactionDetail(TransactionDetailRequest request) {
        TransactionDetailResult result = new TransactionDetailResult();
        return result;
    }
}
