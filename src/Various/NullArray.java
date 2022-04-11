package Various;

public class NullArray {
    public static void main(String[] args) {
        Integer[] arr = {23, 65, 36, 23, null};
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == null) {
               System.out.println("true");
           }
        }
    }

}