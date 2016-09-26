package com.hs.eai.transactions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hs.eai.transactions.dao.CustomerSyncDao;
import com.hs.eai.transactions.model.CustomerSync;
import com.sun.xml.ws.api.tx.at.Transactional;

@Service
public class CustomerSyncServiceImpl implements CustomerSyncService{

	@Autowired
	CustomerSyncDao customerSyncDao;
	@Override
	@Transactional
	public CustomerSync findByAddressGuid(String addressGuid) {
		// TODO Auto-generated method stub
		return customerSyncDao.findByAddressGuid(addressGuid);
	}

}
