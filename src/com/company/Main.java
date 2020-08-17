package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = "Your name";
        final int num = 456;
        String word = "Айназик";
        text = num + word;

        System.out.println(text);
        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }
        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Добро пожаловать " + name);
    }
}


