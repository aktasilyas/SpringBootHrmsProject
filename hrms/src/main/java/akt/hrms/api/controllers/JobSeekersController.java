package akt.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import akt.hrms.business.abstracts.JobSeekerService;
import akt.hrms.core.utilities.Result;
import akt.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {
	
	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getall")
	public List<JobSeeker> getAll(){
		return this.jobSeekerService.getAll();
	}
	@PostMapping("/register")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.register(jobSeeker);
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.delete(jobSeeker);
		
	}
}