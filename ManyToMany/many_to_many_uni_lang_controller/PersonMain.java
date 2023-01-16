package many_to_many_uni_lang_controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_uni_lang_dto.Language;
import many_to_many_uni_lang_dto.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Language language = new Language();
		language.setId(1);
		language.setName("kannada");
		language.setCountry("India");
		language.setOrigin("karnataka");
		
		Language language1 = new Language();
		language1.setId(2);
		language1.setName("Telugu");
		language1.setCountry("India");
		language1.setOrigin("Andra");
		
		Language language2 = new Language();
		language2.setId(3);
		language2.setName("Malyalam");
		language2.setCountry("India");
		language2.setOrigin("Kerala");
		
		List<Language> list = new ArrayList<Language>();
		list.add(language);
		list.add(language1);
		
		List<Language> list1 = new ArrayList<Language>();
		list1.add(language1);
		list1.add(language2);
		
		Person person = new Person();
		person.setId(1);
		person.setName("vishnu");
		person.setAddress("CKM");
		person.setPhone(8756543);
		
		Person person1 = new Person();
		person1.setId(2);
		person1.setName("harsha");
		person1.setAddress("CKM");
		person1.setPhone(8756543);
		
		Person person2 = new Person();
		person2.setId(3);
		person2.setName("Spoorthi");
		person2.setAddress("CKM");
		person2.setPhone(8756543);
		
		person.setLanguage(list);
		person1.setLanguage(list);
		person2.setLanguage(list1);
		
		entityTransaction.begin();
		
		entityManager.persist(person);
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(language);
		entityManager.persist(language1);
		entityManager.persist(language2);

		entityTransaction.commit();

	}

}
