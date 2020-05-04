package task_2.factory;

import task_2.service.SalaryService;

public class SalaryServiceFactory {
    public static SalaryService getSalaryService(){
        return new SalaryService();
    }
}
