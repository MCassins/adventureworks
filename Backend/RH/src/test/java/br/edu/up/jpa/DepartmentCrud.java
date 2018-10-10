package br.edu.up.jpa;
import java.sql.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import br.edu.up.jpa.dominio.Department;
import br.edu.up.jpa.repository.DepartmentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentCrud {
    @Autowired
    private DepartmentRepository departmentRepository;
    /**
     * Métodos JPA Repository.
     */
    @Test
    public void rodarMetodosJpa() {
    	departmentRepository.save(new Department(1,"Tecnologia","FH",new Date(System.currentTimeMillis())));
    	departmentRepository.save(new Department(2,"Hybris","FH",new Date(System.currentTimeMillis())));
    	departmentRepository.save(new Department(3,"SAP BW","FH",new Date(System.currentTimeMillis())));
        
        System.out.println("\n*************Department*************");
        departmentRepository.findAll().forEach(System.out::println);
        
    	/*
        departmentRepository.deleteInBatch(departmentRepository.findAll().subList(0,1));
        
        System.out.println("\n*************1 departamento*************");
        departamentoRepository.findAll().forEach(System.out::println);
        departmentRepository.deleteAllInBatch();
        System.out.println("\n*************Nenhum departamento*************");
        departamentoRepository.findAll().forEach(System.out::println);*/

    }
    
    @Before
    @After
    public void banner() {
        System.out.println("\n\n----------------------------------------------------------------\n");
    }
}
