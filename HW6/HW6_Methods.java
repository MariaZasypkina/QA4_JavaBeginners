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
public static void even(int l){
    for (int i = 0; i < l*2; i++){
        if(i % 2 == 0) {
            System.out.print(i + " ");
        }
    }
}
public static void twoPow(int n){
    for(int i = 1; i <= n; i++) {
        System.out.print((int)Math.pow(2, i) + " ");
    }
}
public static void odd(int n, int m, int l){
    for (int i = n; i <= l*m*2; i = i + m){
        if (i % 2 != 0) {
            System.out.print(i + " ");
        }
    }
}





}
