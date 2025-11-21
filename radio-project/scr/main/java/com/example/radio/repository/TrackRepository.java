package com.example.radio.repository;

import com.example.radio.model.TrackEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TrackRepository extends MongoRepository<TrackEntity, String> {
    // Пошук треків за жанром
    List<TrackEntity> findAllByGenre(String genre);
    
    // Пошук треків конкретного виконавця
    List<TrackEntity> findAllByArtist(String artist);
    
    // Пошук треків, завантажених конкретним DJ
    List<TrackEntity> findAllByOwnerId(String ownerId);
}