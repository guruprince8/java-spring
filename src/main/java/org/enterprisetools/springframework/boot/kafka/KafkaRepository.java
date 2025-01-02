package org.enterprisetools.springframework.boot.kafka;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KafkaRepository extends JpaRepository<KafkaEvent,String> {
}
