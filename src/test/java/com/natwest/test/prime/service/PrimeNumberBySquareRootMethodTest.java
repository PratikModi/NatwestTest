package com.natwest.test.prime.service;

import com.natwest.test.prime.service.impl.PrimeNumberBySquareRootMethod;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class PrimeNumberBySquareRootMethodTest {

    private IPrimeNumberStrategy strategy;

    @Before
    public void setup(){
        strategy = new PrimeNumberBySquareRootMethod();
    }

    @Test
    public void getPrimeNumbersTest(){
        List<Integer> actual = strategy.getPrimeNumbers(10);
        Assert.assertEquals(List.of(2,3,5,7),actual);
    }

    @Test
    public void getPrimeNumbersIncorrectInputTest(){
        List<Integer> actual = strategy.getPrimeNumbers(1);
        Assert.assertEquals(Collections.emptyList(),actual);
    }

}
