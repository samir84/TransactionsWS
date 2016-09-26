package com.hs.eai.transactions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hs.eai.orderoverview.orderjaxb.Order;
import com.hs.eai.transactions.model.CustomerSync;
import com.hs.eai.transactions.service.CustomerSyncService;
import com.hs.eai.transactions.service.OrderAddressService;


@RestController
public class CustomerSyncController {

	@Autowired
	CustomerSyncService customerSyncService;
	@Autowired
	OrderAddressService orderAddressService;
	@RequestMapping(value = "/customer/{addresGuid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerSync> getCustomerSync(@PathVariable("addresGuid") String addresGuid) {

		CustomerSync customer = customerSyncService.findByAddressGuid(addresGuid);

		if (customer == null  ) {
			return new ResponseEntity<CustomerSync>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<CustomerSync>(customer, HttpStatus.OK);
	}
	@RequestMapping(value = "/orderXml/{addresGuid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Order> getOrderXml(@PathVariable("addresGuid") String addresGuid) {

		CustomerSync customer = customerSyncService.findByAddressGuid(addresGuid);
		Order orderXML = orderAddressService.UnmarshalOrderXML(customer.getMessageContent());

		if (orderXML == null  ) {
			return new ResponseEntity<Order>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Order>(orderXML, HttpStatus.OK);
	}
	
	
}
