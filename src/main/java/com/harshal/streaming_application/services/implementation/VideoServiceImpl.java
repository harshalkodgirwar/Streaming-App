package com.harshal.streaming_application.services.implementation;

import com.harshal.streaming_application.entities.Video;
import com.harshal.streaming_application.services.VideoService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Override
    public Video save(Video video, MultipartFile file) {
        return null;
    }

    @Override
    public Video get(String videoId) {
        return null;
    }

    @Override
    public Video getBytTitle(String title) {
        return null;
    }

    @Override
    public List<Video> getAllVideos() {
        return List.of();
    }
}
