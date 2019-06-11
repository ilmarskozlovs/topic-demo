package com.mycompany.topicdemo.service;

import com.mycompany.topicdemo.dto.TopicDTO;
import com.mycompany.topicdemo.model.Topic;

import java.util.List;

public interface TopicService {

    List<TopicDTO> findAll();

}
