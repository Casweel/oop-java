public final class Drink implements Item {
    private int cost;
    private String name;
    private String description;

    public Drink(String name, String description) {
        this.cost = 0;
        if (name == "") throw new IllegalArgumentException("Name is empty");
        this.name = name;
        if (name == "") throw new IllegalArgumentException("Description is empty");
        this.description = description;
    }

    public Drink(int cost, String name, String description) {
        if (cost < 0) throw new IllegalArgumentException("Cost is invalid");
        this.cost = cost;
        if (name == "") throw new IllegalArgumentException("Name is empty");
        this.name = name;
        if (name == "") throw new IllegalArgumentException("Description is empty");
        this.description = description;
    }

    public int getCost() {
        return this.cost;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
