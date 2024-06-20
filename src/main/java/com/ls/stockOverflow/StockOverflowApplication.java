package com.ls.stockOverflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@RestController
@SpringBootApplication
public class StockOverflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockOverflowApplication.class, args);
	}

//	@GetMapping("/hello")
//	public String sayHello () {
//		return String.format("Hello World");
//	}
}
