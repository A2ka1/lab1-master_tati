// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// 1 и 2 часть первой лабы
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//Основы языка Java

 //задание 4
        //System.out.println("Программа решает квадратное уравнение вида:");
        //System.out.println("ax^2 + bx + c = 0");
        //System.out.println("Введите a, b и c:");
        //double a = in.nextDouble();
        //double b = in.nextDouble();
        //double c = in.nextDouble();
        //double dis = 0;
        //dis = b * b - 4 * a * c;
        //if (dis < 0) {
            //System.out.println("Нет однозначного решения");
        //} else if (a != 0) {
            //if (dis > 0) {
                //double x1 = (-b - Math.sqrt(dis)) / (2. * a);
                //double x2 = (-b + Math.sqrt(dis)) / (2. * a);
                //if (x1 == -0) {
                    //x1 = 0;
                //}
                //System.out.println("Кол-во корней: 2 \n x1 = " + x1 + " \n x2 = " + x2);

            //} else {
                //double x1 = -b / (2. * a);
                //if (x1 == -0) {
                    //x1 = 0;
                //}
                //System.out.println("Кол-во корней: 1 \n x1 = " + x1);
            //}

        //} else {
            //if (b != 0) {
                //double x1 = -c / b;
                //if (x1 == -0) {
                    //x1 = 0;
                //}
                //System.out.println("Кол-во корней: 1 \n x1 = " + x1);
            //} else {
                //System.out.println("Нет однозначного решения");
            //}
        //}

// задание 5

       // Протабулируйте функцию sin(x) в заданных пределах и с заданным шагом.

        // System.out.println("Введите шаг:");
        //        double s = in.nextDouble();
        //        System.out.println("Введите нижнюю границу:");
        //        double l1 = in.nextDouble();
        //        double x = l1;
        //        System.out.println("Введите верхнюю границу:");
        //        double l2 = in.nextDouble();
        //        while (x >= l1 && x <= l2)
        //        {
        //            System.out.println(x + " "+ Math.sin(x*x));
        //            x+=s;
        //        }

//задание 6

        // Напишите программу для решения системы двух линейных уравнений с двумя неизвестными в вещественных числах.

        /*System.out.println("Программа решает систему линейных уравнений с двумя неизвестными:");
        System.out.println("a1x + b1y = c1 and a2x + b2y = c2");
        System.out.println("Введите a1, b1, c1, a2, b2, c2:");
        double a1 = in.nextDouble();
        double b1 = in.nextDouble();
        double c1 = in.nextDouble();
        double a2 = in.nextDouble();
        double b2 = in.nextDouble();
        double c2 = in.nextDouble();

        double determinant = a1 * b2 - a2 * b1;

        if (determinant == 0)
        {
            System.out.println("Система не имеет решения");
        }
        else {
            double x = (c1 * b2 - c2 * b1) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            System.out.printf(" x = %.2f and y = %.2f", x, y);
        }

         */
// задание 7

        //Напишите программу вычисления функции exp(x) разложением в ряд Тейлора с
        // заданной точностью. Программа должна суммировать члены ряда до тех пор, пока
        // модуль очередного члена ряда не станет меньше точности.

       /* System.out.print("Введите x: ");
        double x = in.nextDouble();

        System.out.print("Введите точность: ");
        double eps = in.nextDouble();
        double sum = 1.0; // инициализируем переменную sum начальным значением 1.0
        double term = 1.0; // инициализируем переменную term начальным значением 1.0
        int n = 1; // инициализируем переменную n начальным значением 1

        while (Math.abs(term) >= eps) { // запускаем цикл, пока модуль очередного члена ряда Тейлора не станет меньше точности
            term *= x / n; // вычисляем очередной член ряда Тейлора
            sum += term; // добавляем его к сумме
            n++; // увеличиваем счетчик на 1
        }
        System.out.println("exp(" + x + ") = " + sum);

        */
//Работа с массивами

// задание 8

        //Вывод массива на консоль.

        /* int[] Array = {1, 7, 88, 97};
        //System.out.println(Arrays.toString(Array)); //можно использовать эту функцию
        for (int i = 0; i < 4; i++)
            System.out.println(Array[i]);

         */
// задание 9

        //Ввод элементов массива с клавиатуры.

        /*System.out.println("Введите размер массива:");
        int size = in.nextInt(); // размер массива
        int [] array = new int[size]; // Создаём массив  размером в size
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Массив:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();

         */

// задание 10

        //Сумма всех элементов массива.
/*
        int myArray[] = {3, 5, 7, 12};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);

 */

// задание 11

        //Количество четных чисел в массиве.

  /*      int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Количество четных чисел: " + count);

   */

// задание 12

           // Количество элементов массива, принадлежащих отрезку [a; b].

 /*       int[] array = new int[6];
        System.out.println("Введите элементы массива (6 элементов):");
        for (int i = 0; i < 6; i++)
        {
            array[i] = in.nextInt();
        }
        System.out.println("Введите a:");
        int a = in.nextInt();
        System.out.println("Введите b:");
        int b = in.nextInt();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= a && array[i] <= b) {
                count++;
            }
        }

        System.out.println("Количество элементов массива, принадлежащих отрезку [" + a + "; " + b + "]: " + count);

  */

// задание 13

        //Проверка: все ли элементы массива положительные.
        /*
        int[] array = new int[6];
        System.out.println("Введите элементы массива (6 элементов):");
        for (int i = 0; i < 6; i++)
        {
            array[i] = in.nextInt();
        }
        boolean allPositive = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                allPositive = false;
                break;
            }
        }

        if (allPositive) {
            System.out.println("Все элементы массива положительные");
        } else {
            System.out.println("Не все элементы массива положительные");
        }

         */

// задание 14

        //Переставьте в массиве элементы в обратном порядке.

       /* int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));

        */



    }
}


