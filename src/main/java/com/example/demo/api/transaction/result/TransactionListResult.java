package com.example.demo.api.transaction.result;

import com.example.demo.api.transaction.dto.TransactionSummary;
import com.example.demo.core.model.result.BaseResult;

import java.util.List;

public class TransactionListResult extends BaseResult {
    private List<TransactionSummary> transactionSummaries;

    public List<TransactionSummary> getTransactionSummaries() {
        return transactionSummaries;
    }

    public void setTransactionSummaries(List<TransactionSummary> transactionSummaries) {
        this.transactionSummaries = transactionSummaries;
    }
}
