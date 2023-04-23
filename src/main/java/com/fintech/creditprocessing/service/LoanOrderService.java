package com.fintech.creditprocessing.service;

import com.fintech.creditprocessing.dto.LoanOrderDTO;

public interface LoanOrderService {

    String createCreditApplication(LoanOrderDTO loanOrderDTO);

}
