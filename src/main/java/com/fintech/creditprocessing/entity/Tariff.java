package com.fintech.creditprocessing.entity;


import com.fintech.creditprocessing.constant.Type;
import lombok.Data;

@Data
public class Tariff {

    Long id;
    Type type;
    String interestRate;
}
