package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Client[] clients = new Client[6];

        clients[0] = new Client("Ivan", 1001);
        clients[1] = new Client("Anna", 10586);
        clients[2] = new Client("Irina", 2040);
        clients[3] = new Client("Andrew", 3);

        Scanner scanner = new Scanner(System.in);
        String tempString;
        int tempInt;
        System.out.println("Введите данные клиента");
        tempString = scanner.nextLine();
        tempInt = scanner.nextInt();
        for (int i = 0; i < clients.length; i++)
        {
            try {
                if (clients[i].innCheck(tempString, tempInt))
                {
                    System.out.println("ИНН совпадает");
                    break;
                }
            }
            catch (Exception E)
            {
                System.out.println("ИНН не совпадает");
                break;
            }
        }
    }
}
