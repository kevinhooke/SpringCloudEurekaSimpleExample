package kh.springcloud.eureka.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kh.springcloud.eureka.domain.ExampleResponse;

@RestController
public class Service1RestController {

	@GetMapping(value = "example1", produces = "application/json")
	public ExampleResponse example1(){
		ExampleResponse response = new ExampleResponse("hello from SpringBootService1");
		
		return response;
	}
	
}
