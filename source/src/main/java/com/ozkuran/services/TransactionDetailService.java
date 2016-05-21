package com.ozkuran.services;

import com.ozkuran.model.TransactionDetail;

/**
 * Created by MahmutAli on 5/21/2016.
 */
public interface TransactionDetailService {

    Iterable<TransactionDetail> listAllTransactionDetails();

    TransactionDetail getTransactionDetailById(Integer id);

    TransactionDetail saveTransactionDetail(TransactionDetail transactionDetail);

    void deleteTransactionDetail(Integer id);
}
