public interface Order {
    boolean addItem(Item item);

    boolean removeItem(String name);

    int removeAll(String name);

    int getSize();

    Item[] getAll();

    int getCosts();

    int getNumber(String name);

    Item[] sortedDesc();
}
