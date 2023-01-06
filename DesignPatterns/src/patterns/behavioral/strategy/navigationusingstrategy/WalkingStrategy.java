package patterns.behavioral.strategy.navigationusingstrategy;

public class WalkingStrategy implements RouteStrategy{
    @Override
    public void builtRoute() {
        System.out.println("Walking route");
    }

}
