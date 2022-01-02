package JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import JPA.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
//        entityManager.persist(new Student(8,"POKi","13"));
//        Student student = entityManager.find(Student.class, 4);
//        System.out.println(student);

        entityManager.getTransaction().commit();
        factory.close();
        entityManager.close();
        System.out.println("End Program");
    }
}
