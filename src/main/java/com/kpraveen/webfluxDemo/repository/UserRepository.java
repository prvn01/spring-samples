package com.kpraveen.webfluxDemo.repository;

import com.kpraveen.webfluxDemo.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User,String> {
}
