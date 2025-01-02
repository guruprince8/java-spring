package org.enterprisetools.springframework.boot.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaController {

    @Autowired
    KafkaEventService kafkaEventService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/kafka/v1/event")
    public KafkaEventResponse publishEvent(@RequestBody KafkaEventRequest kafkaEventRequest){
        System.out.println(kafkaEventRequest.getTimestamp());
        KafkaEventResponse kafkaEventResponse;
        kafkaEventResponse = new KafkaEventResponse();
        KafkaEvent kafkaEvent = new KafkaEvent();
        kafkaEvent.setEventId(kafkaEventResponse.getEventId());
        kafkaEvent.setSource(kafkaEventRequest.getSource());
        kafkaEvent.setTimestamp(kafkaEventRequest.getTimestamp());
        System.out.println(kafkaEvent.toString());
        kafkaEventService.save(kafkaEvent);
        return kafkaEventResponse;
    }
}
