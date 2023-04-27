package hospital_management_Controller;

import java.util.Arrays;

import hospital_management_dao.BranchDao;
import hospital_management_dao.HospitalDao;
import hospital_management_dto.Branch;
import hospital_management_dto.Hospital;

public class Hospital_BranchDriver {

	public static void main(String[] args) {
		
		//PERSIST 
		/*Hospital hospital=new Hospital();
		
		hospital.setHospitalName("Apollo");
		hospital.setHospitalAddress("mumbai");
	
		Branch branch1=new Branch();
	
		branch1.setBranchName("Indraprasth");
		branch1.setBranchLoacation("Delhi");
		
		Branch branch2=new Branch();
	
		branch2.setBranchName("Nanavati ");
		branch2.setBranchLoacation("Mohali");	
	
		
		HospitalDao dao=new  HospitalDao();
		
		BranchDao branchDao=new BranchDao();
		branchDao.saveBranch(branch1);
		branchDao.saveBranch(branch2);
		
		hospital.setBranchs(Arrays.asList(branch1,branch2));
		dao.saveHospital(hospital); */
		
		
		//Update Hospital Location
		/*HospitalDao dao=new  HospitalDao();
		Hospital hospital=dao.getHosptalById(1);
	
		hospital.setHospitalAddress("Delhi");
		dao.updateHospital(hospital);*/
		
		//Update Branch Location
		
		/*BranchDao branchDao=new BranchDao();
		Branch branch=branchDao.getBranchlById(7);
			
		branch.setBranchName("City");
		branchDao.updateBranch(branch);*/
		
		//delete Branch-
		
		/*BranchDao branchDao=new BranchDao();
		Branch branch=branchDao.getBranchlById(2);
		
		branchDao.deleteBranch(branch);*/
	
		//delete hospital
	/*	HospitalDao dao=new  HospitalDao();
		Hospital hospital=dao.getHosptalById(3);
		dao.deleteHospital(hospital);*/
		
		//Get All Branch
		/*BranchDao branchDao=new BranchDao();
		branchDao.getAllBranch();*/
	
		//Get All Hospitals
		/*HospitalDao dao=new  HospitalDao();
		dao.getAllHospital();*/
		
		
	}
}
