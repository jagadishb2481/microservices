package shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import shopping.service.ShoppingService;

@RestController
public class ShoppingController {
	
	@Autowired
	ShoppingService shoppingService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getHome")
	public String home(){
		//restTemplate.exchange("http://PRODUCT-SERVICE/home", HttpMethod.GET, null, String.class);
		return restTemplate.getForObject("http://PRODUCT-SERVICE/home", String.class);
	}
	
	
	

}
