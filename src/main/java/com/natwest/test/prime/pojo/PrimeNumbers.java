package com.natwest.test.prime.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class PrimeNumbers {
    @XmlElement(name = "initial", required = true)
    private int initial;
    @XmlElementWrapper(name = "primes",required = true)
    @XmlElement(name = "prime",required = true)
    private List<Integer> primes;

}
