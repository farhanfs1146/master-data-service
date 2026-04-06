package com.example.master_data_service.event;

import com.example.master_data_service.dto.event.EmployeeCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmployeeKafkaListener {

    @KafkaListener(topics = "employee-events", groupId = "master-data-group")
    public void consume(EmployeeCreatedEvent event) {
        System.out.println("Event Received" + event);
        log.info("Received Event: {}", event);
        // 🔥 yahan tum apni logic likho
        // e.g: default department assign, record create, etc.
    }
}
