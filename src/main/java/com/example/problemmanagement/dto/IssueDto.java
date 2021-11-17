package com.example.problemmanagement.dto;

import com.example.problemmanagement.entity.IssueStatus;
import com.example.problemmanagement.entity.Project;
import com.example.problemmanagement.entity.User;
import lombok.Data;

import java.util.Date;

@Data
public class IssueDto {

    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assigne;
    private ProjectDto project;
}
