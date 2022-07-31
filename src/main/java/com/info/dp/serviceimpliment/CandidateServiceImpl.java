package com.info.dp.serviceimpliment;

import java.util.List;
import java.util.Optional;

import org.aspectj.apache.bcel.generic.RET;
import org.hibernate.engine.spi.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.dp.entity.Candidate;
import com.info.dp.repository.CandidateRepository;
import com.info.dp.service.CandidateService;
@Service
public class CandidateServiceImpl implements CandidateService{
	@Autowired
	private CandidateRepository candidateRepository;
	
	@Override
	public Candidate saveCandidate(Candidate candidate) {
		
		
		return candidateRepository.save(candidate);
	}

	@Override
	public List<Candidate> getAllCandidates() {
		
		return candidateRepository.findAll();
	}

	@Override
	public String deletecandidate(Long id) {
		
		candidateRepository.deleteById(id);
		return null;
	}

	@Override
	public Candidate updateCandidate(Candidate candidate, Long id) {
		Candidate oldcandidate=candidateRepository.findById(id).orElseThrow();
		//oldcandidate.setId(candidate.getId());
		oldcandidate.setName(candidate.getName());
		//oldcandidate.setMailId(candidate.getMailId());
		//oldcandidate.setPhoneNo(candidate.getPhoneNo());
		oldcandidate.setQualification(candidate.getQualification());
		candidateRepository.save(oldcandidate);
		
           return oldcandidate;
	    }
	

}

