package br.edu.up.jpa.services;
import br.edu.up.jpa.dominio.Department;
import br.edu.up.jpa.repository.DepartmentRepository;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class DepartmentService {		
	    @Autowired
		private DepartmentRepository departmentRepository;		 
	    
		@ResponseBody
		@GetMapping(value = "/departamentos")			
		public List<Department> listarDepartamentos() {			
			return departmentRepository.findAll();
		}
		
		@GetMapping("/departamentos/{id}")
		public Department listarDepartamento(@PathVariable Integer id) {
			Department department = departmentRepository.findOne(id);
			return department;
		}
		
		@PostMapping("/departamentos/create/")
		public ResponseEntity<Object> createStudent(@RequestBody Department department) {
			return departmentRepository.save(department);
		}
		
		@GetMapping("/departamentos/delete/{id}")
		public List<Department> deleteDepartament(@PathVariable Integer id) {
			departmentRepository.delete(id);
			return departmentRepository.findAll();
		}
}