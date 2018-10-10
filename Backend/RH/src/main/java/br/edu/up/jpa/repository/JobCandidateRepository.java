package br.edu.up.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.jpa.dominio.JobCandidate;

public interface JobCandidateRepository extends JpaRepository<JobCandidate, Integer>{

}
