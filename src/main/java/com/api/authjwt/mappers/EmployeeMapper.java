package com.api.authjwt.mappers;

import com.api.authjwt.dtos.EmployeeDTO;
import com.api.authjwt.entities.Employee;

public class EmployeeMapper {
	
	public static EmployeeDTO entityToDTO(Employee emp) {
		
		EmployeeDTO empdto = new EmployeeDTO();
		empdto.setFirstNam(emp.getFirstNam());
		empdto.setLastName(emp.getLastName());
		empdto.setJob(emp.getJob());
		empdto.setSalary(emp.getSalary());
		
		return empdto;
		
	}
	
	public static Employee dtoToEntity(EmployeeDTO empdto) {
		
		Employee emp = new Employee();
		emp.setFirstNam(empdto.getFirstNam());
		emp.setLastName(empdto.getLastName());
		emp.setJob(empdto.getJob());
		emp.setSalary(empdto.getSalary());
		
		return emp;
	}

}
