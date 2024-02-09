package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.DepartmentDto;

//@FeignClient(url="http://localhost:8080",value="DEPARTMENT-SERVICVE") this was the annotation before for the accepting requesting from a port and a particular service but now we just give name of the service so that we can accept requests from n number of different ports 
@FeignClient(name="DEPARTMENT-SERVICE")
public interface APIClient {

	
	 @GetMapping("api/departments/{department-code}")
	    DepartmentDto getDepartment(@PathVariable("department-code") String departmentCode);
}
