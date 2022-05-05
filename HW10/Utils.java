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

    public static void testNum(int testNumber){
        System.out.println("\n" + "Test "+ testNumber);
    }
//1
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
//2
    public void RemoveAllaAlgorithm(String str){
        String result = "";
        if(str.isEmpty()){
            result = "The String is Empty";

        } else {
            result = str.replace("a", "");
        }
        System.out.println(result);
    }
//3
    public void RemoveAllZerosAlgorithm(String a){
        String result = "";
        if(a.isEmpty()){
            result = "The String is Empty";
        } else {
            result = a.replace(" ", "").replace("0", "");
        }
        System.out.println(result);
    }
//4
    public void RemoveAllSpaces(String a){
        String result = "";
        if(a.isEmpty()){
            result = "The String is Empty";
        } else {
            result = a.replace(" ", "");
        }
        System.out.println(result);
    }

//5

    public void HowManyA(String a){
        int count = 0;
        a = a.toLowerCase();
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }

//6

    public void isJavaWordThere(String a){
        System.out.println(a.contains("Java"));
    }
}
