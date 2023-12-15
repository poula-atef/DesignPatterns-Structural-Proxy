package com.mycode.designpatternsstructuralproxy.entities;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader {
    private final VideoDownloader videoDownloader;
    private final Map<String, Video> videos;

    public ProxyVideoDownloader() {
        videoDownloader = new YoutubeVideoDownloader();
        videos = new HashMap<>();
    }

    @Override
    public Video download(String videoName) {
        if (!videos.containsKey(videoName)) {
            videos.put(videoName, videoDownloader.download(videoName));
        }
        return videos.get(videoName);
    }
}
