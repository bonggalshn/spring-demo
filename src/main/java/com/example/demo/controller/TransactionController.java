package com.example.demo.controller;

import com.example.demo.api.transaction.TransactionApi;
import com.example.demo.api.transaction.request.TransactionDetailRequest;
import com.example.demo.api.transaction.request.TransactionListRequest;
import com.example.demo.api.transaction.result.TransactionDetailResult;
import com.example.demo.api.transaction.result.TransactionListResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/transaction")
public class TransactionController {

    @Autowired
    private TransactionApi transactionApi;

    @PostMapping(value = "/queryDetail")
    public TransactionDetailResult queryDetail(@RequestBody TransactionDetailRequest request){
        return transactionApi.queryTransactionDetail(request);
    }

    @PostMapping(value = "/queryList")
    public TransactionListResult queryList(@RequestBody TransactionListRequest request){
        return transactionApi.queryTransactionList(request);
    }
}
