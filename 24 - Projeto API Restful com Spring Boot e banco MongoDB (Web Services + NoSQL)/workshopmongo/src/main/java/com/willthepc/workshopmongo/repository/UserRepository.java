package com.willthepc.workshopmongo.repository;

import com.willthepc.workshopmongo.domain.Post;
import com.willthepc.workshopmongo.domain.User;
import org.apache.coyote.Response;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
