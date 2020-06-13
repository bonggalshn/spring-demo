package com.example.demo.impl.transaction.processor;

import com.example.demo.core.model.Money;
import com.example.demo.core.model.Processor;
import com.example.demo.impl.transaction.context.TransactionContext;
import com.example.demo.impl.transaction.result.TransactionDetailResult;

public class SetTransactionDetailAmountProcessor implements Processor<TransactionContext> {
    @Override
    public boolean isSkipped(TransactionContext context) {
        return false;
    }

    @Override
    public void check(TransactionContext context) {

    }

    @Override
    public void doProcess(TransactionContext context) {
        Money transactionAmount = new Money();
        transactionAmount.setCurrency("IDR");
        transactionAmount.setAmount(25000);

        TransactionDetailResult result = (TransactionDetailResult) context.getResult();
        result.setTransactionAmount(transactionAmount);
    }
}
