package patos;

import quacks.QuackBehavior;
import voos.FlyBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    protected Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Todos os patos flutuam, ate os de brinquedo!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        if (flyBehavior == null) {
            throw new IllegalArgumentException("O comportamento de voo nao pode ser nulo.");
        }
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        if (quackBehavior == null) {
            throw new IllegalArgumentException("O comportamento de grasnado nao pode ser nulo.");
        }
        this.quackBehavior = quackBehavior;
    }
}
