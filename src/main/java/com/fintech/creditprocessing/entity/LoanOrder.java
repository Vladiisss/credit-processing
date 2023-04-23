package com.fintech.creditprocessing.entity;


import com.fintech.creditprocessing.constant.Status;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class LoanOrder {

    private Long id;
    private UUID orderId;
    private Long userId;
    private Long tariffId;
    private Double creditRating;
    private Status status;
    private Timestamp timeInsert;
    private Timestamp timeUpdate;
}
