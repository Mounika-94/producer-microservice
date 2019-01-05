/**
 * This class updates/send messages to the configured producer topic.
 */
package com.prft.microservices.producer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author mounika.pandiri
 *
 */
public class UpdateProducerTopic {

	protected Logger log = LoggerFactory.getLogger(UpdateProducerTopic.class);

	public void updateProducerTopic() {
		log.info("Entering updateProducerTopic()");
		log.info("Exiting updateProducerTopic()");
	}
}