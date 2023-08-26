package com.natwest.test.prime.service.impl;

import com.natwest.test.prime.service.IPrimeNumberStrategy;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Primary
public class PrimeNumbersBySieveMethod implements IPrimeNumberStrategy {

    @Override
    @Cacheable("primeNumbers")
    public List<Integer> getPrimeNumbers(int initial) {
        System.out.println("Calling Method");
        boolean[] AR = new boolean[initial+1];
        Arrays.fill(AR,true);

        for(int i=2;i<Math.sqrt(initial);i++){
            if(AR[i]) {
                for (int j = i * i; j <= initial; j=j+i) {
                    if(AR[j]){
                        AR[j]=false;
                    }
                }
            }
        }
        var result = new ArrayList<Integer>();
        for(int i=2;i<=initial;i++){
            if(AR[i]){
                result.add(i);
            }
        }
        return result;
    }
}
