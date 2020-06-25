package com.example.demo;

import io.micronaut.data.annotation.Repository;
import io.micronaut.spring.beans.MicronautBeanProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

  @Bean
  MicronautBeanProcessor beanProcessor() {
    return new MicronautBeanProcessor(Repository.class);
  }
}
