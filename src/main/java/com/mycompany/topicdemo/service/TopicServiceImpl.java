package com.mycompany.topicdemo.service;

import com.mycompany.topicdemo.dto.TopicDTO;
import com.mycompany.topicdemo.mapper.TopicMapper;
import com.mycompany.topicdemo.model.Topic;
import com.mycompany.topicdemo.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private TopicMapper topicMapper;

    @Override
    public List<TopicDTO> findAll() {
        return topicMapper.topicsToTopicDTOsMapper(topicRepository.findAll());
    }
}
