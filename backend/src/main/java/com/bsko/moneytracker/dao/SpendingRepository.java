package com.bsko.moneytracker.dao;

import com.bsko.moneytracker.domain.Spending;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by atemnov on 29.01.2017.
 */
@Repository
public class SpendingRepository {

    private List<Spending> data = new ArrayList<>();

    {
        data.add(Spending.builder()
                .id(1)
                .title("Car")
                .description("Bought a new car")
                .price(new BigDecimal(800000))
                .isNegative(Boolean.TRUE).build());
        data.add(Spending.builder()
                .id(2)
                .title("Food")
                .description("Some potatoes and fish")
                .price(new BigDecimal(300))
                .isNegative(Boolean.TRUE).build());
        data.add(Spending.builder()
                .id(3)
                .title("Taxi")
                .description("To get to work")
                .price(new BigDecimal(100))
                .isNegative(Boolean.TRUE).build());
    }

    public List<Spending> getAll() {
        return data;
    }

    public Spending getById(Integer id) {
        return data.stream().filter((item) -> item.getId().equals(id)).findFirst().get();
    }
}
