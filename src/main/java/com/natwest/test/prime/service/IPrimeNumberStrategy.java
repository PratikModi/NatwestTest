package com.natwest.test.prime.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPrimeNumberStrategy {
    List<Integer> getPrimeNumbers(int initial);
}
