package com.example.problemmanagement.service;
//küçük harf olmaz vb.. gibi kontrolleri bu service paketinde yapacağız.

import com.example.problemmanagement.dto.IssueDto;
import com.example.problemmanagement.entity.Issue;
import com.example.problemmanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

        IssueDto save(IssueDto issue);
        // veri tabanına kayıt
        IssueDto getById(Long id);

        TPage<IssueDto> getAllPageable(Pageable pageable);
        //sayfalama ile 5 erli vs. getir page tipinde data döndürür.

    // burada kayıt yapıp id ile page ile kayıt olan datayı getirdik.

        Boolean delete(IssueDto issue);
}
