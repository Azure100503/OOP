package patterns.behavioral.strategy.navigation;

public class Navigator {
    public Navigator() {
    }

    public void buildWalkingRoute() {
        System.out.println("Walking route");
    }

    public void buildCyclingRoute() {
        System.out.println("Cycling route");
    }
    public void buildDrivingRoute() {
        System.out.println("Driving route");
    }
}
