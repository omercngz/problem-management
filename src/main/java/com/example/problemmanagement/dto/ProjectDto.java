package com.example.problemmanagement.dto;

import com.example.problemmanagement.entity.User;
import lombok.Data;

@Data
public class ProjectDto {

    private Long id;
    private  String projectCode;
    private String projectName;

}
