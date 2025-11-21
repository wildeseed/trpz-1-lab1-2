package com.example.radio.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.CreatedDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@Document("playlists")
@NoArgsConstructor
@AllArgsConstructor
public class PlaylistEntity {
    @Id
    private String id;
    
    private String title;
    
    private String ownerId; // ID користувача-власника
    
    private List<String> trackIds; // Список ID треків
    
    @CreatedDate
    private LocalDateTime createdAt;
}