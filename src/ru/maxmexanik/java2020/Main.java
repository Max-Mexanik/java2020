package ru.maxmexanik.java2020;

public class Main {
    static int[] Numbers = new int[] {1,2,3,4,5,6,7,8,9};
    static int Sum, a;


    public static void main(String[] args) {
        //Первое задание, вывод суммы элементов массива, с помощью цикла
        for (int number : Numbers) {
            Sum += number;
        }
        System.out.print("Cумма полученная сумированием в цикле for: ");
        System.out.println(Sum);
        Sum = 0;

        while(a < Numbers.length)
        {
            Sum+=Numbers[a];
            a++;
        }
        System.out.print("Cумма полученная сумированием в цикле while: ");
        System.out.println(Sum);
        Sum = 0;
        a = 0;

        do {
            Sum+=Numbers[a];
            a++;
        }
        while (a < Numbers.length);
        System.out.print("Cумма полученная сумированием в цикле do while: ");
        System.out.println(Sum);
        //Второе задание, вывод аргументов командной строки на экран в цикле for
        for(String str : args)
        {
            System.out.println(str);
        }


    }
}
