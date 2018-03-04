package com.gladunalexander.reactiveweather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableConfigurationProperties(WeatherAppProperties.class)
@EnableCaching(proxyTargetClass = true)
public class ReactiveWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveWeatherApplication.class, args);
	}
}
