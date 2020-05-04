package task_2.factory;

import org.springframework.beans.factory.FactoryBean;
import task_2.bean.Employee;

public class EmployeeFactory implements FactoryBean<Employee> {
    @Override
    public Employee getObject() throws Exception {
        System.out.println("FACTORY OF EMPLOYEE BEAN");
        return new Employee();
    }

    @Override
    public Class<?> getObjectType() {
        return Employee.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
