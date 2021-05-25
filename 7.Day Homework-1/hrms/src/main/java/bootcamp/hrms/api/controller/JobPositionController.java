package bootcamp.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bootcamp.hrms.business.abstracts.JobPositionService;
import bootcamp.hrms.core.Result;
import bootcamp.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("api/jobposition")
public class JobPositionController {

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}

	@GetMapping("/getall")
	public List<JobPosition> getAl() {

		return this.jobPositionService.getAll();
	}

	@PostMapping
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);

	}
}
