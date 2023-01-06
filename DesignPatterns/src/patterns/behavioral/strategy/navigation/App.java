package patterns.behavioral.strategy.navigation;

public class App {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        navigator.buildWalkingRoute();
        navigator.buildCyclingRoute();
        navigator.buildDrivingRoute();
    }
}
