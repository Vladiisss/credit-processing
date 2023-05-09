package com.fintech.creditprocessing.entity;


import com.fintech.creditprocessing.constant.Type;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tariff {

    Long id;
    Type type;
    String interestRate;
}
