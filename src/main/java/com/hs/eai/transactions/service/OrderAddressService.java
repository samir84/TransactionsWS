package com.hs.eai.transactions.service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.StringReader;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import com.hs.eai.orderoverview.orderjaxb.Order;
import com.hs.eai.orderoverview.orderjaxb.Order.OrderHeader.Address;



@Service
public class OrderAddressService {

	

	public Order  UnmarshalOrderXML(String orderXml){
		
		Order order = null ;
		InputStream is = null;
		try{
			orderXml = orderXml.replace("?<?xml", "<?xml").replace("xmlns:ns0=\""+"http://HenrySchein.com/OneWeb/Schema/JDEOrder \"", "")
					.replace("AddressLine1", "address1")
					.replace("AddressLine2", "address2");
		
			is = new ByteArrayInputStream(orderXml.getBytes("UTF-8"));
			JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			order = (Order) jaxbUnmarshaller.unmarshal(is);
		}catch(Exception ex){
			ex.printStackTrace();
			return null ;
		}
		return order;

	}
}
