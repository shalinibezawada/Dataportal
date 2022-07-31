package com.info.dp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.info.dp.entity.Candidate;
import com.info.dp.service.CandidateService;


@RestController
public class CandidateController {
	
	@Autowired 
	private  CandidateService candidateService;
	private Candidate candidate;
	
	
	//save candidate details 
	@PostMapping("/saveCndidateDetails")
	public Candidate save(@RequestBody Candidate candidate) {
		 candidate=	candidateService.saveCandidate(candidate);
		
		return candidate;
	}
	
	//get the all candidate details details
	@GetMapping("/getAllCandidatesDetails")
	public List<Candidate> getAllCandidatesDetails() {
		List<Candidate> list=candidateService.getAllCandidates();
		return list;
	}
	
	//delete candidate details
	@DeleteMapping("/deleteCandidateDetails/{id}")
	public String  deletecandidate(@PathVariable(value = "id") Long id) {
		candidateService.deletecandidate(id);
		return "the record is deleted";
	}
	
	//update candidate details
	@PutMapping("/updateCandidateDetails/{id}")
	public  Candidate updateCandidate(@RequestBody Candidate candidate,@PathVariable(value = "id")Long id){
	 
	 return candidateService.updateCandidate(candidate,id);
	}
	
	

}
