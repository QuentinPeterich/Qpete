enum Fruits {APPLE, BANANA, STRAWBERRY, PEAR}

public class Fruit {
    Fruits type;
    boolean isOrganic;


    public Fruit(Fruits fruitType) {
        type = fruitType;
    }

    public Fruit(Fruits fruitType, boolean isOrganic) {
        type = fruitType;
        this.isOrganic = isOrganic;
    }
}
