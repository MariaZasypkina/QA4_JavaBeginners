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
        System.out.println("HW8 " + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "| HW8_1 " + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "| areEquals?");
        System.out.println("________________________________________________________________________");
        System.out.println("Integer a = " + HW8_1.a + "\t" + "\t" + "\t" + "\t" + "| Integer a2 = " + a2 + "\t" + "\t" + "\t" + "\t" + "| " + a.equals(a2));
        System.out.println("Double b = " + HW8_1.b + "\t" + "\t" + "\t" + "| Double b2 = " + b2 + "\t" + "\t" + "\t" + "\t" + "| " + b.equals(b2));
        System.out.println("String c = " + HW8_1.c + "\t" + "\t" + "\t" + "| String c2 = " + c2 + "\t" + "\t" + "\t" + "| " + c.equals(c2));

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



    }
}




