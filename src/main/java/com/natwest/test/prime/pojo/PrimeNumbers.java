package com.natwest.test.prime.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "PrimeNumbers")
@XmlAccessorType(XmlAccessType.FIELD)
public class PrimeNumbers {

    @XmlElement(name = "Initial")
    @JsonProperty(value = "Initial")
    private int initial;
    @XmlElement(name = "Primes")
    @JsonProperty(value = "Primes")
    private List<Integer> primes;



}
