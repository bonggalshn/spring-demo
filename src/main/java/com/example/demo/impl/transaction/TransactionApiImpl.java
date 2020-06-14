package com.example.demo.impl.transaction;

import com.example.demo.api.transaction.TransactionApi;
import com.example.demo.api.transaction.request.TransactionListRequest;
import com.example.demo.api.transaction.result.TransactionListResult;
import com.example.demo.core.model.Processor;
import com.example.demo.impl.transaction.context.TransactionContext;
import com.example.demo.api.transaction.request.TransactionDetailRequest;
import com.example.demo.api.transaction.result.TransactionDetailResult;

import java.util.List;


public class TransactionApiImpl implements TransactionApi {

    private List<Processor<TransactionContext>> queryTransactionDetailProcessors;
    private List<Processor<TransactionContext>> queryTransactionListProcessors;

    @Override
    public TransactionDetailResult queryTransactionDetail(TransactionDetailRequest request) {
        TransactionDetailResult result = new TransactionDetailResult();
        TransactionContext context = new TransactionContext(request, result);
        queryTransactionDetailProcessors.forEach(processor -> {
            if (processor.isSkipped(context)) {
                return;
            }
            processor.check(context);
            processor.doProcess(context);

        });
        return (TransactionDetailResult) context.getResult();
    }

    @Override
    public TransactionListResult queryTransactionList(TransactionListRequest request) {
        TransactionListResult result = new TransactionListResult();
        TransactionContext context = new TransactionContext(request, result);
        queryTransactionListProcessors.forEach(processor -> {
            if (processor.isSkipped(context)) {
                return;
            }
            processor.check(context);
            processor.doProcess(context);

        });
        return (TransactionListResult) context.getResult();
    }

    public void setQueryTransactionDetailProcessors(List<Processor<TransactionContext>> queryTransactionDetailProcessors) {
        this.queryTransactionDetailProcessors = queryTransactionDetailProcessors;
    }

    public void setQueryTransactionListProcessors(List<Processor<TransactionContext>> queryTransactionListProcessors) {
        this.queryTransactionListProcessors = queryTransactionListProcessors;
    }
}
