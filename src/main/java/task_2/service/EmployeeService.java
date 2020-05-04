package task_2.service;

import task_2.bean.Employee;
import task_2.bean.Position;

public class EmployeeService {

    private final static EmployeeService employeeService = new EmployeeService();

    private EmployeeService(){}

    public static EmployeeService getEmployeeService(){
        return employeeService;
    }

    public void recruiting(Employee employee, Position position) {
        if (employee == null || position == null) throw new NullPointerException();
        employee.setPosition(position);
        employee.setSalary(position.getSalary());
        position.getEmployees().add(employee);
    }

    public void dismissing(Employee employee){
        if (employee == null) throw new NullPointerException();
        employee.getPosition().getEmployees().remove(employee);
        employee.setPosition(null);
    }
}
