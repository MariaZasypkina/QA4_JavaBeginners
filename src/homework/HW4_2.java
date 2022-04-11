package homework;

public class HW4_2 {
    public static void getDivision(int k, int l, int m) {
        int resKl1 = k / l;
        int reskl2 = k % l;
        int resKm1 = k / m;
        int resKm2 = k % m;
        int resLm1 = l / m;
        int resLm2 = l % m;
        int resLk1 = l / k;
        int resLk2 = l % k;
        int resMk1 = m / k;
        int resMk2 = m % k;
        int resMl1 = m / l;
        int resMl2 = m % l;


        System.out.println("Результат деления " + k + " на " + l + " = " + resKl1 + ", а остаток от деления  = " + reskl2);
        System.out.println("Результат деления " + k + " на " + m + " = " + resKm1 + ", а остаток от деления  = " + resKm2);
        System.out.println("Результат деления " + l + " на " + m + " = " + resLm1 + ", а остаток от деления  = " + resLm2);
        System.out.println("Результат деления " + l + " на " + k + " = " + resLk1 + ", а остаток от деления  = " + resLk2);
        System.out.println("Результат деления " + m + " на " + k + " = " + resMk1 + ", а остаток от деления  = " + resMk2);
        System.out.println("Результат деления " + m + " на " + l + " = " + resMl1 + ", а остаток от деления  = " + resMl2);

    }

    public static void main(String[] args) {
getDivision(24, 12, 3);
    }
}
