package com.example.demo.repository.transaction;

import com.example.demo.repository.transaction.entity.TransactionDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionDTO, String> {
//    TransactionDTO findById(String transactionId);
}
