package hospital_management_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_management_dto.Doctor;
import hospital_management_dto.Patient;

public class PatientDao {

	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("sigma");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void savePatient(Patient patient)
	{
		et.begin();
		em.persist(patient);
		et.commit();
	}
	public Patient getPatientlById(int id)
	{
		return em.find(Patient.class, id);
	
	}
	public void getAllPatient()
	{
		Query query=em.createQuery("select i from Patient i");
		List<Patient>patients=query.getResultList();
		for(Patient patient:patients)
		{
			System.out.println(patient.getPatientName());
		}
		
	}
	public void deletePatient(Patient patient)
	{
		et.begin();
		em.remove(patient);
		et.commit();
	}
	public void updatePatient(Patient patient)
	{
		
		et.begin();
		em.merge(patient);
		et.commit();
	}
}
