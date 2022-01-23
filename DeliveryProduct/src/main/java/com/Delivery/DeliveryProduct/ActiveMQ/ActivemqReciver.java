package com.Delivery.DeliveryProduct.ActiveMQ;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.Delivery.DeliveryProduct.Model.CustomerDetails;
import com.Delivery.DeliveryProduct.Transformation.CustomerTransformation;

@Component
public class ActivemqReciver extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("activemq:XmlMessageChannel")
		.log("${body}")
		.unmarshal().jacksonxml(CustomerDetails.class)
		.bean(CustomerTransformation.class)
		.log("${body}")	.to("file:/home/venkateshwara/Desktop/files/Delivery/XMl-JSON?filename=NAME.json");
		
		from("activemq:JSONMessageChannel")
		.to("file:/home/venkateshwara/Desktop/files/Delivery/JSON");
		
		from("activemq:CSVMessageChannel")
		.to("file:/home/venkateshwara/Desktop/files/Delivery/CSV");
		
		

	}

}
