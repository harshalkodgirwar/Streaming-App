package com.harshal.streaming_application.services;

import com.harshal.streaming_application.entities.Video;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface VideoService {

    Video save(Video video, MultipartFile file);

    Video get(String videoId);

    Video getBytTitle(String title);

    List<Video> getAllVideos();
}
