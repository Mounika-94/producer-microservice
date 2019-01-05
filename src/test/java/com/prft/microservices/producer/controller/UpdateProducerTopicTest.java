package com.prft.microservices.producer.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author mounika.pandiri
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
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