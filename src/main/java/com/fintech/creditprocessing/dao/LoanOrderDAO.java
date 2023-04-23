package com.fintech.creditprocessing.dao;

import com.fintech.creditprocessing.entity.LoanOrder;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LoanOrderDAO {

    private static final String
            SQL_INSERT = "INSERT INTO loan_order(order_id, user_id, tariff_id," +
            " credit_rating, status, time_insert, time_update) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_GET_ORDERS_BY_ID = "SELECT * FROM loan_order WHERE user_id=?";

    private final JdbcTemplate jdbcTemplate;

    public List<LoanOrder> getLoanOrdersByUserId(Long userId) {
        return jdbcTemplate.query(SQL_GET_ORDERS_BY_ID, new BeanPropertyRowMapper<>(LoanOrder.class), userId);
    }

    public void save(LoanOrder loanOrder) {
        jdbcTemplate.update(SQL_INSERT,
                loanOrder.getOrderId(), loanOrder.getUserId(), loanOrder.getTariffId(), loanOrder.getCreditRating(),
                loanOrder.getStatus().toString(), loanOrder.getTimeInsert(), loanOrder.getTimeUpdate());
    }
}
