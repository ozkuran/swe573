package com.ozkuran.services;

import com.ozkuran.model.TransactionDetail;
import com.ozkuran.repositories.TransactionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MahmutAli on 5/21/2016.
 */

@Service
public class TransactionDetailServiceImpl implements TransactionDetailService{
    private TransactionDetailRepository transactionDetailRepository;

    @Autowired
    public void setProductRepository(TransactionDetailRepository transactionDetailRepository) {
        this.transactionDetailRepository = transactionDetailRepository;
    }

    @Override
    public Iterable<TransactionDetail> listAllTransactionDetails() {
        return transactionDetailRepository.findAll();
    }

    @Override
    public TransactionDetail getTransactionDetailById(Integer id) {
        return transactionDetailRepository.findOne(id);
    }

    @Override
    public TransactionDetail saveTransactionDetail(TransactionDetail transactionDetail) {
        return transactionDetailRepository.save(transactionDetail);
    }

    @Override
    public void deleteTransactionDetail(Integer id) {
        transactionDetailRepository.delete(id);
    }
}
