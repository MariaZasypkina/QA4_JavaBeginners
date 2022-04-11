package homework;

import static java.lang.String.valueOf;

public class HW4_4 {

    public static int tempConv(int tempC){
        int tempF = (tempC * 9 / 5) + 32;
        System.out.println(tempC + " °C " + "\t" + tempF + " °F ");
        return tempF;

    }

    public static void main(String[] args) {
        tempConv(40);



        short a = Short.MAX_VALUE - 32000;
        int r = valueOf(a).length();
        String r1= valueOf(a).length() + "";
        r1 = r1.replace("5", "five");
        r1=r1.replace("4", "four");
        r1=r1.replace("3", "three");
        r1=r1.replace("2", "two");
        r1=r1.replace("1", "one");

        System.out.println(a + "\t This is a " + r1+ "-digit number");

    }

}

//Напишите алгоритм программы, которая проверяет число типа short на количество разрядов, и выводит результат проверки.
//( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
//Выведите результат проверки на печать.