package com.example.master_data_service.consumer;

import com.example.master_data_service.event.EmployeeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmployeeKafkaListener {

    @KafkaListener(topics = "employee-events", groupId = "master-data-group")
    public void consume(EmployeeEvent event) {

        log.info("Event Received: {}", event);

        switch (event.getEventType().name()) {

            case "CREATE":
                log.info("🟢 New Employee Created");
                // create default data
                break;

            case "UPDATE":
                log.info("🟡 Employee Updated");
                // update related data
                break;

            case "INACTIVE":
                log.info("🔴 Employee Inactivated");
                // deactivate related records
                break;

            default:
                log.warn("Unknown event type");
        }
    }
}
