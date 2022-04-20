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
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "    PASSED" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "    FAILED" + "\u001B[0m");
        }
    }

    public static void verifyStringResult(String expectedResult, String actualResult) {
        System.out.println("Verification result:");
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "    PASSED" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "    FAILED" + "\u001B[0m");
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
                System.out.println(Arrays.toString(arr1));
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

}