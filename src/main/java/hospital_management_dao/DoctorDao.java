package hospital_management_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import hospital_management_dto.Doctor;

public class DoctorDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sigma");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void saveDoctor(Doctor doctor)
	{
		et.begin();
		em.persist(doctor);
		et.commit();
	}
	public Doctor getDoctorlById(int id)
	{
		return em.find(Doctor.class, id);
	
	}
	public void getAllDoctor()
	{
		Query query=em.createQuery("select i from Doctor i");
		List<Doctor>doctors=query.getResultList();
		for(Doctor doctor:doctors)
		{
			System.out.println(doctor.getDoctorName());
		}
		
	}
	public void deleteDoctor(Doctor doctor)
	{
		et.begin();
		em.remove(doctor);
		et.commit();
	}
	public void updateDoctor(Doctor doctor)
	{
		
		et.begin();
		em.merge(doctor);
		et.commit();
	}
}
