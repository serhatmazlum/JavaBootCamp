package bootcamp.hrms.business.abstracts;

import java.util.List;

import bootcamp.hrms.core.Result;
import bootcamp.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	List<JobPosition> getAll();
	Result add(JobPosition jobPosition);
}
