package com.example.demo.impl.transaction.processor;

import com.example.demo.core.model.Processor;
import com.example.demo.impl.transaction.context.TransactionContext;

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
    }
}
