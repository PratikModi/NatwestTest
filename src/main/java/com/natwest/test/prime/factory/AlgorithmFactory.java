package com.natwest.test.prime.factory;

import com.natwest.test.prime.enums.Algorithms;
import com.natwest.test.prime.service.IPrimeNumberStrategy;
import com.natwest.test.prime.service.impl.PrimeNumberByBruteForceMethod;
import com.natwest.test.prime.service.impl.PrimeNumberBySquareRootMethod;
import com.natwest.test.prime.service.impl.PrimeNumbersBySieveMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlgorithmFactory {

    @Autowired
    private PrimeNumbersBySieveMethod primeNumbersBySieveMethod;

    @Autowired
    private PrimeNumberBySquareRootMethod primeNumberBySquareRootMethod;

    @Autowired
    private PrimeNumberByBruteForceMethod primeNumberByBruteForceMethod;

    public IPrimeNumberStrategy getAlgorithmStrategy(Algorithms algorithm){
        if(algorithm.equals(Algorithms.SIEVE)){
            return primeNumbersBySieveMethod;
        }else if(algorithm.equals(Algorithms.SQROOT)){
            return primeNumberBySquareRootMethod;
        }else{
            return primeNumberByBruteForceMethod;
        }
    }

}
