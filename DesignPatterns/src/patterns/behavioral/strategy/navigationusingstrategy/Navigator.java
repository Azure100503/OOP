package patterns.behavioral.strategy.navigationusingstrategy;

public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void builtRoute() {
        routeStrategy.builtRoute();
    }
}
