package org.enterprisetools.springframework.boot.youtube;

public class YoutubeVideo {

    private String id;
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
