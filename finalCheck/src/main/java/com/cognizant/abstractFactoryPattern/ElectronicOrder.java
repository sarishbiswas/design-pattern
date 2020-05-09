package com.cognizant.abstractFactoryPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectronicOrder extends Order {
	private static final Logger LOGGER = LoggerFactory.getLogger(ElectronicOrder.class);
	public ElectronicOrder(Channel channel, ProductType productType) {
		super(channel, productType);
		processOrder();
	}

	@Override
	void processOrder() {
		LOGGER.info("Electronic Order is Placed.");
	}

}
