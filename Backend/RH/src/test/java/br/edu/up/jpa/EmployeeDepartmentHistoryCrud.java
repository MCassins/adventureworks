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
import br.edu.up.jpa.dominio.EmployeeDepartmentHistory;
import br.edu.up.jpa.repository.DepartmentRepository;
import br.edu.up.jpa.repository.EmployeeDepartmentHistoryRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDepartmentHistoryCrud {
    @Autowired
    private EmployeeDepartmentHistoryRepository employeeDepartmentHistoryRepository;
    /**
     * Métodos JPA Repository.
     */
    @Test
    public void rodarMetodosJpa() {
    	employeeDepartmentHistoryRepository.save(new EmployeeDepartmentHistory(1,new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Department(1,"Tecnologia","FH",new Date(System.currentTimeMillis()))));
    	employeeDepartmentHistoryRepository.save(new EmployeeDepartmentHistory(1,new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Department(2,"Hybris","FH",new Date(System.currentTimeMillis()))));
    	employeeDepartmentHistoryRepository.save(new EmployeeDepartmentHistory(1,new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Department(3,"SAP BW","FH",new Date(System.currentTimeMillis()))));
        
        System.out.println("\n*************EmployeeDepartmentHistory*************");
        employeeDepartmentHistoryRepository.findAll().forEach(System.out::println);
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
