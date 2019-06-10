package com.mycompany.topicdemo.service;

import com.mycompany.topicdemo.model.Topic;
import com.mycompany.topicdemo.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Override
    public List<Topic> findAll() {
        return topicRepository.findAll();
    }
}
