package com.example.master_data_service.service;

public interface QualificationService {

    public void findById(Long id);
    public void findByName(String name);
    public void findAll();
    public void save();
    public void delete();
    public void update();
}
