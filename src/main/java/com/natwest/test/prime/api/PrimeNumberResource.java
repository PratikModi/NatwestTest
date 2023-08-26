package com.natwest.test.prime.api;

import com.natwest.test.prime.enums.Algorithms;
import com.natwest.test.prime.factory.AlgorithmFactory;
import com.natwest.test.prime.service.IPrimeNumberService;
import com.natwest.test.prime.service.impl.PrimeNumberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@Slf4j
public class PrimeNumberResource {

    private IPrimeNumberService primeNumberService;

    @Autowired
    private AlgorithmFactory factory;

    @RequestMapping(value = "/primes/{initial}",produces = {/*MediaType.APPLICATION_XML_VALUE,*/MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity getPrimeNumbers(@PathVariable("initial") Integer initial, @RequestParam(required = false)Algorithms algorithm) {

        if(Objects.isNull(initial) || initial.intValue()<2){
            return ResponseEntity.badRequest().body("Invalid Input.");
        }
        if(Objects.isNull(algorithm)){
            algorithm=Algorithms.SIEVE;
        }

        primeNumberService = new PrimeNumberService(factory.getAlgorithmStrategy(algorithm));
        var primeNumber = primeNumberService.findPrimeNumbers(initial);
        return ResponseEntity.ok(primeNumber);

    }


}
