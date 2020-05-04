package task_2.service;

import task_2.bean.Salary;

import java.util.Random;

public class SalaryService {

    private void initMethod(){
        System.out.println("\nInit method of Salary Service\n");
    }

    private void destroyMethod(){
        System.out.println("\nDestroy method of Salary Service\n");
    }

    public void calculateSalary(Salary salary){
        Random random = new Random();
        if (salary == null) throw new NullPointerException();
        if (random.nextInt(2) == 0) {
            salary.setValueOfSalary(salary.getValueOfSalary() - random.nextInt((int) salary.getValueOfSalary()));
        }else {
            salary.setValueOfSalary(salary.getValueOfSalary() + random.nextInt((int)salary.getValueOfSalary()));
        }
    }
}