package bootcamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import bootcamp.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}
