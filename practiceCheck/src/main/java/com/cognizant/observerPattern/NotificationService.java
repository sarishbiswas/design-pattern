package com.cognizant.observerPattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationService implements INotificationService {
	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);
	List<INotificationObserver> observers;
	public NotificationService() {
		observers = new ArrayList<INotificationObserver>();
	}

	public void addSubscriber(INotificationObserver observer) {
		observers.add(observer);
		for (INotificationObserver iNotificationObserver : observers) {
			LOGGER.info(iNotificationObserver.toString());
		}
	}


	public void removeSubscriber(INotificationObserver observer) {
		observers.remove(observer);
		for (INotificationObserver iNotificationObserver : observers) {
			LOGGER.info(iNotificationObserver.toString());
		}
	}

	public void notifySubscriber() {
		for (INotificationObserver iNotificationObserver : observers) {
			iNotificationObserver.onServerDown();
		}
	}

}
