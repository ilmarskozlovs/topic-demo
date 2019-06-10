package com.mycompany.topicdemo.repository;

import com.mycompany.topicdemo.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
