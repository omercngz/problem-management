package com.example.problemmanagement.service.imp;

import com.example.problemmanagement.dto.IssueDto;
import com.example.problemmanagement.entity.Issue;
import com.example.problemmanagement.repository.IssueRepository;
import com.example.problemmanagement.service.IssueService;
import com.example.problemmanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {

    //issueRepository enjectionu (construction enjection)
    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository,ModelMapper modelMapper){
        this.modelMapper = modelMapper;
        this.issueRepository=issueRepository;
    }

    @Override
    public IssueDto save(IssueDto issue) {
        if(issue.getDate()==null)
            throw new IllegalArgumentException("Date Cannot Be Empty!");

        Issue issueDb = modelMapper.map(issue,Issue.class);
        issueDb =issueRepository.save(issueDb);
        return modelMapper.map(issueDb,IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data =issueRepository.findAll(pageable);
        TPage page=new TPage<IssueDto>();
        IssueDto[] dtos= modelMapper.map(data.getContent(),IssueDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;

    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}
