package JPA.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import JPA.entities.Student;


//this will work in Spring boot
//@Repository
//@Transactional
//public class StudentService {
//
//	@PersistenceContext
//	private EntityManager entityManager;
//	
//	public Student insert(Student s) {
//	  entityManager.persist(s);
//	  return s;
//	}
//}
