package com.fintech.creditprocessing.dto;

import com.fintech.creditprocessing.constant.Status;

import java.sql.Timestamp;
import java.util.UUID;

public record LoanOrderDTO(

        Long userId,
        Long tariffId,
        UUID orderId
) {
}
