package com.example.problemmanagement.service.imp;

import com.example.problemmanagement.entity.IssueHistory;
import com.example.problemmanagement.repository.IssueHistoryRepository;
import com.example.problemmanagement.service.IssueHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {

    private final IssueHistoryRepository issueHistoryRepository;

    public IssueHistoryServiceImpl( IssueHistoryRepository issueHistoryRepository){

        this.issueHistoryRepository=issueHistoryRepository;
    }

    @Override
    public IssueHistory save(IssueHistory issueHistory) {
        //Bussiness Logic
        if(issueHistory.getDate()==null)
            throw new IllegalArgumentException("Date Cannot Be Empty!");
        return issueHistoryRepository.save(issueHistory);
    }

    @Override
    public IssueHistory getById(Long id) {
        return issueHistoryRepository.getOne(id);
    }

    @Override
    public Page<IssueHistory> getAllPageable(Pageable pageable) {
        return issueHistoryRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(IssueHistory issueHistory) {
        issueHistoryRepository.delete(issueHistory);
        return Boolean.TRUE;
    }
}
