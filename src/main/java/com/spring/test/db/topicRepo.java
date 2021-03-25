package com.spring.test.db;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

public interface topicRepo extends CrudRepository<topics, String> {


}
