package patos;

import quacks.Quack;
import voos.FlyWithWings;

public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Eu sou um pato-real.");
    }
}
