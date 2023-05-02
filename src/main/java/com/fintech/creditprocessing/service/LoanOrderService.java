package com.fintech.creditprocessing.service;

import com.fintech.creditprocessing.constant.Status;
import com.fintech.creditprocessing.dto.LoanOrderDTO;

public interface LoanOrderService {

    String createCreditApplication(LoanOrderDTO loanOrderDTO);

    Status getStatusOrder(String orderId);

    void deleteOrder(LoanOrderDTO loanOrderDTO);
}
