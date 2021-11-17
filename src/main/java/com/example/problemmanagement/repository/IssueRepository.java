package com.example.problemmanagement.repository;

import com.example.problemmanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository  extends JpaRepository<Issue,Long> { // <hangi tabloya hizmet edecek u interface, vei id sinin tipi ne?>


}
