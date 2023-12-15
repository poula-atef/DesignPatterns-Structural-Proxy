package com.mycode.designpatternsstructuralproxy.entities;

public class YoutubeVideoDownloader implements VideoDownloader {

    @Override
    public Video download(String videoName) {
        System.out.println("Opening Youtube...");
        System.out.println("Downloading Video With Name " + videoName + "...");
        return new Video(videoName, "https://www.youtube.com/" + videoName);
    }
}
