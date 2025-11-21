package com.example.radio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document("files")
@NoArgsConstructor
@AllArgsConstructor
public abstract class FileEntity {
    @Id
    private String id;
    
    private String ownerId;
    
    private String gridFSFileId; // Посилання на бінарний файл у сховищі
    
    @CreatedDate
    private LocalDateTime createdAt;
}