import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        {
            Set<String> howToGo = new HashSet<>();
            howToGo.add("fly");
            howToGo.add("cross");
            howToGo.add("walk");

            System.out.println("HashSet: " + howToGo);
            Set<String> treeSet = new TreeSet<>(howToGo);
            System.out.println("TreeSet: " + treeSet);
        }

        {
            Map map = new Map();
            map.createMap("Ivanov Ivan", "Orlov Ivan",
                    "Orlov ALexander", "Orlov Hi");
            System.out.println(map.getSameFirstNameCount("Ivan"));
            System.out.println(map.getSameLastNameCount("Orlov"));
        }
    }
}
