package HW6;

public class HW6_Methods {

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
    public static void cicle(int start, int end, int step){
        for (int i = start; i <= end; i = i + step) {
            System.out.print(i + " ");
        }
    }






}
