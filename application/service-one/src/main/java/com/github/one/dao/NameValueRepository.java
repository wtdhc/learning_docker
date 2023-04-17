package com.github.one.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.github.one.domain.NameValue;
import org.springframework.stereotype.Repository;

@Repository
public interface NameValueRepository extends ReactiveMongoRepository<NameValue, String> {

}
