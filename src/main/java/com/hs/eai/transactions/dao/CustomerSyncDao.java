package com.hs.eai.transactions.dao;

import com.hs.eai.transactions.model.CustomerSync;

public interface CustomerSyncDao {

	CustomerSync findByAddressGuid(String addressGuid);
}
