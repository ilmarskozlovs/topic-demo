package com.mycompany.topicdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String topicName;

    private String topicUrl;

    private String description;

    public Topic() {
    }

    public Topic(String topicName, String topicUrl, String description) {
        this.topicName = topicName;
        this.topicUrl = topicUrl;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicUrl() {
        return topicUrl;
    }

    public void setTopicUrl(String topicUrl) {
        this.topicUrl = topicUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", topicName='" + topicName + '\'' +
                ", topicUrl='" + topicUrl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
