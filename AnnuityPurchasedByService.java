package com.lic.epgs.mst.service;

import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lic.epgs.mst.entity.AnnuityPurchasedBy;

public interface AnnuityPurchasedByService {

	Logger logger = LoggerFactory.getLogger(AnnuityPurchasedByService.class);
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	List<AnnuityPurchasedBy> getAllAnnuityPurchasedBy();

	public AnnuityPurchasedBy getAnnuityPurchasedByById(long id);

	public default AnnuityPurchasedBy findByCode(String code) {
		logger.info("Search request received for code: {}", code);
		logger.info("Timestamp: {}", dateFormat.format(new Date()));
		
		// Existing code to find the AnnuityPurchasedBy object by code
		
		return annuityPurchasedBy;
	}

	public void calculateGrat();

}