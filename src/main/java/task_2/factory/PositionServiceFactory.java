package task_2.factory;

import task_2.service.PositionService;

public class PositionServiceFactory {
    public PositionService getPositionServiceFactory(){
        return new PositionService();
    }
}
