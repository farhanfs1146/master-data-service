package com.example.master_data_service.controller;

import com.example.master_data_service.entity.Qualification;
import com.example.master_data_service.service.QualificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/qualifications")
@RequiredArgsConstructor
public class QualificationController {

    private final QualificationService qualificationService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getQualificationById(@PathVariable Integer id) {
        var qualification = qualificationService.findById(id);
        return ResponseEntity.ok().body("New Master Data of Qualifications has been inserted with id: " + id);
    }
}
