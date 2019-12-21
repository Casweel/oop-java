public final class Dish {
    private int cost;
    private String name;
    private String description;

    public Dish(String name, String description) {
        this.cost = 0;
        this.name = name;
        this.description = description;
    }

    public Dish(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
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
