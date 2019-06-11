package com.mycompany.topicdemo.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TopicDTOTest {

    @Test
    public void testCreateTopicDTO(){
        TopicDTO topicDTO = new TopicDTO();
        topicDTO.setTopicName("topic");
        topicDTO.setTopicUrl("www.topic.com");
        topicDTO.setDescription("description");

        assertThat(topicDTO.getTopicName()).isEqualTo("topic");
        assertThat(topicDTO.getTopicUrl()).isEqualTo("www.topic.com");
        assertThat(topicDTO.getDescription()).isEqualTo("description");
    }

    @Test
    public void testTopicDTOtoString(){
        TopicDTO topicDTO = new TopicDTO();
        topicDTO.setTopicName("topic");
        topicDTO.setTopicUrl("www.topic.com");
        topicDTO.setDescription("description");

        assertThat("TopicDTO{" +
                "topicName='" + "topic" + '\'' +
                ", topicUrl='" + "www.topic.com" + '\'' +
                ", description='" + "description" + '\'' +
                '}').isEqualTo(topicDTO.toString());
    }
}
