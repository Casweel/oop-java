import java.util.HashMap;
import java.util.Map;

public class RestaurantOrder implements Order {
    private static int index = 0;
    private HashMap<Integer, Item> items = new HashMap<>();

    public RestaurantOrder(Item item) {
        items.put(index++, item);
    }

    public boolean addItem(Item item) {
        try {

            items.put(index++, item);
            return true;
        } catch (Throwable e) {
            return false;
        }
    }

    public boolean removeItem(String name) {
        for (Map.Entry<Integer, Item> entry : items.entrySet())
            if (entry.getValue().getName() == name) {
                items.remove(entry.getKey(), entry.getValue());
                return true;
            }
        return false;
    }

    public int removeAll(String name) {
        int i = 0;
        while (removeItem(name)) {
            i++;
        }
        return i;
    }

    public int getSize() {
        return items.size();
    }

    public Item[] getAll() {
        Item[] items = new Item[this.items.size()];
        int i = 0;
        for (Map.Entry<Integer, Item> entry : this.items.entrySet()) {
            items[i] = entry.getValue();
            i++;
        }
        return items;
    }

    public int getNumber(String name) {
        int counter = 0;
        for (Map.Entry<Integer, Item> entry : items.entrySet())
            if (entry.getValue().getName() == name) {
                counter++;
            }
        return counter;
    }

    public Item[] sortedDesc() {
        Item[] items = getAll();
        //Insertion sort
        for (int left = 0; left < items.length; left++) {
            Item value = items[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.getCost() > items[i].getCost()) {
                    items[i + 1] = items[i];
                } else {
                    break;
                }
            }
            items[i + 1] = value;
        }
        return items;
    }


    public int getCosts() {
        int cost = 0;
        for (Map.Entry<Integer, Item> entry : items.entrySet())
            cost += entry.getValue().getCost();
        return cost;
    }

}
