package kh.springcloud.eureka.service2;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kh.springcloud.eureka.domain.ExampleResponse;
import kh.springcloud.eureka.domain.ZipResponse;

@RestController
public class Service2RestController {

	//hardcoded list of zips to illustrate a validation lookup
	private List<String> validZips = Arrays.asList("95616", "95618");
	
	@GetMapping(value = "/example2", produces = "application/json")
	public ExampleResponse example2(){
		ExampleResponse response = new ExampleResponse("hello from SpringBootService2");
		
		return response;
	}
	
	@GetMapping(value = "/zip/{zipcode}", produces = "application/json")
	public ResponseEntity<ZipResponse> validateZip(@PathVariable String zipCode){
		boolean result = validZips.contains(zipCode);
	
		return new ResponseEntity<ZipResponse>(new ZipResponse(result), HttpStatus.OK);
	}
}
