public class HW4 {
    public static int tempConv(int tempC){
        int tempF = (tempC * 9 / 5) + 32;
        System.out.println(tempC + " °C " + "\t" + tempF + " °F ");
        return tempF;

    }

    public static void main(String[] args) {
        tempConv(30);
    }
}

}
