package kh.springcloud.eureka.service1;


import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import kh.springcloud.eureka.service1.domain.Address;
import kh.springcloud.eureka.service1.domain.AddressResult;
import kh.springcloud.eureka.service1.domain.ExampleResponse;
import kh.springcloud.eureka.service1.domain.ZipResponse;

@RestController
@RequestMapping("/example1")
public class Service1RestController {

	@Autowired
    private DiscoveryClient discoveryClient;
	
	//Ribbon client and Eureka-aware RestTemplate
	@Autowired
    private RestTemplate restTemplate;
	
	@GetMapping(value = "/hello", produces = "application/json")
	public ExampleResponse example1(){
		ExampleResponse response = new ExampleResponse("hello from SpringBootService1");
		
		return response;
	}
	
	@PostMapping("/address")
	public ResponseEntity<AddressResult> addAddress(Address address) throws RestClientException, URISyntaxException{
		
		ResponseEntity<ZipResponse> exchange =
				this.restTemplate.exchange(new RequestEntity<Address>(address, HttpMethod.GET,
						new URI("http://service2/zip/" + address.getZip())),
						ZipResponse.class);
		
		
		return new ResponseEntity<AddressResult>(new AddressResult(), HttpStatus.OK);
	}
	
}
