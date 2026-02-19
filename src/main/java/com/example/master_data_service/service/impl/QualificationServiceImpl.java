package com.example.master_data_service.service.impl;

import com.example.master_data_service.dto.request.QualificationRequest;
import com.example.master_data_service.dto.response.QualificationResponse;
import com.example.master_data_service.entity.Qualification;
import com.example.master_data_service.repository.QualificationRepository;
import com.example.master_data_service.service.QualificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QualificationServiceImpl implements QualificationService {

    private final QualificationRepository qualificationRepository;

    @Override
    public QualificationResponse findById(Integer id) {

        var qualification = qualificationRepository.findById(id).orElseThrow(()-> new RuntimeException("Qualification not found with id " + id));
        return mapToResponse(qualification);
    }

    @Override
    public QualificationResponse findByName(String name) {
        return null;
    }

    @Override
    public QualificationResponse findAll() {
        return null;
    }

    @Override
    public QualificationResponse AddNwQualification(QualificationRequest request) {
        if (qualificationRepository.existsByCode(request.getCode())) {
            throw new RuntimeException("Qualification with code " + request.getCode() + " already exists");
        }
        Qualification qualification = Qualification.builder()
                .name(request.getName())
                .code(request.getCode())
                .isActive(request.getIsActive())
                .build();
        qualificationRepository.save(qualification);
        return mapToResponse(qualification);
    }

    @Override
    public QualificationResponse delete() {
        return null;
    }

    @Override
    public QualificationResponse update() {
        return null;
    }

    private QualificationResponse mapToResponse(Qualification qualification) {
        return new QualificationResponse(qualification.getId(), qualification.getCode(), qualification.getName(), qualification.getIsActive());
    }
}
