/**
 * 
 */
package com.prft.microservices.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.prft.microservices.producer.model.Client;

/**
 * @author mounika.pandiri
 *
 */

@Service("updateProducerTopicServiceImpl")
public class UpdateProducerTopicServiceImpl implements UpdateProducerTopicService {
	protected Logger log = LoggerFactory.getLogger(UpdateProducerTopicServiceImpl.class);

	@Autowired
	private KafkaTemplate<String, Client> kafkaTemplate;

	private static final String TOPIC = "KafkaProducerTopic";

	public void updateInfoToProducerTopic(Client client) {
		log.info("Entering updateProducerTopic()");
		kafkaTemplate.send(TOPIC, new Client(client.getName(), client.getStatus()));
		log.info("Client details: Name: " + client.getName() + " with Status: " + client.getStatus()
				+ "is sent to the topic:" + TOPIC);
		log.info("Exiting updateProducerTopic()");
	}
}
