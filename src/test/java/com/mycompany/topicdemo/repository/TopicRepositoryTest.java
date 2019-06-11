package com.mycompany.topicdemo.repository;

import com.mycompany.topicdemo.model.Topic;
import com.mycompany.topicdemo.repository.TopicRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TopicRepositoryTest {

    @Autowired
    EntityManager entityManager;

    @Autowired
    TopicRepository topicRepository;

    @Test
    public void testTopicRepositoryFindAll(){
        topicRepository.deleteAll();

        Topic topic = new Topic("aaa", "bbb", "ccc");
        entityManager.persist(topic);
        entityManager.flush();

        List<Topic> topics = topicRepository.findAll();

        assertThat(topics.size()).isEqualTo(1);
    }
}
