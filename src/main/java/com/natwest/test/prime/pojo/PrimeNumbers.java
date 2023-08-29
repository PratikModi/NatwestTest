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
    @XmlElement(name = "Initial", required = true)
    private int initial;
    @XmlElementWrapper(name = "Primes",required = true)
    @XmlElement(name = "Prime",required = true)
    private List<Integer> primes;

}
