package com.Delivery.DeliveryProduct.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Delivery.DeliveryProduct.Model.CustomerDetails;

@RestController
@RequestMapping("/Delivery")
public class DeliveryController {
	
	@Autowired
	CustomerDetails cust;
	
	@GetMapping("/{customerName}")
	public CustomerDetails getCustomerDetials(@PathVariable String customerName) {
		cust.setCustomerName(customerName);
		return cust;
	}

}
