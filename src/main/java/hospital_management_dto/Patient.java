package hospital_management_dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  patientId;
	private String  patientName;
	private String patientLocation;
	
	@ManyToMany(mappedBy = "patients",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List< Doctor>doctors;
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientLocation() {
		return patientLocation;
	}
	public void setPatientLocation(String patientLocation) {
		this.patientLocation = patientLocation;
	}
	
}
