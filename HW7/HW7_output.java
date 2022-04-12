package HW7;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class HW7_output extends HW7_Methods {
    public static void main(String[] args) {
        partNum(1);
        itemNum();
        /*1. Создать массив catsNames, заполнить его любыми значениями */
        String[] catsNames = new String[8];
        catsNames[0] = "Мурзик";
        catsNames[1] = "Черномырдин";
        catsNames[2] = "Мурка";
        catsNames[3] = "Васька";
        catsNames[4] = "Рыж";
        catsNames[5] = "Дымка";
        catsNames[6] = "Патрик";
        catsNames[7] = "Зорро";
        System.out.println(Arrays.toString(catsNames));
        itemNum();
/*2. В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
 а значение элемента с индексом 1 на “Черныш”.*/
        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";
        System.out.print(catsNames[4] + "\t");
        System.out.println(catsNames[1]);
        itemNum();
        /*3. Создать массив catsColors и заполнить его значениями.*/
//   String[] catsColors = new String[8];
        String[] catsColors = new String[]{"Grey", "Black", "Grey", "Brown", "Red", "Grey", "Red", "Grey"};
        System.out.println(Arrays.toString(catsColors));
        itemNum();
        /*4. Создать массив catsAges и заполнить его любыми значениями.*/
        int[] catAges = new int[]{3, 7, 14, 1, 20, 7, 2, 2};
        System.out.println(Arrays.toString(catAges));
        itemNum();
        /*5. Создать массив isCatRed и заполнить его соответствующими значениями*/
        boolean[] isCatRed = new boolean[8];
        isCatRed[0] = catsColors[0].equals("Red");
        isCatRed[1] = catsColors[1].equals("Red");
        isCatRed[2] = catsColors[2].equals("Red");
        isCatRed[3] = catsColors[3].equals("Red");
        isCatRed[4] = catsColors[4].equals("Red");
        isCatRed[5] = catsColors[5].equals("Red");
        isCatRed[6] = catsColors[6].equals("Red");
        isCatRed[7] = catsColors[7].equals("Red");
        System.out.println(Arrays.toString(isCatRed));
        itemNum();
        System.out.println();
/*6. Распечатать для массивов catsNames и catsColors:
имя кота в коробке с номером 6
имена котов из коробок с четными индексами
имена котов из коробок, чьи индексы кратны 4
цвет котов из коробок с нечетными индексами
цвет котов из коробок, чьи индексы кратны 3 */
        System.out.println("1. " + catsNames[6]);
        System.out.print("2. ");
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0) {
                System.out.print(catsNames[i] + " ");
            }
        }
        System.out.println();
        System.out.print("3. ");
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 4 == 0) {
                System.out.print(catsNames[i] + " ");
            }
        }
        System.out.println();
        System.out.print("4. ");
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 2 != 0) {
                System.out.print(catsColors[i] + " ");
            }
        }
        System.out.println();
        System.out.print("5. ");
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0) {
                System.out.print(catsColors[i] + " ");
            }
        }
        System.out.println();
        itemNum();
        /*7. Распечатать “Накорми кота!” для всех серых котов*/
        System.out.println();
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                System.out.println("Накорми кота! " + catsNames[i] + " ");
            }
        }
        itemNum();
        /*8. Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет */
        System.out.println();
        for (int i = 0; i < catAges.length; i++) {
            if (catAges[i] < 2) {
                System.out.println("Отнеси кота на прививку! " + catsNames[i] + " ");
            }
        }
        itemNum();
        /*9. ля кота в последней коробке распечатать имя, цвет, возраст*/
        System.out.println(catsNames[catsNames.length - 1] + ", " +
                catsColors[catsNames.length - 1] + ", " + catAges[catsNames.length - 1]);
        itemNum();
        /*10. Распечатать имена всех котов, чей возраст больше 2 лет*/
        for (int i = 0; i < catAges.length; i++) {
            if (catAges[i] > 2) {
                System.out.print(catsNames[i] + " ");
            }
        }
        System.out.println();
        itemNum();
        /*11. Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true*/
        for (int i = 0; i < catsNames.length; i++) {
            if ((catsNames[i].equals("Рыжик")) && (isCatRed[i] == true)) {
                System.out.println("Накорми кота! " + catsNames[i] + ", " + isCatRed[i]);
            }
        }
        partNum(2);
        itemNum();
        /*12. Распечатать средний возраст котов из массива catsAges*/
        int sumAge = 0;
        int avAge = 0;
        for (int i = 0; i < catAges.length; i++) {
            sumAge += catAges[i];
        }
        avAge = sumAge / catAges.length;
        System.out.println(avAge);
        itemNum();
        /* 13. Распечатать возраст самого молодого кота*/
        int[] catAgesSorted = new int[catAges.length];
        for (int i = 0; i < catAges.length; i++) {
            catAgesSorted[i] = catAges[i];
        }
        Arrays.sort(catAgesSorted);
        System.out.println(catAgesSorted[0]);
        itemNum();
        /*14. Распечатать возраст самого старого кота */
        System.out.println(catAgesSorted[catAgesSorted.length - 1]);
        itemNum();
        /*15. Распечатать количество серых котов*/
        int countGrey = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                countGrey += 1;
            }
        }
        System.out.println(countGrey);
        itemNum();
        System.out.println();
        /*16. Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет*/
        for (int i = 0; i < catsNames.length; i++) {
            if ((i % 2 == 0) && (catAges[i] <= 3)) {
                System.out.println(catsNames[i]);
            }
        }
        itemNum();
        /*17. Создать массив четных положительных чисел, значения которых не больше 10. (заполняем значения с помощью цикла for)*/
        int length1 = 1;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                length1 += 1;
            }
        }
        int[] arr1 = new int[length1];
        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0){
                arr1[ (i/2) ] = i;
                i += 1;
            }
            if (i == 10) {break;}
        }
        System.out.println(Arrays.toString(arr1));
        itemNum();
/*18. Написать метод, который принимает на вход массив int, и возвращает среднее значение.
Проверить работу метода тестом, если параметр - массив catsAges */
        System.out.println(arrAv(new int[]{1, 2, 3, 4}));
        System.out.println("Verify result:");
        System.out.println(Arrays.toString(catAges));
        verifyResult(avAge, arrAv(catAges));
        itemNum();
        /*19. Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900*/
        int length = 0;
        for (int i = -999; i < -900; i++) {
            if (i % 2 != 0) {
                length += 1;
            }
        }
        int[] arr3 = new int[length];
        for (int i = 0; i  < arr3.length; i++){
            for (int j = -1000; j <= -900; j++) {
            if (j % 2 != 0) {
            arr3[i] = j;
            i += 1;
            j += 1;
            }
            }
}
        System.out.println(Arrays.toString(arr3));
itemNum();
/*20. Создать массив из 10 случайных положительных целых чисел */

        int [] arr4 = new int[10];
        for (int i = 0; i < 10; i++){
            arr4[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr4));
partNum(3);
itemNum();




    }    }







