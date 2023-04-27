package hospital_management_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_management_dto.Branch;
import hospital_management_dto.Hospital;

public class BranchDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sigma");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void saveBranch(Branch branch)
	{
		et.begin();
		em.persist(branch);
		et.commit();
	}
	public Branch getBranchlById(int id)
	{
		return em.find(Branch.class, id);
	
	}
	public void getAllBranch()
	{
		Query query=em.createQuery("select i from Branch i");
		List<Branch>branchs=query.getResultList();
		for(Branch branch:branchs)
		{
			System.out.println(branch.getBranchName());
		}
		
	}
	public void deleteBranch(Branch branch)
	{
		et.begin();
		em.remove(branch);
		et.commit();
	}
	public void updateBranch(Branch branch)
	{
		
		et.begin();
		em.merge(branch);
		et.commit();
	}
}
