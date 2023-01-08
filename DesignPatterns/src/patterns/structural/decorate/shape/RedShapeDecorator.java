package com.pattern.decorator.demoprogram.shape;

public class RedShapeDecorator extends ShapeDecorator{
    public Shape shape;

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    @Override
    public void draw() {
        shape.draw();
        setRedBorder();

    }

    private void setRedBorder() {
        System.out.println("Red border");
    }


}
