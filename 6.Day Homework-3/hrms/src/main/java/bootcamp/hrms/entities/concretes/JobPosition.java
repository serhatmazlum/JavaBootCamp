package bootcamp.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;

import lombok.Data;

@Data
@Entity
@Table(name = "job_positions")
public class JobPosition implements bootcamp.hrms.entities.abstracts.JobPosition{

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	
	@Column(name = "jobs")
	private String jobPosition;
	
	public JobPosition() {} // uygulama çalıştığında empty constructor hatası veriyor diye eklenildi. 
	
	public JobPosition(int id, String jobPosition) {
		super();
		this.id = id;
		this.jobPosition = jobPosition;
	}
	
}

