package com.example.demo.controller;

import com.example.demo.api.TransactionApi;
import com.example.demo.impl.transaction.request.TransactionDetailRequest;
import com.example.demo.impl.transaction.result.TransactionDetailResult;
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
    public TransactionDetailResult query(@RequestBody TransactionDetailRequest request){
        return transactionApi.queryTransactionDetail(request);
    }
}
