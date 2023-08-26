package com.natwest.test.prime.service.impl;

import com.natwest.test.prime.service.IPrimeNumberStrategy;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PrimeNumberByBruteForceMethod implements IPrimeNumberStrategy {

    @Override
    @Cacheable("primeNumbers")
    public List<Integer> getPrimeNumbers(int initial) {
        //System.out.println("Calling Method");
        var result = new ArrayList<Integer>();
        for(int i=2;i<=initial;i++){
            if(isPrime(i)){
                result.add(i);
            }
        }
        return result;
    }

    private boolean isPrime(int N){
        if(N==0||N==1)
            return false;
        for(int i=2;i<N;i++){
            if(N%i==0)
                return false;
        }
        return true;
    }
}
