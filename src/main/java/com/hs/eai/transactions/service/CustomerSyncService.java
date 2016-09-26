package com.hs.eai.transactions.service;

import com.hs.eai.transactions.model.CustomerSync;

public interface CustomerSyncService {

	CustomerSync findByAddressGuid(String addressGuid);
}
