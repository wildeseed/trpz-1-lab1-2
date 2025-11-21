package com.example.radio.repository;

import com.example.radio.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
    // Знайти користувача за логіном (для авторизації)
    Optional<UserEntity> findByUsername(String username);
    
    // Перевірка існування email при реєстрації
    boolean existsByEmail(String email);
}