package com.example.demo.impl.transaction.processor;

import com.example.demo.api.transaction.dto.TransactionSummary;
import com.example.demo.api.transaction.request.TransactionDetailRequest;
import com.example.demo.api.transaction.request.TransactionListRequest;
import com.example.demo.api.transaction.result.TransactionDetailResult;
import com.example.demo.api.transaction.result.TransactionListResult;
import com.example.demo.core.model.Money;
import com.example.demo.core.model.Processor;
import com.example.demo.core.model.util.AssertUtil;
import com.example.demo.impl.transaction.context.TransactionContext;
import com.example.demo.repository.transaction.TransactionRepository;
import com.example.demo.repository.transaction.entity.TransactionDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GetTransactionListInfoProcessor implements Processor <TransactionContext> {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public boolean isSkipped(TransactionContext context) {
        return false;
    }

    @Override
    public void check(TransactionContext context) {

    }

    @Override
    public void doProcess(TransactionContext context) {
        TransactionListRequest request = (TransactionListRequest) context.getRequest();
        TransactionListResult result = (TransactionListResult) context.getResult();

        composeResult(request, result);
        result.setSuccess(true);
    }

    private void composeResult(TransactionListRequest request, TransactionListResult result){
        List<TransactionDTO> transactionDTOS = transactionRepository.findAll();

        List<TransactionSummary> transactionSummaries = transactionDTOS.parallelStream().map(dto ->{
            TransactionSummary summary = new TransactionSummary();
            summary.setTransactionId(dto.getId());
            summary.setTransactionTitle(dto.getTransactionTitle());
            summary.setTransactionType(dto.getTransactionType());

            Money transactionAmount = new Money();
            transactionAmount.setAmount(Integer.parseInt(dto.getTransactionAmount()));
            transactionAmount.setCurrency(dto.getTransactionCurrency());
            summary.setTransactionAmount(transactionAmount);
            return summary;
        }).collect(Collectors.toList());

        result.setTransactionSummaries(transactionSummaries);
    }
}
