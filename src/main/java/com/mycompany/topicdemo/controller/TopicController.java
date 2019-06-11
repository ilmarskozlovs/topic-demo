package com.mycompany.topicdemo.controller;

import com.mycompany.topicdemo.dto.TopicDTO;
import com.mycompany.topicdemo.model.Topic;
import com.mycompany.topicdemo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/all")
    public List<TopicDTO> getAllTopics(){
        return topicService.findAll();
    }

    @PostMapping("/save")
    public TopicDTO saveTopic(@RequestBody TopicDTO topicDTO){
        return topicService.saveTopic(topicDTO);
    }

    @GetMapping("/findById/{id}")
    public TopicDTO getTopicById(@PathVariable("id")Long id){
        return topicService.getTopicById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTopicById(@PathVariable Long id){
        topicService.deleteTopicById(id);
    }
}
