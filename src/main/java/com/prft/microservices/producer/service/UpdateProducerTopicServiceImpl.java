/**
 * 
 */
package com.prft.microservices.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.prft.microservices.producer.model.Client;

/**
 * @author mounika.pandiri
 *
 */

public class UpdateProducerTopicServiceImpl implements UpdateProducerTopicService {
	protected Logger log = LoggerFactory.getLogger(UpdateProducerTopicServiceImpl.class);

	public void updateInfoToProducerTopic(Client client) {
		log.info("Entering updateProducerTopic()");
		log.info("Exiting updateProducerTopic()");
	}
}
