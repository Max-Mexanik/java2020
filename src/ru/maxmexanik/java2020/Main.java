package ru.maxmexanik.java2020;

public class Main {
    static int[] Numbers = new int[] {1,2,3,4,5,6,7,8,9};
    static int Sum, A;
    static double GarmSum = 0;


    public static void main(String[] args) {

        //Первое задание, вывод суммы элементов массива, с помощью цикла
        for (int number : Numbers) {
            Sum += number;
        }
        System.out.print("Cумма полученная сумированием в цикле for: ");
        System.out.println(Sum);
        Sum = 0;

        while(A < Numbers.length)
        {
            Sum+=Numbers[A];
            A++;
        }
        System.out.print("Cумма полученная сумированием в цикле while: ");
        System.out.println(Sum);
        Sum = 0;
        A = 0;

        do {
            Sum+=Numbers[A];
            A++;
        }
        while (A < Numbers.length);
        System.out.print("Cумма полученная сумированием в цикле do while: ");
        System.out.println(Sum);

        //Второе задание, вывод аргументов командной строки на экран в цикле for
        System.out.print("Аргументы командной строки: ");
        for(String str : args)
        {
            System.out.print(str);
        }
        System.out.println();
        //Третье задание, вывод 10ти чисел гармонического ряда на экран
        System.out.println("Первые десять элементов гармонического ряда: ");
        for(int s = 1; s<=10; s++)
        {
            GarmSum += 1./s;
            System.out.println(GarmSum);
        }

    }
}
