package com.ozkuran.services;

        import com.ozkuran.model.Transaction;

/**
 * Created by MahmutAli on 5/21/2016.
 */
public interface TransactionService {

    Iterable<Transaction> listAllTransactions();

    Transaction getTransactionById(Integer id);

    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Integer id);
}
