package com.fintech.creditprocessing.dto;

public record LoanOrderDTO(

        Long userId,
        Long tariffId,
        String orderId
) {
}
