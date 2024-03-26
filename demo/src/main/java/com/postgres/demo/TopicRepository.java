package com.postgres.demo;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topics, String > {

}
