package com.alaxat.mountlight;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.alaxat.mountlight")
public class AccountConfiguration {

	@Bean
    public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}
	
}