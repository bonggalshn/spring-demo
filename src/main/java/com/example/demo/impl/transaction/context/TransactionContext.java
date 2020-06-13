package com.example.demo.impl.transaction.context;

import com.example.demo.core.model.ProcessContext;
import com.example.demo.core.model.request.BaseRequest;
import com.example.demo.core.model.result.BaseResult;
import com.example.demo.impl.transaction.request.TransactionDetailRequest;
import com.example.demo.impl.transaction.result.TransactionDetailResult;

public class TransactionContext extends ProcessContext<BaseRequest, BaseResult> {
    public TransactionContext(TransactionDetailRequest request, TransactionDetailResult result){
        super(request, result);
    }
}
