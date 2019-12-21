package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        System.out.println("Выберите пункт (1-4): ");
        Scanner sc = new Scanner(System.in);
        while (i == 0) {
            if (sc.hasNextInt()) {
                i = sc.nextInt();
            }
        }
        switch (i) {
            case 1: {
                //Реализовать вывод информации из файла на экран
                try (FileReader reader = new FileReader("D:\\Downloads\\Java\\lab8\\text.txt")) {
                    System.out.println("Файл: ");
                    int c;
                    while ((c = reader.read()) != -1) {
                        System.out.print((char) c);
                    }
                } catch (IOException e) {
                    System.out.print("Ошибка чтения: ");
                    System.out.println(e.getMessage());
                }
            }
            break;
            case 2: {
                //реализовать перезапись в файл введённой с клавиатуры информации
                if (!(new File("D:\\Downloads\\Java\\lab8\\text.txt").exists()))
                {
                    System.out.println("Файл не существует");
                    break;
                }
            }
            case 3:
                //реализовать запись в файл введённой с клавиатуры информации
                try (FileWriter writer = new FileWriter("D:\\Downloads\\Java\\lab8\\text.txt", false)) {
                    System.out.println("Введите текст для записи в файл: ");
                    sc = new Scanner(System.in);
                    String text = sc.nextLine();
                    writer.write(text);
                    writer.flush();
                    System.out.println("Текст успешно записан");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Текст не был записан");
                }
                break;
            default: {
                //Добавить в конец исходного файла текст, введённый с клавиатуры
                try (FileWriter writer = new FileWriter("D:\\Downloads\\Java\\lab8\\text.txt", true)) {
                    System.out.println("Введите текст для записи в файл: ");
                    sc = new Scanner(System.in);
                    String text = sc.nextLine();
                    writer.write(text);
                    writer.flush();
                    System.out.println("Текст успешно записан");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Текст не был записан");
                }
            }
            break;
        }
    }
    // write your code here
}


// Реализовать запись в файл введённой с клавиатуры информации