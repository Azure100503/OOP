package patterns.creational.singleton.example;

public class TestSingletons {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused(yay!)"
        + "\n"
        + "If you see the different values, then 2 singletons were created(booo!!)\n"
        + "RESULT:"
        + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

    }
}
