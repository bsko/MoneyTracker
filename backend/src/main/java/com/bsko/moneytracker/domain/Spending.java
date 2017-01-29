package com.bsko.moneytracker.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by atemnov on 29.01.2017.
 */
@Data
@Builder
public class Spending {
    private Integer id;
    private String title;
    private String description;
    private BigDecimal price;
    private Boolean isNegative;
}
