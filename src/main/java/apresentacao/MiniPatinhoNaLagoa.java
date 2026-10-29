package apresentacao;

import patos.MallardDuck;
import voos.FlyNoWay;
import quacks.Squeak;

public class MiniPatinhoNaLagoa {
    public static void main(String[] args) {
        MallardDuck pato = new MallardDuck();

        pato.display();
        pato.performQuack();
        pato.performFly();
        pato.swim();

        System.out.println("\nTrocando os comportamentos em tempo de execucao:");
        pato.setFlyBehavior(new FlyNoWay());
        pato.setQuackBehavior(new Squeak());
        pato.performFly();
        pato.performQuack();
    }
}
