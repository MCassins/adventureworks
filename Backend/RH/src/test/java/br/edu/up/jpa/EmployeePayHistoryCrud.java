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
import br.edu.up.jpa.dominio.EmployeePayHistory;
import br.edu.up.jpa.repository.DepartmentRepository;
import br.edu.up.jpa.repository.EmployeePayHistoryRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeePayHistoryCrud {
    @Autowired
    private EmployeePayHistoryRepository employeePayHistoryRepository;
    /**
     * Métodos JPA Repository.
     */
    @Test
    public void rodarMetodosJpa() {
    	employeePayHistoryRepository.save(new EmployeePayHistory(new Date(System.currentTimeMillis()),1,1,new Date(System.currentTimeMillis()),new Employee(1)));
    	employeePayHistoryRepository.save(new EmployeePayHistory(new Date(System.currentTimeMillis()),2,2,new Date(System.currentTimeMillis()),new Employee(1)));
    	employeePayHistoryRepository.save(new EmployeePayHistory(new Date(System.currentTimeMillis()),3,3,new Date(System.currentTimeMillis()),new Employee(1)));
        
        System.out.println("\n*************EmployeePayHistory*************");
        employeePayHistoryRepository.findAll().forEach(System.out::println);
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
