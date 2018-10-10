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
import br.edu.up.jpa.dominio.Employee;
import br.edu.up.jpa.dominio.EmployeeDepartmentHistory;
import br.edu.up.jpa.dominio.EmployeePayHistory;
import br.edu.up.jpa.dominio.JobCandidate;
import br.edu.up.jpa.repository.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeCrud {
    @Autowired
    private EmployeeRepository employeeRepository;
    /**
     * Métodos JPA Repository.
     */
    @Test
    public void rodarMetodosJpa() {
    	
    	
    	Employee save = employeeRepository.save((Employee)new Employee(1,1,1,"Gestor",new Date(System.currentTimeMillis()),
    			new String("c").charAt(0),new String("m").charAt(0),new Date(System.currentTimeMillis()),
    			1,0,100,1,1,new Date(System.currentTimeMillis()),
    			new JobCandidate(1,"Marcos", new Date(System.currentTimeMillis())),
    	    	new EmployeePayHistory(new Date(System.currentTimeMillis()),1,1,new Date(System.currentTimeMillis()),new Employee(1)),
    	    	new EmployeeDepartmentHistory(1,new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Department(1,"Tecnologia","FH",new Date(System.currentTimeMillis())))
    			));
    			
        
        System.out.println("\n*************Employee*************");
        employeeRepository.findAll().forEach(System.out::println);
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
