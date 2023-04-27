package hospital_management_dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchId;
	private String branchName;
	private String branchLoacation;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Doctor> doctor;
	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchLoacation() {
		return branchLoacation;
	}

	public void setBranchLoacation(String branchLoacation) {
		this.branchLoacation = branchLoacation;
	}

	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}


}
