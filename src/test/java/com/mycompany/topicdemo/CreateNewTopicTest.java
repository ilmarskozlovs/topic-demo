package com.mycompany.topicdemo;

import com.mycompany.topicdemo.model.Topic;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateNewTopicTest {

    @Before
    public void setUp(){

    }

    @Test
    public void testCreateNewTopic(){
        Topic topic = new Topic();
        topic.setId(4);
        topic.setTopicName("C++");
        topic.setTopicUrl("microsoft.com");
        topic.setDescription("dotNet parent site");

        assertThat(4).isEqualTo(topic.getId());
        assertThat("C++").isEqualTo(topic.getTopicName());
        assertThat("microsoft.com").isEqualTo(topic.getTopicUrl());
        assertThat("dotNet parent site").isEqualTo(topic.getDescription());
    }

    @Test
    public void testTopicToString(){
        Topic topic = new Topic();
        topic.setId(4);
        topic.setTopicName("C++");
        topic.setTopicUrl("microsoft.com");
        topic.setDescription("dotNet parent site");

        assertThat("Topic{" +
                "id=" + 4 +
                ", topicName='" + "C++" + '\'' +
                ", topicUrl='" + "microsoft.com" + '\'' +
                ", description='" + "dotNet parent site" + '\'' +
                '}').isEqualTo(topic.toString());
    }

    @Test
    public void testTopicConstructor(){
        Topic topic = new Topic("C++", "microsoft.com", "dotNet parent site");

        assertThat("Topic{" +
                "id=" + 0 +
                ", topicName='" + "C++" + '\'' +
                ", topicUrl='" + "microsoft.com" + '\'' +
                ", description='" + "dotNet parent site" + '\'' +
                '}').isEqualTo(topic.toString());
    }
}
