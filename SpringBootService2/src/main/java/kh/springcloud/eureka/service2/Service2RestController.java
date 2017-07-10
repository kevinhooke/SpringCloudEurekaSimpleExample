package kh.springcloud.eureka.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kh.springcloud.eureka.domain.ExampleResponse;

@RestController
public class Service2RestController {

	@GetMapping(value = "/example2", produces = "application/json")
	public ExampleResponse example2(){
		ExampleResponse response = new ExampleResponse("hello from SpringBootService2");
		
		return response;
	}
	
}
