package Lessons;
public class Task1 {
    //    Задача Проверьте число.
//    Если число нечетное и кратно трем, то посччитайте результат деления на 3.
//    Иначе посчитайте результат умножения на 3.
//    Если число нечетное, посчитайте произведение числа на результат деления на 2.
//
//    Выведите результат на печать.
//
//    Напишите тест, который проверит работу кода и выведет на печать результат проверки.
//
//        Тестовые данные 23, 44, 21
//
//
    public static void main(String[] args) {
        int a = 23;
        int expectedResult =  69;
        if (a % 2 != 0) {
            if (a % 3 == 0) {
                a = a / 3;
            } else {
                a = a * 3;
            }
        } else {
            a = a * (a / 2);
        }
        System.out.println(a);

        //Test
if(expectedResult == a){
    System.out.println("\u001B[32m" + "Pass");
} else {
    System.out.println("\u001B[31m" + "Fail");
}

    }
}
