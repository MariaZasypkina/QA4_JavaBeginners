package HW6;

public class HW6_output extends HW6_Methods {
    public static void main(String[] args) {
        partNum(1);
     itemNum();
/*1. Распечатать последовательность чисел от 0 до 9 включительно.*/
     for (int i = 0; i < 10; i++){
         System.out.print(i + " ");
     }
        System.out.println( );
     itemNum();
/*2. Распечатать последовательность чисел от 10 исключительно до 0 включительно.*/
        for (int i = 10; i >= 0; i--){
            System.out.print(i + " ");
        }
        System.out.println( );
        itemNum();
/*3. Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.*/
        for (int i = 50; i <= 55; i = i + 2){
            System.out.print(i + " ");
        }
        System.out.println( );
        itemNum();
/*4. Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)*/
        for (int i = 327; i > 300; i--){
            if (i % 7==0) {
                System.out.print(i + " ");
            }
    }
        System.out.println( );
        itemNum();
/*5.Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1*/
        for (double i = 12.1; i < 12.9; i = i + 0.1) {
            System.out.print((float)i + " ");
        }
        System.out.println();
        itemNum();
/*6.Распечатать последовательность четных чисел от 215 до 237 включительно*/
for (int i = 215; i <= 237; i++){
    if (i % 2 == 0) {
        System.out.print(i + " ");
    }
}
        System.out.println();
itemNum();
/*7. Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.*/
        for (int i = 8; i < 14; i++){
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
itemNum();
/*8. Распечатать последовательность которая начинается с минимального значения типа данных short
и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.*/
        for (int i = Short.MIN_VALUE; i <= Short.MAX_VALUE; i++) {
        if (i % 15001 == 0) {
        System.out.print(i + " ");
}
}
        System.out.println( );
itemNum();
/*9.Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11, должны
быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом. А ноль необходимо
 распечатать словом ZERO.*/
        for (int i = -10; i <= 34; i++){
            if (i == 0){
                System.out.print("ZERO ");
            }
            if ((i % 11 == 0) && (i != 0)) {
                System.out.print("\u001B[30m" +i + " " + "\u001B[0m");
            }
            if ((i % 12 == 0) && (i != 0)) {
                System.out.print("\u001B[31m" +i + " " + "\u001B[0m");
            }
        }
        System.out.println( );
itemNum();
/*10.Написать метод, который принимает на вход параметры start,  end, step,
и печатает последовательность десятичных  чисел, начиная с числа start, с
шагом step. Точка выхода из цикла - число end.*/

cicle(12,98,4);
        System.out.println();

partNum(2);
itemNum();
/*11. Написать метод, который принимает параметр l и печатает
последовательность четных чисел от нуля. Длина последовательности = l.*/
even(11);
        System.out.println( );
itemNum();
/*12. Напишите метод, который принимает целое число n, и
выводит все степени числа 2 от 1 до n включительно*/
twoPow(16);
        System.out.println();
itemNum();
/*13. ывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.*/
for(int i = 0; i <= 9; i++){
    System.out.print(i);
}
        for(int i = 0; i <= 9; i++){
            System.out.print(i +""+ i);
        }
        for(int i = 0; i <= 9; i++){
            System.out.print(i+""+ i+"" + i);
        }
        for(int i = 0; i <= 9; i++){
            System.out.print(i+""+ i+"" + i+"" + i);
        }
        System.out.println();
itemNum();
/*14. Распечатайте последовательность чисел: 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5 */
for (int i = 0; i >= -5; i--) {
    if (i == 0) {
        System.out.print(i + " ");
    } else {
        System.out.print(Math.abs(i) + " " + i + " ");
    }
}
        System.out.println();
itemNum();
/*15. Распечатать последовательность чисел: 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25*/
        for (int i = 0; i <= 25; i++){
        if ((i%3==0) || (i%5 == 0)) {
        System.out.print(i + " ");
    }
}
        System.out.println();
itemNum();
/*16. Написать метод, который принимает параметры n, m, l, и печатает последовательность нечетных
 чисел начиная с числа n, с шагом m,  длина последовательности  l.  */
odd(3, 3, 10);
        System.out.println();
itemNum();
/*17. Сгенерируйте и распечатайте последовательность по формуле: n + 1 = n + 2 */

    }}
