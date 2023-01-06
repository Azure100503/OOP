package patterns.behavioral.strategy.navigationusingstrategy;

public class CyclingStrategy implements RouteStrategy{
    @Override
    public void builtRoute() {
        System.out.println("Cycling route");
    }
}
