import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(String message) {
        super(message);
    }
}

class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber(String message) {
        super(message);
    }
}

public class OrderManager {
    private HashMap<Integer, RestaurantOrder> orders = new HashMap<>();
    private HashSet<Integer> tables = new HashSet<Integer>();
    private HashMap<String, InternetOrder> addresses = new HashMap<>();


    public OrderManager() {
        for (int i = 0; i < 15; i++)
            tables.add(i);
    }

    public void add(int tableNumber, RestaurantOrder restaurantOrder) throws OrderAlreadyAddedException {
        if (tableNumber >= 15) throw new IllegalTableNumber("Table does not exist");
        if (orders.containsKey(tableNumber)) throw new OrderAlreadyAddedException("Error");
        orders.put(tableNumber, restaurantOrder);
    }

    public void add(String address, InternetOrder order) throws OrderAlreadyAddedException {
        if (orders.containsKey(address)) throw new OrderAlreadyAddedException("Error");
        addresses.put(address, order);
    }

    public Order getOrder(int tableNumber) {
        return orders.get(tableNumber);
    }

    public Order getOrder(String address) {
        return addresses.get(address);
    }

    public void addItem(Item item, int tableNumber) {
        RestaurantOrder temp = orders.get(tableNumber);
        temp.addItem(item);
        orders.put(tableNumber, temp);
    }

    public void addItem(Item item, String address) {
        InternetOrder temp = addresses.get(address);
        temp.addItem(item);
        addresses.put(address, temp);
    }

    public void removeOrder(String address) {
        addresses.remove(address);
    }

    public int freeTableNumbers() {
        int freeTables = tables.size();
        for (int i = 0; i < tables.toArray().length; i++)
            if (orders.containsKey(tables.toArray()[i]))
                freeTables--;
        return freeTables;
    }

    public int orderCostSummary(int tableNumber) {
        return orders.get(tableNumber).getCosts();
    }

    public int getInternetOrders() {
        return addresses.size();
    }

    public Item[] getAllInternetOrders() {
        Item[] items = new Item[addresses.size()];
        int i = 0;
        for (Map.Entry<String, InternetOrder> entry : this.addresses.entrySet()) {
            items[i] = (Item) entry.getValue();
            i++;
        }
        return items;
    }
}
