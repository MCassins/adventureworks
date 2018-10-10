package br.edu.up.jpa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.up.jpa.dominio.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
