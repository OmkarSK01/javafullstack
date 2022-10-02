package com.codekul.javafullstack.ioc;

//import com.codekul.javafullstack.jio;
//import com.codekul.javafullstack.Vodafone;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimConfig{
    @Bean
    public com.codekul.javafullstack.ioc.Vodafone getVodafone() { return new com.codekul.javafullstack.ioc.Vodafone(); }
    @Bean
   public com.codekul.javafullstack.ioc.Jio getjio(){
       return new com.codekul.javafullstack.ioc.Jio(); }
    }

