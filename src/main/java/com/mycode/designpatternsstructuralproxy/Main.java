package com.mycode.designpatternsstructuralproxy;

import com.mycode.designpatternsstructuralproxy.entities.ProxyVideoDownloader;
import com.mycode.designpatternsstructuralproxy.entities.VideoDownloader;

public class Main {

    public static void main(String[] args) {
        VideoDownloader downloader = new ProxyVideoDownloader();
        downloader.download("first video");
        downloader.download("second video");
        downloader.download("first video");
        downloader.download("second video");
    }

}
