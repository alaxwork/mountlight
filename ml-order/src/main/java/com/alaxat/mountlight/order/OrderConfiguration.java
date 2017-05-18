package com.alaxat.mountlight.order;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.alaxat.mountlight.order")
public class OrderConfiguration {

	@Bean
    public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}
}