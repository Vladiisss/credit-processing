package com.fintech.creditprocessing.dao;

import com.fintech.creditprocessing.entity.Tariff;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TariffDAO {

    private static final String SQL_SELECT_ALL = "SELECT * FROM tariff";

    private final JdbcTemplate jdbcTemplate;


    public List<Tariff> getAllTariffs() {

        return jdbcTemplate.query(SQL_SELECT_ALL, new BeanPropertyRowMapper<>(Tariff.class));

    }
}
