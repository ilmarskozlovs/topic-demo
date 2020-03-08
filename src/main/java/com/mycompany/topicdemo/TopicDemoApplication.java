package com.mycompany.topicdemo;

import com.mycompany.topicdemo.model.Topic;
import com.mycompany.topicdemo.repository.TopicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TopicDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopicDemoApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(TopicDemoApplication.class);

	@Bean
	public CommandLineRunner saveDefaultTopics(TopicRepository topicRepository){
		return (args -> {
			topicRepository.save(new Topic("java", "oracle.com", "topic for java"));
			topicRepository.save(new Topic("python", "python.com", "learning site for python"));
			topicRepository.save(new Topic("php", "php.de", "php website"));
			topicRepository.save(new Topic("php1", "php.de", "php website"));
			topicRepository.save(new Topic("php2", "php.de", "php website"));
			topicRepository.save(new Topic("php3", "php.de", "php website"));
			topicRepository.save(new Topic("php4", "php.de", "php website"));
			topicRepository.save(new Topic("php5", "php.de", "php website"));

			topicRepository.findAll().forEach(c -> {
				log.info("Topic: {}", c);
			});
		});
		}
}
