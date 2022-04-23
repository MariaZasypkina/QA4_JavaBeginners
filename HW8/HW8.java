package HW8;
import java.lang.reflect.Array;
import java.util.Arrays;

import static HW8.Utils.*;
public class HW8 {
    public static void main(String[] args) {
        partNum(1);
        itemNum();
        itemNum();
        itemNum();
        itemNum();
        Integer a = new Integer(121);
        Double b = new Double(100.00);
        String c = new String("Object!");
        itemNum();
        System.out.println();
        itemNum();
        //Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и распечатать результат сравнения в виде таблички:
        //HW8	 		|HW8_1			|areEquals?
        //____________________________________________
        //Double d = …	|Double d_1 = …		| true or false
        //……
        Integer a2 = new Integer(HW8_1.a);
        Double b2 = new Double(HW8_1.b);
        String c2 = new String(HW8_1.c);

        System.out.println();
        System.out.println("HW8 " + "\t".repeat(5) + "| HW8_1 " + "\t".repeat(6) + "| areEquals?");
        System.out.println("________________________________________________________________________");
        System.out.println("Integer a = " + HW8_1.a + "\t".repeat(4) + "| Integer a2 = " + a2 + "\t".repeat(4) + "| " + a.equals(a2));
        System.out.println("Double b = " + HW8_1.b + "\t".repeat(3) + "| Double b2 = " + b2 + "\t".repeat(4) + "| " + b.equals(b2));
        System.out.println("String c = " + HW8_1.c + "\t".repeat(3)+ "| String c2 = " + c2 + "\t".repeat(3)+ "| " + c.equals(c2));

        itemNum();
//Написать метод, который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел
        methodInt(1,2,3,4,5);
        itemNum();

//Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
        methodD(1.00, 2.00, 3.00, 4.00, 5.00);
        itemNum();
//Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
methodS("aaa", "qqq", "tyd", "dsfs", "khy");
itemNum();
//Написать метод, который принимает на вход массив целых чисел,  и возвращает массив тех же чисел, умноженных на 2.5
        int [] arr = {5, 12, 13, 12, 2, 45, 98, 3, 99,44, 7};
        System.out.println(multiplyArray(arr));
itemNum();
//Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает количество четных чисел в этом массиве

        System.out.println(posCount(arr));
itemNum();
//Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает массив нечетных чисел
        System.out.println(Arrays.toString(negArr(arr)));
partNum(2);
itemNum();
//Написать метод, который принимает на вход масив целых чисел,  и возвращает массив значений true или false,
// если числа больше 10
        System.out.println(Arrays.toString(moreThanTen(arr)));

itemNum();
//Написать метод, который принимает на вход массив слов,
// и возвращает строку, состоящую из этих слов
        String [] array = {"mama", "papa", "deti", "babushka", "dedushka"};
        System.out.println(arrToStringMethod(array));
itemNum();
//15.Написать метод, который принимает массив целых чисел и считает
// сумму чисел во второй половине массива
        System.out.println(Arrays.toString(arr));
        System.out.println(secondPartSum(arr));
itemNum();
//Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно, и возвращает таблицу умножения на это число в виде массива
//Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
        System.out.println(Arrays.toString(multiScore(3)));
        int [] arr2 = {0, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        System.out.println("--------->" + Arrays.toString(arr2));
        verifyResultArray(multiScore(3), arr2);
itemNum();
//17. Написать метод, который принимает массив целых чисел и возвращает массив четных чисел, если четных чисел больше, или массив нечетных чисел, если нечетных чисел больше.
System.out.println(Arrays.toString(oddOrEvenArray(arr2)));
int [] test = {0, 6, 12, 18, 24, 30};
verifyResultArray(test, oddOrEvenArray(arr2));
itemNum();
//18.Написать метод, который принимает на вход длину
// массива и генерирует массив случаейных положительных
// чисел от 0 до 100 исключительно.
System.out.println(Arrays.toString(randomArr(25)));
itemNum();
//19.Написать метод, который принимает на вход длину
// массива l и количество знаков d (однозначные,
// двузначные, трехзначные и тд числа), и генерирует
// массив случайных целых положительных чисел длины l,
// в котором все числа имеют количество знаков d
System.out.println(Arrays.toString(randomArr2(25, 3)));
itemNum();
//20.Написать метод, который принимает на вход массив целых
// положительных чисел, и возвращает массив только
// двузначных чисел. ПРоверить работу метода на массиве
// из задания 18.
        System.out.println(Arrays.toString(twoDigitsArr(randomArr(5))));
itemNum();
//21.Написать метод, который принимает на вход массив целых
// положительных двузначных чисел, и возвращает массив
// разниц между десятками и единицами
        int [] arr3 = {31, 11, 42, 18, 78, 37};
        System.out.println(Arrays.toString(difArr(arr3)));
partNum(3);
itemNum();
//22. Написать метод, который принимает массив из 11 целых положительных
// чисел от 0 до 9, и возвращает массив, который содержит номер телефона,
// состоящий из этих чисел,  и название страны, которой номер принадлежит.
//Например: method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}

itemNum();
//Написать метод, который принимает массив целых положительных чисел больше 0, и
// возвращает массив уникальных чисел.
        int [] arr4 = {45, 22, 3, 3, 7, 11, 22, 37, 45, 47, 53, 56, 4, 57, 62, 72, 4, 76, 78, 78, 85, 94, 5, 95};
        System.out.println(Arrays.toString(unicNum(arr4)));



    }
}




