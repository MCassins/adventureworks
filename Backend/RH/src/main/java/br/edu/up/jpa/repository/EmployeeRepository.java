package br.edu.up.jpa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.up.jpa.dominio.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
