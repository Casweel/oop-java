import java.util.ArrayList;
import java.util.HashMap;

public class Map {
    private HashMap<String, ArrayList<String>> hashMap;

    public Map() {
    }

    public void createMap(String... peoples) {
        hashMap = new HashMap<>();
        for (String student : peoples) {
            ArrayList<String> list = new ArrayList<>();
            String[] names = student.split("\\s");

            if (hashMap.containsKey(names[0])) {
                list.addAll(hashMap.get(names[0]));
            }
            list.add(names[1]);
            hashMap.put(names[0], list);
        }
    }

    public int getSameFirstNameCount(String name) {
        int counter = 0;
        for (String lastName : hashMap.keySet()) {
            for (String firstName : hashMap.get(lastName)) {
                if (firstName.equals(name)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public int getSameLastNameCount(String secondName) {
        for (String lastName : hashMap.keySet()) {
            if (lastName.equals(secondName)) {
                return hashMap.get(lastName).size();
            }
        }
        return 0;
    }
}