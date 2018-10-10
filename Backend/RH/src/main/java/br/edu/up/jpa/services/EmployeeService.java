package br.edu.up.jpa.services;
import br.edu.up.jpa.dominio.Employee;
import br.edu.up.jpa.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {		
	    @Autowired
		private EmployeeRepository employeeRepository;		 
	    
		@ResponseBody
		@GetMapping(value = "/employees")			
		public List<Employee> listarEmployee() {			
			return employeeRepository.findAll();
		}
		
		@GetMapping("/employees/{id}")
		public Employee listarEmployee(@PathVariable Integer id) {
			Employee employee = employeeRepository.findOne(id);
			return employee;
		}
		
		@PostMapping("/employees/create/")
		public Employee createStudent(@RequestBody Employee employee) {
			return employeeRepository.save(employee);
		}
		
		@GetMapping("/employees/delete/{id}")
		public List<Employee> deleteEmployee(@PathVariable Integer id) {
			employeeRepository.delete(id);
			return employeeRepository.findAll();
		}
}