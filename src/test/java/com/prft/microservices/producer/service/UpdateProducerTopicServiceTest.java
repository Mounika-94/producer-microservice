/**
 * 
 */
package com.prft.microservices.producer.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.prft.microservices.producer.model.Client;

/**
 * @author mounika.pandiri
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UpdateProducerTopicServiceTest {

	@Autowired
	private UpdateProducerTopicService updateProducerTopicService;

	@Test
	public void tesUpdateProducerTopicServicet() {
		Client client = new Client();
		updateProducerTopicService.updateInfoToProducerTopic(client);
		assertThat(updateProducerTopicService).isNotNull();
	}
}
