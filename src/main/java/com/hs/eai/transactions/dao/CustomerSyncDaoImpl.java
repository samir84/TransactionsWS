package com.hs.eai.transactions.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.hs.eai.transactions.common.GenericDaoImpl;
import com.hs.eai.transactions.model.CustomerSync;

@Repository
public class CustomerSyncDaoImpl extends GenericDaoImpl<CustomerSync> implements CustomerSyncDao{

	private static final Logger logger = LoggerFactory.getLogger(CustomerSyncDaoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	
	public CustomerSync findByAddressGuid(String addressGuid) {
		// TODO Auto-generated method stub
		CustomerSync customer = null;
		logger.debug("Find CustomerSync By AddressGui {} ",addressGuid);
		try{
			Query query = entityManager.createNamedQuery("CustomerSync.findByAddressGuid");
			query.setParameter("addressGuid", addressGuid);
			List<CustomerSync> cutomers = (List<CustomerSync>)query.getResultList();
			if(cutomers.size() > 1){
				logger.debug("Find CustomerSync find AddressGui error is: found more than one customer ");
				customer = cutomers.get(0);
			}else if(cutomers == null){
				logger.info("No CustomerSync find AddressGui wih AddressGui {} ",addressGuid);
				return null;
			}else{
				customer = cutomers.get(0);
			}
			
		}catch(Exception ex){
			logger.error("Find CustomerSync find AddressGui error is: ",ex.getMessage());
			ex.printStackTrace();
		}
		return customer;
	}

	@Override
	public List<CustomerSync> findByProperties(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

}
