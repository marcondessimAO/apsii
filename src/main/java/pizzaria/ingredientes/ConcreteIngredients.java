package pizzaria.ingredientes;

abstract class NamedIngredient implements Ingredient {
    private final String name;

    NamedIngredient(String name) {
        this.name = name;
    }

    @Override
    public final String getName() {
        return name;
    }

    @Override
    public final String toString() {
        return name;
    }
}

final class ThinCrustDough extends NamedIngredient implements Dough {
    ThinCrustDough() { super("massa fina"); }
}

final class ThickCrustDough extends NamedIngredient implements Dough {
    ThickCrustDough() { super("massa grossa"); }
}

final class MarinaraSauce extends NamedIngredient implements Sauce {
    MarinaraSauce() { super("molho marinara"); }
}

final class PlumTomatoSauce extends NamedIngredient implements Sauce {
    PlumTomatoSauce() { super("molho de tomate"); }
}

final class ReggianoCheese extends NamedIngredient implements Cheese {
    ReggianoCheese() { super("queijo parmesao"); }
}

final class MozzarellaCheese extends NamedIngredient implements Cheese {
    MozzarellaCheese() { super("mussarela"); }
}

final class Garlic extends NamedIngredient implements Veggies {
    Garlic() { super("alho"); }
}

final class Onion extends NamedIngredient implements Veggies {
    Onion() { super("cebola"); }
}

final class Mushroom extends NamedIngredient implements Veggies {
    Mushroom() { super("cogumelo"); }
}

final class RedPepper extends NamedIngredient implements Veggies {
    RedPepper() { super("pimentao vermelho"); }
}

final class BlackOlives extends NamedIngredient implements Veggies {
    BlackOlives() { super("azeitonas pretas"); }
}

final class Spinach extends NamedIngredient implements Veggies {
    Spinach() { super("espinafre"); }
}

final class EggPlant extends NamedIngredient implements Veggies {
    EggPlant() { super("berinjela"); }
}

final class SlicedPepperoni extends NamedIngredient implements Pepperoni {
    SlicedPepperoni() { super("calabresa fatiada"); }
}

final class FreshClams extends NamedIngredient implements Clam {
    FreshClams() { super("mariscos frescos"); }
}

final class FrozenClams extends NamedIngredient implements Clam {
    FrozenClams() { super("mariscos congelados"); }
}
