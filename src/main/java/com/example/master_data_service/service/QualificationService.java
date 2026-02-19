package com.example.master_data_service.service;

import com.example.master_data_service.dto.request.QualificationRequest;
import com.example.master_data_service.dto.response.QualificationResponse;

public interface QualificationService {

    public QualificationResponse findById(Integer id);
    public QualificationResponse findByName(String name);
    public QualificationResponse findAll();
    public QualificationResponse AddNwQualification(QualificationRequest qualificationRequest);
    public QualificationResponse delete();
    public QualificationResponse update();
}
