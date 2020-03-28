package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Department;
import dmacc.beans.Employee;
import dmacc.beans.Position;

@Configuration
public class BeanConfiguration {
	@Bean
	public Department department() {
		return new Department();
	}
	@Bean
	public Employee employee() {
		return new Employee();
	}

	@Bean
	public Position position() {
		return new Position();
	}
}