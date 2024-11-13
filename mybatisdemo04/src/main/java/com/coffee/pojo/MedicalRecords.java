package com.coffee.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalRecords {
    private Integer id;
    private Integer studentId;
    private String allergies;
    private String medications;
}


