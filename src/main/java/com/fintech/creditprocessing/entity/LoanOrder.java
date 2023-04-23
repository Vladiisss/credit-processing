package com.fintech.creditprocessing.entity;


import com.fintech.creditprocessing.constant.Status;
import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

@Data
@Accessors(chain = true)
public class LoanOrder {

    private Long id;
    private String orderId;
    private Long userId;
    private Long tariffId;
    private Double creditRating;
    private Status status;
    private Timestamp timeInsert;
    private Timestamp timeUpdate;
}
