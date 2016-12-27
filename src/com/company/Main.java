package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //hello
        String msg = "Квадратное уровнение" + "\n" +
                "a*x*x+b*x+c" + "\n" +
                "Введите число a:";
        String msg2 = "Введите число x:";
        String msg3 = "Введите число b:";
        String msg4 = "Введите число c:";
        String msg5 = "Итого";

        System.out.println(msg);

//custom hello
        Scanner scanner = new Scanner(System.in);

        float first = scanner.nextFloat();

        System.out.println(msg2);
        float second = scanner.nextFloat();

        System.out.println(msg3);
        float third = scanner.nextFloat();

        System.out.println(msg4);
        float forth = scanner.nextFloat();

        System.out.println(msg5);
// math
        float z = sum(first,third,forth,second);
        System.out.println(z);

    }

    static float sum(float a, float b, float c, float x) {
        return a * x * x + b * x + c;
    }
}