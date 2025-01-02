package org.enterprisetools.springframework.boot.kafka;

import java.time.LocalDateTime;

public class KafkaEventRequest {

    private String source;
    private LocalDateTime timestamp;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
