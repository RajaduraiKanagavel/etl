package com.xerago.cvm.etl.routes;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xerago.cvm.etl.domain.repository.PiplineRepository;

@Component
@Transactional
public class Testing {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Testing.class);
	
	@Autowired
	private PiplineRepository piplineRepository;
	
	@PostConstruct
	public void test() {
		LOGGER.info("test: "+ piplineRepository.findAll().get(0).getSourceDatabase().getUrl());
	}

}
