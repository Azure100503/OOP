package patterns.behavioral.strategy.navigationusingstrategy;

public class App {
    public static void main(String[] args) {
        WalkingStrategy walkingStrategy = new WalkingStrategy();
        Navigator navigator = new Navigator(walkingStrategy);
        navigator.builtRoute();
    }
}
