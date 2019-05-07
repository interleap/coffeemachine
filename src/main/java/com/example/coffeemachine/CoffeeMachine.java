package com.example.coffeemachine;

public class CoffeeMachine {

    public void dispenseCappuccino(){
        CoffeeDriver.dispenseCoffee();
        CoffeeDriver.dispenseWater();
        CoffeeDriver.dispenseMilk();
    }
}
