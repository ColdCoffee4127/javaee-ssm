package com.coffee.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {
    private Integer studentId;
    private String studentName;
    private java.util.Date dateBirth;
    private Integer classId;
    private MedicalRecords medicalrecords;
}
