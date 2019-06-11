package com.mycompany.topicdemo.service;

import com.mycompany.topicdemo.dto.TopicDTO;
import com.mycompany.topicdemo.model.Topic;

import java.util.List;

public interface TopicService {

    List<TopicDTO> findAll();

    TopicDTO getTopicById(Long id);

    TopicDTO saveTopic(TopicDTO topicDTO);

    void deleteTopicById(Long id);

}
