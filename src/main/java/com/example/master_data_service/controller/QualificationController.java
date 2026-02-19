package com.example.master_data_service.controller;

import com.example.master_data_service.dto.request.QualificationRequest;
import com.example.master_data_service.entity.Qualification;
import com.example.master_data_service.service.QualificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/qualifications")
@RequiredArgsConstructor
public class QualificationController {

    private final QualificationService qualificationService;

    @PostMapping
    public ResponseEntity<?> addQualification(@RequestBody QualificationRequest request){
        var newQualification = qualificationService.AddNwQualification(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(newQualification);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getQualificationById(@PathVariable Integer id) {
        var qualification = qualificationService.findById(id);
        return ResponseEntity.ok().body("New Master Data of Qualifications has been inserted with id: " + id);
    }

}
