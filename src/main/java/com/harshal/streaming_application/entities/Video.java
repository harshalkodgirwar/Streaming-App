package com.harshal.streaming_application.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "yt_videoes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Video {

    @Id
    private String VideoId;

    private String title;

    private String description;

    private String contentType;

    private String filePath;

    @ManyToOne
    private Course course;
}
