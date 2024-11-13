package com.laf.pojo;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Worker {
    private Integer id;
    private String workName;
    private Date workBirth;
    private Integer salary;
}
