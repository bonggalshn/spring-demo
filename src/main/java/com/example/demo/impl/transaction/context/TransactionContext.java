package com.example.demo.impl.transaction.context;

import com.example.demo.core.model.ProcessContext;
import com.example.demo.core.model.request.BaseRequest;
import com.example.demo.core.model.result.BaseResult;

public class TransactionContext extends ProcessContext<BaseRequest, BaseResult> {
    public TransactionContext(BaseRequest request, BaseResult result){
        super(request, result);
    }
}
