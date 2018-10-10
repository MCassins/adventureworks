package br.edu.up.jpa;

import br.edu.up.jpa.dominio.JobCandidate;
import br.edu.up.jpa.repository.JobCandidateRepository;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JobCandidateCrud {

    @Autowired
    JobCandidateRepository jobCandidateRepository;

    @Test
    public void exemploDeCrud() {
    	jobCandidateRepository.save(new JobCandidate(1,"Marcos", new Date(System.currentTimeMillis())));
    	jobCandidateRepository.save(new JobCandidate(2,"Paulo", new Date(System.currentTimeMillis())));
    	jobCandidateRepository.save(new JobCandidate(3,"Ricardo", new Date(System.currentTimeMillis())));
    	jobCandidateRepository.save(new JobCandidate(4,"Pedro", new Date(System.currentTimeMillis())));
        
        System.out.println("\n*************JobCandidate*************");
        jobCandidateRepository.findAll().forEach(System.out::println);
        /*
        //alterar nome
        jobCandidateRepository.findAll().forEach(job -> {
            job.setName("123");
            jobCandidateRepository.save(job);
        });*/

//        jobCandidateRepository.deleteAll();
//        System.out.println("\n*************Candidatos excluídos*************");
//        jobCandidateRepository.findAll().forEach(System.out::println);

    }


}
