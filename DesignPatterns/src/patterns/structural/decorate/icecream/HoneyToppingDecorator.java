package com.pattern.decorator.demoprogram.icecream;

public class HoneyToppingDecorator extends ToppingDecorator{
    private IceCream iceCream;

    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String addTopping() {
        return "Honey topping";
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with " + addTopping();
    }
}
