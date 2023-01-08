package com.pattern.decorator.demoprogram.shape;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Can you draw a circle without border?");
        circle.draw();

        RedShapeDecorator circle1 = new RedShapeDecorator(circle);
        System.out.println("Can you draw a circle with border?");
        circle1.draw();
    }
}
