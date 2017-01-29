package com.bsko.moneytracker.service;

import com.bsko.moneytracker.dao.SpendingRepository;
import com.bsko.moneytracker.domain.Spending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by atemnov on 29.01.2017.
 */
@Service
public class SpendingService {

    @Autowired
    private SpendingRepository repository;

    public List<Spending> getAll() {
        return repository.getAll();
    }

    public Spending getById(Integer id) {
        return repository.getById(id);
    }
}
