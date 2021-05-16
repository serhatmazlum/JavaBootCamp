package bootcamp.hrms.business.abstracts;

import java.util.List;

import bootcamp.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	List<JobPosition> getAll();
}
