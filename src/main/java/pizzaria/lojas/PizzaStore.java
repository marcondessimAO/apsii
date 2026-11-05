package pizzaria.lojas;

import pizzaria.pizzas.Pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String item) {
        Pizza pizza = createPizza(item);
        if (pizza == null) {
            throw new IllegalArgumentException("Tipo de pizza desconhecido: " + item);
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
