package com.springjms.activemq.service;

import com.springjms.activemq.messaging.MessageSender;
import com.springjms.activemq.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by krishna1bhat on 8/13/17.
 */
@Service("productService")
public class ProductServiceImpl implements ProductService{

	static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	@Autowired
	MessageSender messageSender;
	
	@Override
	public void sendProduct(Product product) {
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		LOG.info("Application : sending order request {}", product);
		messageSender.sendMessage(product);
		LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	
	
}
