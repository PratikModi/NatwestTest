package com.natwest.test.prime.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "PrimeNumbers")
@XmlAccessorType(XmlAccessType.FIELD)
public class PrimeNumbers {

    @XmlElement(name = "Initial")
    private int initial;
    @XmlElementWrapper(name = "Primes")
    @XmlElement(name = "Prime")
    private List<Integer> primes;

}
