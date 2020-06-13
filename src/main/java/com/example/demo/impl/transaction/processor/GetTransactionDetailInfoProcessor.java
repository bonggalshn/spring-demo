package com.example.demo.impl.transaction.processor;

import com.example.demo.core.model.Money;
import com.example.demo.core.model.Processor;
import com.example.demo.impl.transaction.context.TransactionContext;
import com.example.demo.impl.transaction.result.TransactionDetailResult;

public class GetTransactionDetailInfoProcessor implements Processor <TransactionContext> {

    @Override
    public boolean isSkipped(TransactionContext context) {
        return false;
    }

    @Override
    public void check(TransactionContext context) {

    }

    @Override
    public void doProcess(TransactionContext context) {
        TransactionDetailResult result = (TransactionDetailResult) context.getResult();
        result.setTransactionTitle("10000");

        Money transactionAmount = new Money();
        transactionAmount.setAmount(1000);
        transactionAmount.setCurrency("IDR");
        result.setTransactionAmount(transactionAmount);

        result.setSuccess(true);
    }
}
