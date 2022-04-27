package HW8;

import java.util.Arrays;

public class Utils {
    public static void partNum(int part) {
        System.out.println("--------------------");
        System.out.println("Part " + part);
        System.out.println("--------------------");
    }

    public static int num1 = 1;

    public static void itemNum() {
        if (num1 < 10) {
            System.out.print(num1 + ") -----> ");
        } else {
            System.out.print(num1 + ") ----> ");
        }
        num1++;
    }

    public static void verifyResult(int expectedResult, int actualResult) {
        System.out.println("\u001B[32m" +"Verification result:");
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Verification result:    PASSED" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Verification result:    FAILED" + "\u001B[0m");
        }
    }

    public static void verifyResultArray(int [] expectedResult, int [] actualResult) {
        String result = " ";
        if(expectedResult.length == 1){
            result = "\u001B[31m" + "Input Data is out of range" + "\u001B[0m";
        } else {
        for (int i = 0; i < expectedResult.length; i++){
            for (int j = 0; j < actualResult.length; j++){

        if (expectedResult[i] == actualResult[j]) {
            result = "\u001B[32m" + "Verification result:    PASSED" + "\u001B[0m";
        } else {
            result = "\u001B[31m" + "Verification result:    FAILED" + "\u001B[0m";
        }
    }}}
        System.out.println(result);
    }

    public static void verifyStringResult(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Verification result:    PASSED" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Verification result:    FAILED" + "\u001B[0m");
        }
    }
    public static void methodInt(int d, int e, int f, int g, int h){
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[0] = d;
            arr[1] = e;
            arr[2] = f;
            arr[3] = g;
            arr[4] = h;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void methodD(double d, double e, double f, double g, double h){
        double[] arr1 = new double[5];
        for (int i = 0; i < 5; i++) {
            arr1[0] = d;
            arr1[1] = e;
            arr1[2] = f;
            arr1[3] = g;
            arr1[4] = h;
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void methodS(String a, String b, String c, String d, String e){
        String [] arr1 = new String[5];
        for (int i = 0; i < 5; i++){
            arr1[0] = a;
            arr1[1] = b;
            arr1[2] = c;
            arr1[3] = d;
            arr1[4] = e;
        }
        System.out.println(Arrays.toString(arr1));
    }
    //Написать метод, который принимает на вход массив целых чисел,  и возвращает массив тех же чисел, умноженных на 2.5
    public static String multiplyArray(int [] arr){
        double [] arr1 = new double [arr.length];
        for (int i = 0; i < arr.length; i++){
            arr1[i] = (double)arr[i]*2.5;
        }
    return Arrays.toString(arr1);
    }
//Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает количество четных чисел в этом массиве

public static int posCount (int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]%2==0){
                count +=1;
            }
        }
        return count;
}
//Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает массив нечетных чисел

public static int [] negArr(int [] arr) {
        int count = 0;
        int [] arr1 = new int[arr.length];
            for (int i = 0; i < arr.length; i++){
                if (arr[i] % 2 != 0){
                  arr1[i] = arr[i];
                  count += 1;
                }
            }
        int [] arr2 = new int[count];
            for (int i = 0, j = 0; i < arr1.length; i++){
                if (arr1[i] != 0) {
                arr2[j] = arr1[i];
                j++;
        }
    }
        return arr2;
}
//Написать метод, который принимает на вход масив целых чисел,  и возвращает массив
// значений true или false, если числа больше 10

    public static boolean [] moreThanTen(int [] arr){
        boolean [] arr1 = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++){
                arr1[i] = arr[i] > 10;
            }
        return arr1;
    }
//Написать метод, который принимает на вход массив слов,  и возвращает
// строку, состоящую из этих слов

    public static String arrToStringMethod(String[]array){
        String arrToString = "";
        for(int i = 0; i < array.length; i++){
            arrToString += array[i] + " ";
        }
        return arrToString;
    }
//15.Написать метод, который принимает массив целых чисел и считает
// сумму чисел во второй половине массива
    public static int secondPartSum(int[]arr){
        int sum = 0;
        for (int i = arr.length/2; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
//16.Написать метод, который принимает на вход целое положительные число в
// пределах от 1 до 10 исключительно, и возвращает таблицу умножения на это
// число в виде массива
//Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

public static int[] multiScore(int a){
        int [] arr1 = new int[11];
        int [] arrNull = {0};
        while ((a > 0) && (a < 10)){
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = a * i;
        }
        return arr1;
}
    return arrNull;
    }
//17.Написать метод, который принимает массив целых чисел и возвращает массив
// четных чисел, если четных чисел больше, или массив нечетных чисел, если
// нечетных чисел больше.
public static int[] oddOrEvenArray(int [] arr){
        int countOdd = 0;
        int countEven = 0;
        int arr1Length = 0;
        for (int i = 0; i <arr.length; i++){
            if (arr[i] % 2 == 0) {
                countEven +=1;
            } else {
                countOdd +=1;
            }
        }
        if(countEven > countOdd){
            arr1Length = countEven;
        } else {
            arr1Length = countOdd;
        }
        int [] arrEven = new int [arr1Length];
        int [] arrOdd = new int [arr1Length];
        for(int i = 0, j = 0, k = 0; i < arr.length; i++){
        if (arr[i] % 2 == 0){
            arrEven[j] = arr[i];
            j++;
        } else {
            arrOdd[k] = arr[i];
            k++;
        }
        }
        if (countEven > countOdd) {
            return arrEven;
        } else {
            return arrOdd;
        }
    }
//18.Написать метод, который принимает на вход длину массива и генерирует массив
// случаейных положительных чисел от 0 до 100 исключительно.
public static int [] randomArr(int a){
int [] arr = new int[a];
for (int i = 0; i < a; i++){
    arr[i] = (int)(Math.random()*100);
    if ((arr[i] == 0)|| (arr[i] == 100)){
     arr[i] = (int)(Math.random()*100);
    }
}
return arr;
}
//19.Написать метод, который принимает на вход длину массива l и количество знаков
// d (однозначные, двузначные, трехзначные и тд числа), и генерирует массив
// случайных целых положительных чисел длины l, в котором все числа имеют
// количество знаков d
    public static int[] randomArr2(int l, int d){
        int [] arr = new int[l];
        for (int i = 0; i < l; i++){
          arr[i] = (int)(Math.random()*Math.pow(10.00, (double) d));
        }
        for (int i = 0; i < l; i++) {
            StringBuilder s = new StringBuilder(d);
            for(int j = 0; j < (d - (arr[i] + "").length()); j++){
                s.append("0");
            }
            if ((arr[i] + "").length() < d) {

                arr[i] = Integer.valueOf((arr[i] + "") + s);
            }
            }
        return arr;
    }

//20.Написать метод, который принимает на вход массив целых положительных чисел, и
// возвращает массив только двузначных чисел. ПРоверить работу метода на массиве из
// задания 18.

public static int [] twoDigitsArr(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if ((arr[i]+"").length() == 2) {
            count += 1;
            }
        }
int [] arr1 = new int[count];
        for (int i = 0, j = 0; i < arr.length; i++) {
                if ((arr[i] + "").length() == 2) {
                    arr1[j] = arr[i];
                    j++;
                }
            }
        return arr1;
}
//21.Написать метод, который принимает на вход массив целых положительных двузначных
// чисел, и возвращает массив разниц между десятками и единицами
    public static int [] difArr(int [] arr){
        int [] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            String a = Integer.toString(arr[i]);
        arr1[i] = Integer.valueOf(a.charAt(0)) - Integer.valueOf(a.charAt(1));
        }
        return arr1;
    }
//22.Написать метод, который принимает массив из 11 целых положительных чисел от 0
// до 9, и возвращает массив, который содержит номер телефона, состоящий из этих
// чисел,  и название страны, которой номер принадлежит. //Например:
//method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}



//23.Написать метод, который принимает массив целых положительных чисел больше 0, и
//возвращает массив уникальных чисел.
public static int [] unicNum(int [] arr){
       int count = 0;
       Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    for (int i = 0, j = i+1; i < arr.length; i++) {
            if (arr[i] == arr[j]) {
                count +=1;
                j++;
       }}
        int [] arr1 = new int[count];
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1 ; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr1[i] = arr[i];
                j++;
            }
        }}
        return arr1;
}

}