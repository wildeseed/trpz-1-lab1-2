package com.example.radio.repository;

import com.example.radio.model.PlaylistEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PlaylistRepository extends MongoRepository<PlaylistEntity, String> {
    // Отримати всі плейлисти конкретного користувача
    List<PlaylistEntity> findAllByOwnerId(String ownerId);
}