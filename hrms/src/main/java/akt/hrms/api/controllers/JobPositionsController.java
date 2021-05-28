package akt.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import akt.hrms.business.abstracts.JobPositionService;
import akt.hrms.core.utilities.DataResult;
import akt.hrms.core.utilities.Result;
import akt.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("api/jobpositons")
public class JobPositionsController {
	
	private JobPositionService jobPositionService;
	
	@Autowired//otomatik olarak projede ProductService implement eden sinifi bulup new'liyor
	public JobPositionsController(JobPositionService jobPositionService) {
		
		this.jobPositionService=jobPositionService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return this.jobPositionService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
	}
}
