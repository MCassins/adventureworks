package br.edu.up.jpa;

import java.sql.Date;
import java.sql.Time;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.up.jpa.dominio.Department;
import br.edu.up.jpa.dominio.Shift;
import br.edu.up.jpa.repository.DepartmentRepository;
import br.edu.up.jpa.repository.ShiftRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShiftCrud {
    @Autowired
    private ShiftRepository shiftRepository;
    /**
     * Métodos JPA Repository.
     */
    @Test
    public void rodarMetodosJpa() {
    	shiftRepository.save(new Shift(1,"Shift1",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()),new Date(System.currentTimeMillis())));
    	shiftRepository.save(new Shift(2,"Shift1",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()),new Date(System.currentTimeMillis())));
    	shiftRepository.save(new Shift(3,"Shift1",new Time(System.currentTimeMillis()),new Time(System.currentTimeMillis()),new Date(System.currentTimeMillis())));
        
        System.out.println("\n*************Shift*************");
        shiftRepository.findAll().forEach(System.out::println);
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
