package pizzaria.pizzas;

import java.util.Arrays;
import java.util.stream.Collectors;
import pizzaria.ingredientes.Dough;
import pizzaria.ingredientes.Sauce;
import pizzaria.ingredientes.Cheese;
import pizzaria.ingredientes.Veggies;
import pizzaria.ingredientes.Pepperoni;
import pizzaria.ingredientes.Clam;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Assar por 25 minutos a 350 graus.");
    }

    public void cut() {
        System.out.println("Cortar a pizza em fatias diagonais.");
    }

    public void box() {
        System.out.println("Colocar a pizza na caixa oficial da pizzaria.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder(name == null ? "Pizza" : name);
        description.append("\nMassa: ").append(dough);
        description.append("\nMolho: ").append(sauce);
        description.append("\nQueijo: ").append(cheese);
        if (veggies != null && veggies.length > 0) {
            description.append("\nVegetais: ")
                    .append(Arrays.stream(veggies).map(Object::toString).collect(Collectors.joining(", ")));
        }
        if (pepperoni != null) {
            description.append("\nPepperoni: ").append(pepperoni);
        }
        if (clam != null) {
            description.append("\nMariscos: ").append(clam);
        }
        return description.toString();
    }
}
