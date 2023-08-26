package com.natwest.test.prime.service;

import com.natwest.test.prime.pojo.PrimeNumbers;
import com.natwest.test.prime.service.impl.PrimeNumberByBruteForceMethod;
import com.natwest.test.prime.service.impl.PrimeNumberBySquareRootMethod;
import com.natwest.test.prime.service.impl.PrimeNumberService;
import com.natwest.test.prime.service.impl.PrimeNumbersBySieveMethod;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PrimeNumberServiceTest {

    @Test
    public void findPrimeNumbersSieveTest(){
        IPrimeNumberStrategy strategy = new PrimeNumbersBySieveMethod();
        PrimeNumberService service = new PrimeNumberService(strategy);
        PrimeNumbers actual = service.findPrimeNumbers(10);
        Assert.assertTrue(actual.getPrimes().size()==4);
        Assert.assertEquals(List.of(2,3,5,7),actual.getPrimes());
    }

    @Test(expected = AssertionError.class)
    public void findPrimeNumbersSieveErrorTest(){
        IPrimeNumberStrategy strategy = new PrimeNumbersBySieveMethod();
        PrimeNumberService service = new PrimeNumberService(strategy);
        PrimeNumbers actual = service.findPrimeNumbers(10);
        Assert.assertEquals(List.of(2,3,5,7,9),actual.getPrimes());
    }

    @Test
    public void findPrimeNumbersSQRootTest(){
        IPrimeNumberStrategy strategy = new PrimeNumberBySquareRootMethod();
        PrimeNumberService service = new PrimeNumberService(strategy);
        PrimeNumbers actual = service.findPrimeNumbers(10);
        Assert.assertTrue(actual.getPrimes().size()==4);
        Assert.assertEquals(List.of(2,3,5,7),actual.getPrimes());
    }

    @Test(expected = AssertionError.class)
    public void findPrimeNumbersSQRootErrorTest(){
        IPrimeNumberStrategy strategy = new PrimeNumberBySquareRootMethod();
        PrimeNumberService service = new PrimeNumberService(strategy);
        PrimeNumbers actual = service.findPrimeNumbers(10);
        Assert.assertEquals(List.of(2,3,5,7,9),actual.getPrimes());
    }

    @Test
    public void findPrimeNumbersBruteForceTest(){
        IPrimeNumberStrategy strategy = new PrimeNumberByBruteForceMethod();
        PrimeNumberService service = new PrimeNumberService(strategy);
        PrimeNumbers actual = service.findPrimeNumbers(10);
        Assert.assertTrue(actual.getPrimes().size()==4);
        Assert.assertEquals(List.of(2,3,5,7),actual.getPrimes());
    }

    @Test(expected = AssertionError.class)
    public void findPrimeNumbersBruteForceErrorTest(){
        IPrimeNumberStrategy strategy = new PrimeNumberByBruteForceMethod();
        PrimeNumberService service = new PrimeNumberService(strategy);
        PrimeNumbers actual = service.findPrimeNumbers(10);
        Assert.assertEquals(List.of(2,3,5,7,9),actual.getPrimes());
    }



}
