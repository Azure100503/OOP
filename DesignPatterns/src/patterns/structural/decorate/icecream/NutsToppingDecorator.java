package com.pattern.decorator.demoprogram.icecream;

public class NutsToppingDecorator extends ToppingDecorator{
    private IceCream iceCream;

    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String addTopping() {
        return "Nuts topping";
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with " + addTopping() ;
    }
}
