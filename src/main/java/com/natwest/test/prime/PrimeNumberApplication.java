package com.natwest.test.prime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableCaching(proxyTargetClass = true)
public class PrimeNumberApplication{

    public static void main(String[] args) {
        SpringApplication.run(PrimeNumberApplication.class, args);
    }
}
