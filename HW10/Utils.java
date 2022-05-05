package HW10;

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

    public void stringMethods1(String string){
        String result = "";
        if (string.isEmpty()){
            result = "STRING IS EMPTY";
        } else {
            if((string.charAt(0) == ' ') || (string.charAt(string.length()-1) == ' ')) {
                string.trim();
                result = "ALL LEADING AND TAILING SPACES REMOVED";
            } else {
                result = "NO LEADING AND TAILING SPACES DETECTED";
            }
        }
        System.out.println(result);
        System.out.println(string.trim());
    }

    public static void main(String[] args) {
        Utils str1 = new Utils();
        String string = "        Life is amazing!  ";
        str1.stringMethods1(string);

    }


}
