package org.enterprisetools.springframework.boot.youtube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YoutubeController {

    @GetMapping("/youtube/v1/videos/all")
    public YoutubeResponse fetchAllVideos (){
        YoutubeResponse youtubeResponse;
        youtubeResponse = new YoutubeResponse();
        return youtubeResponse;
    }
}
