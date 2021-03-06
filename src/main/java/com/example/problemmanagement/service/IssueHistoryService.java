package com.example.problemmanagement.service;

import com.example.problemmanagement.entity.IssueHistory;
import com.example.problemmanagement.repository.IssueHistoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService  {

    IssueHistory save(IssueHistory issueHistory);

    IssueHistory getById(Long id);

    Page<IssueHistory> getAllPageable(Pageable pageable);

    Boolean delete(IssueHistory issueHistory);


}
