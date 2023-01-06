package patterns.behavioral.strategy.navigationusingstrategy;

public class DrivingStrategy implements RouteStrategy{
    @Override
    public void builtRoute() {
        System.out.println("Driving route");
    }
}
