import com.company.Alabai;
import com.company.Dog;
import com.company.Korgi;
import com.company.Lapdog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите породу собаки:");
        System.out.println("1 - Корги");
        System.out.println("2 - Алабай");
        System.out.println("3 - Болонка");
        int i = 0;
        while (i == 0) {
            if (sc.hasNextInt()) {
                i = sc.nextInt();
            } else {
                System.out.println("Выберите породу собаки:");
            }
        }
        switch (i) {
            case 1:
                Korgi korgiDog = new Korgi("black", "male", 10, true);
                System.out.println(korgiDog.toString());
                break;
            case 2:
                Alabai alabaiDog = new Alabai("black", "female", 10, 85);
                System.out.println(alabaiDog.toString());
                break;
            case 3:
                Lapdog lapdogDog = new Lapdog("white", "male", 10, "Malte");
                System.out.println(lapdogDog.toString());
                break;
            default:
                System.out.println("Что-то пошло не так");
                break;
        }
    }
}