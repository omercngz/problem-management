package com.example.problemmanagement.repository;

import com.example.problemmanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Long> {

  /*  List<Project> getAllByProjectCode(String projectCode); // projectCodu göndereyim eşleşen bütün projeleri getirsin.

    List<Project> getAllByProjectCodeAndIdNotNull(String projectCode); // project kodu bu olan idsi boş olmayanı getir.

    List<Project> getAllByProjectCodeAndProjectNameContains(String projectCode,String name); //project kodu ve name eşleşenleri getir
*/
    List<Project> getAllByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> findAll (Pageable pageable);

    List<Project> findAll (Sort sort);

}

