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

    @Override
    public TopicDTO getTopicById(Long id) {
        return topicMapper.topicToTopicDTOMapper(topicRepository.findById(id).orElse(null));
    }

    @Override
    public TopicDTO saveTopic(TopicDTO topicDTO) {
        Topic topic = topicMapper.topicDTOtoTopicMapper(topicDTO);
        topicRepository.save(topic);
        return topicMapper.topicToTopicDTOMapper(topic);
    }

    @Override
    public void deleteTopicById(Long id) {
        topicRepository.deleteById(id);
    }
}
