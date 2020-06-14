package com.example.demo.api.transaction;

import com.example.demo.api.transaction.request.TransactionDetailRequest;
import com.example.demo.api.transaction.request.TransactionListRequest;
import com.example.demo.api.transaction.result.TransactionDetailResult;
import com.example.demo.api.transaction.result.TransactionListResult;

public interface TransactionApi {
    TransactionDetailResult queryTransactionDetail(TransactionDetailRequest request);
    TransactionListResult queryTransactionList(TransactionListRequest request);
}