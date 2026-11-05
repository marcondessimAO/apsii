package pizzaria.apresentacao;

import pizzaria.lojas.ChicagoStylePizzaStore;
import pizzaria.lojas.NYStylePizzaStore;
import pizzaria.lojas.PizzaStore;
import pizzaria.pizzas.Pizza;

public class PizzariaDemo {
    public static void main(String[] args) {
        PizzaStore lojaDeNovaYork = new NYStylePizzaStore();
        PizzaStore lojaDeChicago = new ChicagoStylePizzaStore();

        Pizza pizzaNovaYork = lojaDeNovaYork.orderPizza("queijo");
        System.out.println(pizzaNovaYork);

        System.out.println();

        Pizza pizzaChicago = lojaDeChicago.orderPizza("mariscos");
        System.out.println(pizzaChicago);
    }
}
