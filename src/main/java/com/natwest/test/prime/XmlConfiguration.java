package com.natwest.test.prime;

import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Configuration
public class XmlConfiguration {
    @Bean
    MappingJackson2HttpMessageConverter getMappingJackson2HttpMessageConverter(){
        var jaxbAnnotationModule= new JaxbAnnotationModule();
        var mappingJackson2XmlHttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2XmlHttpMessageConverter.getObjectMapper().registerModule(jaxbAnnotationModule);
        return mappingJackson2XmlHttpMessageConverter;
    }

}
