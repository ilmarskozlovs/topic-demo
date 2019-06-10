package com.mycompany.topicdemo.controller;

import com.mycompany.topicdemo.model.Topic;
import com.mycompany.topicdemo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/all")
    public List<Topic> getAllTopics(){
        return topicService.findAll();
    }
}
