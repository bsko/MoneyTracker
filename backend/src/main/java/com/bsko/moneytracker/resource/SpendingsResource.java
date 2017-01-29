package com.bsko.moneytracker.resource;

import com.bsko.moneytracker.domain.Spending;
import com.bsko.moneytracker.service.SpendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by atemnov on 29.01.2017.
 */
@RestController
public class SpendingsResource {

    @Autowired
    private SpendingService service;

    @RequestMapping(value = "spending", method = RequestMethod.GET)
    public ResponseEntity<List<Spending>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
