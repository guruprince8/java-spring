package org.enterprisetools.springframework.boot.youtube;
import java.util.ArrayList;
import java.util.List;
public class YoutubeResponse {

    public YoutubeResponse(){
        videos = new ArrayList<YoutubeVideo>();
        YoutubeVideo youtubeVideo = new YoutubeVideo();
        youtubeVideo.setId("1");youtubeVideo.setSource("videos/drug.mp4");
        videos.add(youtubeVideo);
    }
    private List<YoutubeVideo> videos;

    public List<YoutubeVideo> getVideos() {
        return videos;
    }

    public void setVideos(List<YoutubeVideo> videos) {
        this.videos = videos;
    }
}
