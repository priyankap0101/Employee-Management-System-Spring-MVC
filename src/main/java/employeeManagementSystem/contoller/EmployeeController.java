package employeeManagementSystem.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
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
		ModelAndView view=new ModelAndView();
		view.setViewName("index.jsp");
		return view;
		
		
	}
}
