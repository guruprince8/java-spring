package org.enterprisetools.springframework.boot.kafka;


import org.apache.commons.text.RandomStringGenerator;

import java.util.UUID;

@SuppressWarnings("all")
public class KafkaEventResponse {

    private String eventId;

    KafkaEventResponse(){
//        this.eventId = new RandomStringGenerator.Builder().withinRange('0','z').build().generate(32);
        this.eventId = UUID.randomUUID().toString();
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
}
