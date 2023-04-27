package hospital_management_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import hospital_management_dto.Hospital;

public class HospitalDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sigma");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void saveHospital(Hospital hospital)
	{
		et.begin();
		em.persist(hospital);
		et.commit();
	}
	public Hospital getHosptalById(int id)
	{
		return em.find(Hospital.class,id);
		
	}
	public void getAllHospital()
	{
		Query query=em.createQuery("select i from Hospital i");
		List<Hospital>hospitals=query.getResultList();
		for(Hospital hospital:hospitals)
		{
			System.out.println(hospital.getHospitalName());
		}
		
	}
	public void deleteHospital(Hospital hospital)
	{
		et.begin();
		em.remove(hospital);
		et.commit();
	}
	public void updateHospital(Hospital hospital)
	{
	
		et.begin();
		em.merge(hospital);
		et.commit();
	}
}
