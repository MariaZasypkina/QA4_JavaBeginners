package homework;

public class Ending extends HW4_3 {

    public static int ending (int apples, int students){
        int result = apples / students;

        if ((((result > 4) && (result < 20)) || (result % 10 == 0)) && (result > 1)) {
            System.out.println(result + " яблок на студента.");
        }

        String result1 = result + "";

        if ((result1.endsWith("1")) && (result != 11)){
            System.out.println(result + " яблоко на студента.");
        }
        if ((result1.endsWith("2")) || (result1.endsWith("3")) || (result1.endsWith("4"))) {
            System.out.println(result + " яблока на студента.");
        }
        double result2 = (double)apples / students;
        if (result < 1) {
            System.out.println(result2 + " яблока на студента.");
        }
        return result;
    }
}
