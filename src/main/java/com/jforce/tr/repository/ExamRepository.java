package com.jforce.tr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jforce.tr.modal.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer> {

}
