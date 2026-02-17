package com.example.master_data_service.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class QualificationRequest {

    @NotBlank(message = "Qualification code required")
    private String code;
    @NotBlank(message = "Qualification name required")
    private String name;
//    private String description;
    @NotNull(message = "Qualification status must not be null")
    private Boolean is_active;

}
