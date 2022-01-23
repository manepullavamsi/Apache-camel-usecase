package com.customer.CustomerOrder.ActiveMq;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
@Component
public class ActiveMQ extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		from("file:/home/venkateshwara/Desktop/files/CustomerOrder/")
		.log("${body}")
//		.to("activemq:XmlMessageChannel");
		.choice()
		.when(simple("${file:ext} contains 'xml' "))
		.to("activemq:XmlMessageChannel")
		.log("XML file sent  ${file:name}")
		.when(simple("${file:ext} contains 'json' "))
		.to("activemq:JSONMessageChannel")
		.log("JSON file sent ${file:name} ")
		.when(simple("${file:ext} contains 'csv' "))
		.to("activemq:CSVMessageChannel")
		.log("CSV file sent ${file:name} ")
		.otherwise()
		.to("activemq:DefaultMessageChannel")
		.end()
		.log("activemq:${messageHistory}");
		
		
		restConfiguration().host("localhost").port(8081);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		rest("/Delivery")
        .get("/hello").to("direct:hello");
		
		
		
		
		
		
		
		
		
		
		
		
		
//		restConfiguration().host("localhost").port(8081);
//		from("rest:get:/Delivery/'Venkat'")
//		.log("${body}");
//		from("timer:active-mq-timer?period=200000")
//		.transform().constant("My current Message")
//		.to("activemq:my-actve-queue");
		
	}

}

