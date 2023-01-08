package com.pattern.decorator.demoprogram.icecream;

public class App {
    public static void main(String[] args) {
        IceCream vanillaIceCream = new VanillaIceCream();
        IceCream strawberryIceCream = new StrawberryCream();
        IceCream chocolateIceCream = new ChocolateCream();

        System.out.println(vanillaIceCream.getDescription());
        System.out.println(strawberryIceCream.getDescription());
        System.out.println(chocolateIceCream.getDescription());

        ToppingDecorator vanillaHoneyIC = new HoneyToppingDecorator(vanillaIceCream);
        ToppingDecorator vanillaNutsIC = new NutsToppingDecorator(vanillaIceCream);
        ToppingDecorator chocoHoneyIC = new HoneyToppingDecorator(chocolateIceCream);
        ToppingDecorator chocoNutsIC = new NutsToppingDecorator(chocolateIceCream);

        System.out.println(vanillaHoneyIC.getDescription());
        System.out.println(vanillaNutsIC.getDescription());
        System.out.println(chocoHoneyIC.getDescription());
        System.out.println(chocoNutsIC.getDescription());
    }
}
