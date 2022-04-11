package Test1;

public class HelloWorld {
    public static void m(){
        System.out.println("Hello");
    }
    public static void m1(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        m();
        m1(3,7);

    }
}
