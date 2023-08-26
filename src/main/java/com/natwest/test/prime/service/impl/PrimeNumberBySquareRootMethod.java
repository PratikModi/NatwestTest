package com.natwest.test.prime.service.impl;

import com.natwest.test.prime.service.IPrimeNumberStrategy;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PrimeNumberBySquareRootMethod implements IPrimeNumberStrategy {

    @Override
    @Cacheable("primeNumbers")
    public List<Integer> getPrimeNumbers(int initial) {
        //System.out.println("Calling Method");
        var result = new ArrayList<Integer>();
        for(int i=2;i<=initial;i++){
            if(isPrimeWithSquareRoot(i)){
                result.add(i);
            }
        }
        return result;
    }


    private boolean isPrimeWithSquareRoot(int N) {
        if (N <= 1)
            return false;
        if (N == 2 || N == 3)
            return true;
        if (N % 2 == 0 || N % 3 == 0)
            return false;
        for (int i = 5; i <= Math.sqrt(N); i = i + 6)
            if (N % i == 0 || N % (i + 2) == 0)
                return false;
        return true;
    }
}
