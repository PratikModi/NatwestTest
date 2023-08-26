package com.natwest.test.prime.factory;

import com.natwest.test.prime.enums.Algorithms;
import com.natwest.test.prime.service.IPrimeNumberStrategy;
import com.natwest.test.prime.service.impl.PrimeNumberByBruteForceMethod;
import com.natwest.test.prime.service.impl.PrimeNumberBySquareRootMethod;
import com.natwest.test.prime.service.impl.PrimeNumbersBySieveMethod;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
public class AlgorithmFactoryTest {

    @Autowired
    private AlgorithmFactory factory;

    @Test
    public void getAlgorithmStrategySieveTest(){
        IPrimeNumberStrategy strategy = factory.getAlgorithmStrategy(Algorithms.SIEVE);
        Assert.assertTrue((strategy instanceof PrimeNumbersBySieveMethod));
    }

    @Test
    public void getAlgorithmStrategySQRootTest(){
        IPrimeNumberStrategy strategy = factory.getAlgorithmStrategy(Algorithms.SQROOT);
        Assert.assertTrue((strategy instanceof PrimeNumberBySquareRootMethod));
    }

    @Test
    public void getAlgorithmStrategyBruteForceTest(){
        IPrimeNumberStrategy strategy = factory.getAlgorithmStrategy(Algorithms.BRUTE_FORCE);
        Assert.assertTrue((strategy instanceof PrimeNumberByBruteForceMethod));
    }


}
