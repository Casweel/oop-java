import java.util.HashMap;

public class InternetOrder implements Order {
    private CyclicList list;

    public InternetOrder() {
        list = new CyclicList();
    }

    public InternetOrder(Item[] items) {
        list = new CyclicList();
        for (int i = 0; i < items.length; i++) {
            list.addLast(items[i]);
        }
    }

    public boolean addItem(Item item) {
        list.addLast(item);
        return true;
    }

    public boolean removeItem(String name) {
        return list.remove(name);
    }

    public int removeAll(String name) {
        int i = 0;
        while (list.remove(name))
            i++;
        return i;
    }

    public int getSize() {
        return list.getSize();
    }

    public Item[] getAll() {
        int i = 0;
        Item[] items = new Item[list.getSize()];
        CyclicList.Node help = list.getHead();
        while (help.next != null) {
            items[i] = help.data;
            help = help.next;
            i++;
        }
        return items;
    }

    public int getCosts() {
        int cost = 0;
        CyclicList.Node help = list.getHead();
        while (help.next != null) {
            cost += help.data.getCost();
            help = help.next;
        }
        return cost;
    }

    public int getNumber(String name) {
        int number = 0;
        CyclicList.Node help = list.getHead();
        while (help.next != null) {
            if (help.data.getName() == name)
                number++;
            help = help.next;
        }
        return number;
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
}


