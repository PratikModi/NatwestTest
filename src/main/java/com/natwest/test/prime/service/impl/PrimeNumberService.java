package com.natwest.test.prime.service.impl;

import com.natwest.test.prime.pojo.PrimeNumbers;
import com.natwest.test.prime.service.IPrimeNumberService;
import com.natwest.test.prime.service.IPrimeNumberStrategy;
import org.springframework.stereotype.Service;

@Service
public class PrimeNumberService implements IPrimeNumberService {

    private IPrimeNumberStrategy strategy;

    public PrimeNumberService(IPrimeNumberStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public PrimeNumbers findPrimeNumbers(int initial) {
        return new PrimeNumbers(initial,strategy.getPrimeNumbers(initial));
    }
}
