package homework;

public class HW5_1 extends HW5 {
    public static void main(String[] args) {
        partNum(1);
        itemNum();
        verifyEquals(11, 11);
        itemNum();
        /* Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели. */
        weekDay(5);
        verifyEquals(5, 5);
        itemNum();
        /* Given 3 values x, y, z, determine the largest value and assign this value to the variable largest */
        int x = 11;
        int y = 76;
        int z = 2;
        int largest = x;
        if (y > largest) {
            largest = y;
        }
        if (z > largest) {
            largest = z;
        }
        System.out.println(largest);
        verifyEquals(76, largest);
        /* Given 3 values a, b, c, determine the smallest value using nested if statement */
        itemNum();
        int a = 11;
        int b = 76;
        int c = 222;
        int smallest = 0;
        if (b < a) {
            if (b < c) {
                smallest = b;
            } else {
                smallest = c;
            }
        } else {
            if (a < c) {
                smallest = a;
            } else {
                smallest = c;
            }
        }
        System.out.println(smallest);
        verifyEquals(a, smallest);
        /*Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота. */
        itemNum();
        double[] catTemp = {37.50, 38.00, 37.2, 39.00, 37.76};
        double catTempAv = 0;
        for (int i = 0; i < catTemp.length; i++) {
            catTempAv += catTemp[i];
        }
        catTempAv = catTempAv / catTemp.length;
        System.out.println(catTempAv);
        verifyEquals((int) 37.892, (int) catTempAv);


        /* Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.*/
        itemNum();
        System.out.println(curConv(10.75));
        verifyEqualsString("10 руб. 75 коп.", curConv(10.75));

        itemNum();
        /* Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.*/
        System.out.println(kgAndGr(10.75));
        verifyEqualsString("10 кг 75 гр", kgAndGr(10.75));

        itemNum();
/*Написать метод, который принимает на вход 2 параметра -  цену и количество товара (может быть вес товара,
или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.*/
        System.out.println(sumOfPur(0.15, 2));
        verifyEquals((int) (0.3 * 1000), (int) (sumOfPur(0.15, 2) * 1000));

        itemNum();
/*Яблоки
Цена за 1 кг			50 руб 13 коп
Количество товара	         3 кг 400 гр
_______________________________________
Сумма к оплате		170 руб 44 коп */
        getReciept("Apples", 50.13, 3.400);

        itemNum();
/* Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы, и
возвращает заработную плату в месяц. */
        System.out.println(salary(8, 20.15) + "\tUSD");
        verifyEquals((int) (3385.2 * 100), (int) (salary(8, 20.15) * 100));
        itemNum();
/*Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты сотрудникам.
Например:

Смирнова Мария Ивановна 		70000 руб 00 коп

Распечатать ведомость для нескольких сотрудников, например:

Март 2022
Смирнова Мария Ивановна 		70000 руб 00 коп
Серебряков Иван Петрович 		128059 руб 00 коп */

        salaryList("Mary Zasy", 7, 120.25, "May 22");
        salaryList("Maria Za", 8, 200, "May 22");

        itemNum();
        aroundZero(10);

        partNum(2);
        itemNum();
/*Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое число
рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
Например:
год рождения 1999
1 + 9 + 9 + 9 = 28    2 + 8 = 10    1 + 0 = 1   Счастливое число - 1  */
        System.out.println(luckyNumber(1979));
verifyEquals(8, luckyNumber(1979));

itemNum();
/*а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать*/
        System.out.println("\n" + "a) ");
median(1, 3, 9);
        System.out.println("\n" + "b) ");
medianB(1, 3, 9);

itemNum();
/*Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75) и
округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”. */
finalPay(10.75);
itemNum();
/*Посчитать с помощью методов класса Math a = 3 b = 4 c = 20
корень (res1 * res2) / p
Вернуть значение с округлением в бОльшую сторону.*/
        double aa = 3;
        double bb = 4;
        double cc = 20;
        double res = Math.ceil(Math.sqrt(Math.fma(aa,bb,cc) * Math.pow(aa, bb)) / Math.PI);
        System.out.println(res);

        partNum(3);
itemNum();
//1. if (int y > 0) {
//    int x = 1;
//2.  if ((double score > 80.0) && (score < 90)) {
//      score += 5;
//        }
//3.     item = ((i >= 10) || (v < 50));
//4.
        System.out.println( );
        int xx = 13;
        System.out.println("4.");
        System.out.println((xx % 2 != 0) && (xx > 0));
//5.
        System.out.println("5.");
        int xxx = 12, yyy = 54;
        System.out.println((xxx > 0) && (yyy > 0));
//6.
        System.out.println("6.");
        int xxxx = -345, yyyy = - 23;
        System.out.println(((xxxx > 0) && (yyyy > 0)) || ((xxxx < 0) && (yyyy < 0)));

itemNum();
/*Написать метод, который с помощью методов класса Math высчитывает любую степень сгенерированного случайного числа.
Метод возвращает математически округленное целое значение и выводит на экран:
“Число … в степени … = …”. Число может быть в пределах от 0 до 1 исключительно. Степень числа может быть от 0 до 10
включительно*/

exponent(11);
exponent(4);
exponent(8);

itemNum();
/* Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно. */
        System.out.println( );
        random();
        random();

itemNum();
isLeapYear(2000);
isLeapYear(2022);



        }

    }


