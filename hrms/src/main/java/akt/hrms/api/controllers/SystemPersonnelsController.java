package akt.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import akt.hrms.business.abstracts.SystemPersonnelService;
import akt.hrms.core.utilities.DataResult;
import akt.hrms.core.utilities.Result;
import akt.hrms.entities.concretes.SystemPersonnel;

@RestController
@RequestMapping("/api/systempersonnel")
public class SystemPersonnelsController {

	private SystemPersonnelService systemPersonnelService;

	@Autowired
	public SystemPersonnelsController(SystemPersonnelService systemPersonnelService) {
		super();
		this.systemPersonnelService = systemPersonnelService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<SystemPersonnel>> getAll(){
		return this.systemPersonnelService.getAll();
	}
	
	@PostMapping("/register")
	public Result add(@RequestBody SystemPersonnel systemPersonnel) {
		return this.systemPersonnelService.register(systemPersonnel);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody SystemPersonnel systemPersonnel) {
		return this.systemPersonnelService.delete(systemPersonnel);
		
	}
}