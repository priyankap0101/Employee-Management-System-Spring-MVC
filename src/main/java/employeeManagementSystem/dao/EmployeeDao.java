package employeeManagementSystem.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

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

	public List<Employee> getAllEmployee() {
		Query query=manager.createQuery("select e from Employee e");
		List<Employee> employee =query.getResultList();
		return employee;
		
		
	}

	public void update(Employee employee) {

		transaction.begin();
		manager.merge(employee);
		transaction.commit();
		
	}

	public Employee getEmployeeById(int id) {
		return manager.find(Employee.class, id);
		
	}
	public void delete(int id)
	{
		transaction.begin();
		manager.remove(manager.find(Employee.class, id));
		transaction.commit();
		
	}
}
