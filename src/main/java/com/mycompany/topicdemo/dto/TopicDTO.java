package com.mycompany.topicdemo.dto;

import java.util.Objects;

public class TopicDTO {

    private String topicName;

    private String topicUrl;

    private String description;

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
        return "TopicDTO{" +
                "topicName='" + topicName + '\'' +
                ", topicUrl='" + topicUrl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopicDTO topicDTO = (TopicDTO) o;
        return topicName.equals(topicDTO.topicName) &&
                topicUrl.equals(topicDTO.topicUrl) &&
                description.equals(topicDTO.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicName, topicUrl, description);
    }
}
