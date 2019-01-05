package com.prft.microservices.producer.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author mounika.pandiri
 *
 */
public class UpdateProducerTopicTest {

	@Autowired
	private UpdateProducerTopic updateProducerTopic;

	/**
	 * Test method for
	 * {@link com.prft.microservices.producer.controller.UpdateProducerTopic#updateProducerTopic()}.
	 */
	@Test
	public void contextLoads() throws Exception {
		assertThat(updateProducerTopic).isNotNull();
	}

}