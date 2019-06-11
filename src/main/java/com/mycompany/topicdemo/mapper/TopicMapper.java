package com.mycompany.topicdemo.mapper;

import com.mycompany.topicdemo.dto.TopicDTO;
import com.mycompany.topicdemo.model.Topic;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface TopicMapper {

    Topic topicDTOtoTopicMapper(TopicDTO topicDTO);

    TopicDTO topicToTopicDTOMapper(Topic topic);

    List<TopicDTO> topicsToTopicDTOsMapper(List<Topic> topics);

    List<Topic> topicDTOsToTopicMapper(List<TopicDTO> topicDTOS);
}
