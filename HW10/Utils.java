package HW10;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

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

    public static void testNum(int testNumber) {
        System.out.println("\n" + "Test " + testNumber);
    }

    //1
    public void stringMethods1(String string) {
        String result = "";
        if (string.isEmpty()) {
            result = "STRING IS EMPTY";
        } else {
            if ((string.charAt(0) == ' ') || (string.charAt(string.length() - 1) == ' ')) {
                string.trim();
                result = "ALL LEADING AND TAILING SPACES REMOVED";
            } else {
                result = "NO LEADING AND TAILING SPACES DETECTED";
            }
        }
        System.out.println(result);
        System.out.println(string.trim());
    }

    //2
    public void RemoveAllaAlgorithm(String str) {
        String result = "";
        if (str.isEmpty()) {
            result = "The String is Empty";

        } else {
            result = str.replace("a", "");
        }
        System.out.println(result);
    }

    //3
    public void RemoveAllZerosAlgorithm(String a) {
        String result = "";
        if (a.isEmpty()) {
            result = "The String is Empty";
        } else {
            result = a.replace(" ", "").replace("0", "");
        }
        System.out.println(result);
    }

    //4
    public void RemoveAllSpaces(String a) {
        String result = "";
        if (a.isEmpty()) {
            result = "The String is Empty";
        } else {
            result = a.replace(" ", "");
        }
        System.out.println(result);
    }

//5

    public void HowManyA(String a) {
        int count = 0;
        a = a.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }

//6

    public void isJavaWordThere(String a) {
        System.out.println(a.contains("Java"));
    }

    //7
    public void concatMethod(String a) {
        String str1 = "\"";
        String str2 = ".\"";
        a = a.trim();
        System.out.println(str1.concat(a).concat(str2));
    }

    //8
    public void correctCityName(String a) {

        System.out.println((a.charAt(0) + "").toUpperCase().
                concat(a.toLowerCase().substring(1)));
    }

    //9
    public void whatInBetweenMethod(String a, String b) {

        System.out.println(a.substring(a.indexOf(b), a.lastIndexOf(b) + 1));

    }

//10

    public void sameBeginningEndLetter(String a) {

        a = a.toLowerCase();
        System.out.println
                (a.charAt(0) == a.charAt(a.length() - 1));
    }

//11

    public void fromStringToArray(String a) {

        System.out.println(Arrays.toString(a.split(" ")));

    }

//12

    public void fullNameToArray(String a) {

        String[] arr = a.split(" ");
        String firstName = "Имя: ";
        String patronomic = "Отчество: ";
        String lastName = "Фамилия: ";
        arr[0] = firstName.concat(arr[0]);
        arr[1] = patronomic.concat(arr[1]);
        arr[2] = lastName.concat(arr[2]);

        System.out.println(Arrays.toString(arr));
    }

//13

    public String sumOfLetters(String a) {
        int sum = 0;
        String result = "";

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) < '0' || a.charAt(i) > '9') {
                sum += a.charAt(i);
                result = sum + "";
            } else {
                result = "Это не буквы";
            }
        }
        return result;
    }
    //14
    public void letterGoesFirst(char a, char b) {
        System.out.println(a < b);
    }

//15

    public int[] StringToNumbers(String a) {
    }
}
