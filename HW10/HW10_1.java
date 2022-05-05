package HW10;

public class HW10_1 extends Utils {
    public static void main(String[] args) {
        Utils utils = new Utils();
        partNum(1);
        itemNum();
//1
        testNum(1);
        String string1 = "        QA4Everyone  ";
        utils.stringMethods1(string1);

        testNum(2);
        String string2 = "QA4Everyone";
        utils.stringMethods1(string2);

        testNum(3);
        String string3 = "";
        utils.stringMethods1(string3);
//2
        itemNum();

        testNum(1);
        String a = "Maria Maria";
        utils.RemoveAllaAlgorithm(a);

        testNum(2);
        String a1 = "";
        utils.RemoveAllaAlgorithm(a1);

        testNum(3);
        String a2 = "QA4Everyone";
        utils.RemoveAllaAlgorithm(a2);

        testNum(4);
        String a3 = "panda";
        utils.RemoveAllaAlgorithm(a3);
//3
        itemNum();

        testNum(1);
        String b1 = "  3 5 0 4 2 0 9 7 0 6 4 0       0 0 0 ";
        utils.RemoveAllZerosAlgorithm(b1);

        testNum(2);
        String b2 = "0000000111";
        utils.RemoveAllZerosAlgorithm(b2);

//4
        itemNum();

        testNum(1);
        String c1 = " QA    4  Everyone    ";
        utils.RemoveAllSpaces(c1);

        testNum(2);
        String c2 = "p a  n d a  ";
        utils.RemoveAllSpaces(c2);

        testNum(3);
        String c3 = "";
        utils.RemoveAllSpaces(c3);
//5
        itemNum();

        testNum(1);
        String d1 = "Abracadabra";
        utils.HowManyA(d1);

        testNum(2);
        String d2 = "Homenum Revelio";
        utils.HowManyA(d2);

//6
        itemNum();

        testNum(1);
        String e1 = "As of March 2022, Java 18 is the latest version, while Java 17, 11 " +
                "and 8 are the current long-term support (LTS) versions. Oracle released the " +
                "last zero-cost public update for the legacy version Java 8 LTS in January 2019 for " +
                "commercial use, although it will otherwise still support Java 8 with public updates " +
                "for personal use indefinitely. Other vendors have begun to offer zero-cost builds of " +
                "OpenJDK 8 and 11 that are still receiving security and other upgrades";
        utils.isJavaWordThere(e1);

        testNum(2);
        String e2 = "As a decrepit father takes delight" +
                "To see his active child do deeds of youth, " +
                "So I, made lame by fortune’s dearest spite," +
                "Take all my comfort of thy worth and truth. " +
                "For whether beauty, birth, or wealth, or wit, " +
                "Or any of these all, or all, or more, " +
                "Entitled in thy parts do crownèd sit";
        utils.isJavaWordThere(e2);


    }
}
