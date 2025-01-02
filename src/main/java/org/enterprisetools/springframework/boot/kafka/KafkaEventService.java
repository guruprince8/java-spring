package org.enterprisetools.springframework.boot.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class KafkaEventService {

    @Autowired
    KafkaRepository kafkaRepository;

    public KafkaEvent save(KafkaEvent kafkaEvent){
        return kafkaRepository.save(kafkaEvent);
    }
}
