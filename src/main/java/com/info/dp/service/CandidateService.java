package com.info.dp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.info.dp.entity.Candidate;

public interface CandidateService {
	public  Candidate saveCandidate(Candidate candidate); 
	public List<Candidate> getAllCandidates();
	public String deletecandidate(Long id);
	public Candidate updateCandidate(Candidate candidate, Long id);
	
	
	

}
