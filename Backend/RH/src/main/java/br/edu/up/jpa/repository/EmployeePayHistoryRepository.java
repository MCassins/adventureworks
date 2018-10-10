package br.edu.up.jpa.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.jpa.dominio.EmployeePayHistory;

public interface EmployeePayHistoryRepository extends JpaRepository<EmployeePayHistory, Date> {

}
