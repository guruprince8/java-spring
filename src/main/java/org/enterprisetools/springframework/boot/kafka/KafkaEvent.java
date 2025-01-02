package org.enterprisetools.springframework.boot.kafka;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_event",schema = "ml_dev")
public class KafkaEvent {
    @Id
    @Column(name = "event_id")
    private String eventId;

    @Column(name = "source")
    private String source;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

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

    public String toString(){
        return "[eventId="+this.eventId+", source="+this.source+",timestamp="+this.timestamp;
    }
}
