 package com.info.dp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.info.dp.entity.Candidate;
@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long>{

}
