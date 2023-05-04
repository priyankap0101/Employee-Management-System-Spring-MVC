package employeeManagementSystem.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import employeeManagementSystem.dao.EmployeeDao;
import employeeManagementSystem.dto.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/saveEmployee")
	public ModelAndView saveEmployee()
	{
		ModelAndView view=new ModelAndView();
		view.addObject("employee",new Employee());
		view.setViewName("saveEmployee.jsp");
		return view;
		
	}
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(@ModelAttribute Employee employee)
	{
		dao.saveEmployee(employee);
		ModelAndView view=new ModelAndView("index.jsp");
		
		return view;
	}
	@RequestMapping("/viewEmployee")
	public ModelAndView viewEmployee()
	{
		List<Employee> employees=dao.getAllEmployee();
		ModelAndView view=new ModelAndView("viewEmployee.jsp");
		view.addObject("employees",employees);
		return view;
	}
	@RequestMapping("/update")
	public ModelAndView update(@RequestParam int id)
	{
		
		ModelAndView view=new ModelAndView("update.jsp");
		Employee employee =dao.getEmployeeById(id);
		 view.addObject("employee",employee);
		 return view;
	}
	@RequestMapping("/saveUpdatedEmployee")
	public ModelAndView saveUpdatedEmployee(@ModelAttribute Employee employee)
	{
		ModelAndView view=new ModelAndView("viewEmployee.jsp");
		dao.update(employee);
		view.addObject("employees",dao.getAllEmployee());
		return view;
		
	}
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee(@RequestParam int id)
	{
		ModelAndView view=new ModelAndView("viewEmployee.jsp");
		dao.delete(id);
		view.addObject("employees",dao.getAllEmployee());
		return view;
	}
}
