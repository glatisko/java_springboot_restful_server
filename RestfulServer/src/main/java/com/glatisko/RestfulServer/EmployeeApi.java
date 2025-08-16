package com.glatisko.RestfulServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeApi {
	
	private static final Logger logInfo = LoggerFactory.getLogger(EmployeeApi.class);
	
	@GetMapping("/{empId}")
	public String getEmployee(String empId) {
		logInfo.info("Employee Info Logging is enabled"); 		
		logInfo.debug("Employee Debug Logging is enabled"); 						
		return "Employee Found";
	}



}
