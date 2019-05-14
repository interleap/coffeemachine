package com.example.coffeemachine;

public class CoffeeMachine {

    private final CoffeeDriver coffeeDriver;

    public CoffeeMachine(CoffeeDriver coffeeDriver){

        this.coffeeDriver = coffeeDriver;
    }

    public void dispense(){
        coffeeDriver.dispenseCoffee();
        coffeeDriver.dispenseWater();
        coffeeDriver.dispenseMilk();
    }
}
