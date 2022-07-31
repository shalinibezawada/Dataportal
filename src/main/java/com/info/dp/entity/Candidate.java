package com.info.dp.entity;

import java.security.KeyStore.PrivateKeyEntry;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Bean;
@Entity
public class Candidate {
	
	public Candidate() {
		
	}
	
	public Candidate(Long id, String name, int salary, String qualification) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.qualification = qualification;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private  Long id;
	private  String name;
	private int salary;
	private String qualification;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", salary=" + salary + ", qualification=" + qualification
				+ "]";
	}

	
	
	
	
}
