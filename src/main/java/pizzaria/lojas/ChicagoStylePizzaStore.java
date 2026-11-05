package pizzaria.lojas;

import pizzaria.ingredientes.ChicagoPizzaIngredientFactory;
import pizzaria.ingredientes.PizzaIngredientFactory;
import pizzaria.pizzas.CheesePizza;
import pizzaria.pizzas.ClamPizza;
import pizzaria.pizzas.PepperoniPizza;
import pizzaria.pizzas.Pizza;
import pizzaria.pizzas.VeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza;

        if ("queijo".equalsIgnoreCase(item)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Pizza de Queijo no Estilo de Chicago");
        } else if ("vegetariana".equalsIgnoreCase(item)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Pizza Vegetariana no Estilo de Chicago");
        } else if ("mariscos".equalsIgnoreCase(item)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Pizza de Mariscos no Estilo de Chicago");
        } else if ("calabresa".equalsIgnoreCase(item)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Pizza de Calabresa no Estilo de Chicago");
        } else {
            return null;
        }
        return pizza;
    }
}
