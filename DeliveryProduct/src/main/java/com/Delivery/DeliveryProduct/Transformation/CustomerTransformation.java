package com.Delivery.DeliveryProduct.Transformation;

import java.io.IOException;

import com.Delivery.DeliveryProduct.Model.CustomerDetails;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomerTransformation {
	
	public String transform(CustomerDetails cust)
	{
		 ObjectMapper Obj = new ObjectMapper();
		 
	        try {
	 
	            // get Oraganisation object as a json string
	            String jsonStr = Obj.writeValueAsString(cust);
	 
	            // Displaying JSON String
	            return jsonStr;
	        }
	 
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	        return "Somthing error while transformation to JSON";
	}

}
