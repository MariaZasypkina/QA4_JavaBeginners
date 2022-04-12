package HW7;

import java.util.Arrays;

public class HW7_Methods {
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
 // 18.
    public static int arrAv(int[]arr2){
        int av = 0;
        for(int i = 0; i < arr2.length; i++){
            av += arr2[i];
        }
        av = av / arr2.length;
        return av;
    }
    public static void verifyResult(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "    PASSED" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "    FAILED" + "\u001B[0m");
        }
    }
public static String arrMinMaxAv(int[]arr5){
    Arrays.sort(arr5);
    int min = arr5[0];
    int max = arr5[arr5.length - 1];
    int sum = 0;
    for (int i = 0; i < arr5.length; i++){
        sum += arr5[i];
    }
    int av = sum / arr5.length;
    return min +"\t"+ max +"\t"+ av;


}





}
