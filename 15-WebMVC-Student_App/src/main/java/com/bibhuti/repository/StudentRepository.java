package com.bibhuti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibhuti.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
