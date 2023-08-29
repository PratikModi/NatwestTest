package com.natwest.test.prime;

import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

@Configuration
public class XmlConfiguration {
    @Bean
    MappingJackson2XmlHttpMessageConverter getMappingJackson2HttpMessageConverter(){
        var jaxbAnnotationModule= new JaxbAnnotationModule();
        var mappingJackson2XmlHttpMessageConverter = new MappingJackson2XmlHttpMessageConverter();
        mappingJackson2XmlHttpMessageConverter.getObjectMapper().registerModule(jaxbAnnotationModule);
        return mappingJackson2XmlHttpMessageConverter;
    }

}
