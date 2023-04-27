package hospital_management_Controller;

import java.util.Arrays;
import hospital_management_dao.BranchDao;
import hospital_management_dao.DoctorDao;
import hospital_management_dto.Branch;
import hospital_management_dto.Doctor;

public class Branch_DoctorDriver {

	public static void main(String[] args) {
		
		//Persist
		/*Branch branch=new Branch();
		branch.setBranchName("appolo");
		branch.setBranchLoacation("mumbai");
		
		Doctor doctor1=new Doctor();
		doctor1.setDoctorName("R.K.SHARMA");
		
		Doctor doctor2=new Doctor();
		doctor2.setDoctorName("S.P.PATANAIK");
		
		BranchDao branchDao=new BranchDao();
		DoctorDao doctorDao=new DoctorDao();
		
		doctorDao.saveDoctor(doctor1);
		doctorDao.saveDoctor(doctor2);
		
		branch.setDoctor(Arrays.asList(doctor1,doctor2));
		branchDao.saveBranch(branch); */
		
		//delete branch
//		BranchDao branchDao=new BranchDao();
//		Branch branch= branchDao.getBranchlById(4);
//		branchDao.deleteBranch(branch);
		
		//update doctor name
//		DoctorDao doctorDao=new DoctorDao();
//		Doctor doctor=doctorDao.getDoctorlById(8);
//		doctor.setDoctorName("k KUMAR");
//		doctorDao.updateDoctor(doctor);
		
		//Fetch all Doctors Name
//		DoctorDao doctorDao=new DoctorDao();
//		doctorDao.getAllDoctor();
		
	}
}
