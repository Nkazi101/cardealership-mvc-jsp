package com.cardealership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cardealership.models.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    
    
}

