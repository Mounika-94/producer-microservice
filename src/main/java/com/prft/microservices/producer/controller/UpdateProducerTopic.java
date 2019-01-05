/**
 * This class updates/send messages to the configured producer topic.
 */
package com.prft.microservices.producer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prft.microservices.producer.model.Client;


/**
 * @author mounika.pandiri
 *
 */

@RestController
@RequestMapping(value = "/kafka")
public class UpdateProducerTopic {

	protected Logger log = LoggerFactory.getLogger(UpdateProducerTopic.class);

	@PostMapping(value = "/updateProducer", consumes = "application/json")
	public void updateProducerTopic(@RequestBody Client client) throws Exception {
		log.info("Entering updateProducerTopic()");
		log.info("Exiting updateProducerTopic()");
	}
	
}