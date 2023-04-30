package employeeManagementSystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import employeeManagementSystem.dto.Employee;
@Component
public class EmployeeDao {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("sigma");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void saveEmployee(Employee employee)
	{
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}
}
