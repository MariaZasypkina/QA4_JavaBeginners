package HW8;

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
}
