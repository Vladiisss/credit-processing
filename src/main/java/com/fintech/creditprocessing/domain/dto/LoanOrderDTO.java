package com.fintech.creditprocessing.domain.dto;

public record LoanOrderDTO(

        Long userId,
        Long tariffId,
        String orderId
) {
}
