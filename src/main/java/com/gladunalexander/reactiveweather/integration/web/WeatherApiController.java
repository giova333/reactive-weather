package com.gladunalexander.reactiveweather.integration.web;

import com.gladunalexander.reactiveweather.integration.ows.Weather;
import com.gladunalexander.reactiveweather.integration.ows.WeatherForecast;
import com.gladunalexander.reactiveweather.integration.ows.WeatherService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/weather")
public class WeatherApiController {

	private final WeatherService weatherService;

	public WeatherApiController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}

	@RequestMapping("/now/{country}/{city}")
	public Mono<Weather> getWeather(@PathVariable String country,
									@PathVariable String city) {
		return this.weatherService.getWeather(country, city);
	}

	@RequestMapping("/weekly/{country}/{city}")
	public Mono<WeatherForecast> getWeatherForecast(@PathVariable String country,
													@PathVariable String city) {
		return this.weatherService.getWeatherForecast(country, city);
	}

}
