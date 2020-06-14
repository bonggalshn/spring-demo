package com.example.demo.impl.transaction.processor;

import com.example.demo.core.model.Processor;
import com.example.demo.core.model.util.AssertUtil;
import com.example.demo.impl.transaction.context.TransactionContext;
import com.example.demo.impl.transaction.request.TransactionDetailRequest;
import com.example.demo.impl.transaction.result.TransactionDetailResult;
import com.example.demo.repository.transaction.TransactionRepository;
import com.example.demo.repository.transaction.entity.TransactionDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class GetTransactionDetailInfoProcessor implements Processor <TransactionContext> {

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
        TransactionDetailRequest request = (TransactionDetailRequest) context.getRequest();
        TransactionDetailResult result = (TransactionDetailResult) context.getResult();

        composeResult(request, result);
        result.setSuccess(true);
    }

    private void composeResult(TransactionDetailRequest request, TransactionDetailResult result){
        System.out.printf("request: "+ request.getTransactionId());
        Optional<TransactionDTO> dto = transactionRepository.findById(request.getTransactionId());
        System.out.printf("dto: "+dto.toString());
        AssertUtil.isTrue(dto.isPresent(), "value of dto is null");
        TransactionDTO transactionDTO = dto.get();
        AssertUtil.notNull(transactionDTO, "transactionDTO is null");

        result.setTransactionTitle(transactionDTO.getTransactionTitle());
        result.setTransactionDescription(transactionDTO.getTransactionDescription()+" "+transactionDTO.getTransactionDate());
    }
}
