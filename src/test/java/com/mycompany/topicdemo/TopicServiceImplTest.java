package com.mycompany.topicdemo;

import com.mycompany.topicdemo.model.Topic;
import com.mycompany.topicdemo.repository.TopicRepository;
import com.mycompany.topicdemo.service.TopicService;
import com.mycompany.topicdemo.service.TopicServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicServiceImplTest {

    @MockBean
    TopicRepository topicRepository;

    @Autowired
    TopicServiceImpl topicService;

    @Test
    public void testTopicServiceImplFindAll(){
        Topic newTopic = new Topic("aaa", "www", "ddd");

        Topic topicNew = new Topic("zzz", "yyy", "ppp");

        List<Topic> topics = new ArrayList<>();
        topics.add(newTopic);
        topics.add(topicNew);

        Mockito.when(topicRepository.findAll()).thenReturn(topics);

        assertThat(topicService.findAll()).isEqualTo(topicRepository.findAll());
    }

}
