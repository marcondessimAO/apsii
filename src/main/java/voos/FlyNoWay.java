package voos;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Nao posso voar.");
    }
}
