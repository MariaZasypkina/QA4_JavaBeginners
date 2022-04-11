package homework;

public class HW4_3 {

    public static void main(String[] args) {
Ending.ending(42,42);
Ending.ending(55,5);
Ending.ending(1,2);

int expectedResult = 11;
        if (expectedResult == Ending.ending(55,5)) {
           System.out.println("\u001B[32m" + "TEST PASSED" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "TEST FAILED" + "\u001B[0m");
       }
   }
}
