package HW10;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

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
//7

        itemNum();

        testNum(1);
        String f = "\"One\"";
        utils.concatMethod(f);

        testNum(2);
        String f1 = "One";
        utils.concatMethod(f1);

        testNum(3);
        String f2 = "  TWO  ";
        utils.concatMethod(f2);

//8
        itemNum();

        testNum(1);
        String g = "ташкент";
        utils.correctCityName(g);

        testNum(2);
        String g1 = "ЧикаГО";
        utils.correctCityName(g1);

//9
        itemNum();

        testNum(1);
        String h = "Abracadabra";
        String h1 = "b";
        utils.whatInBetweenMethod(h, h1);

        testNum(2);
        String h2 = "Whippersnapper";
        String h3 = "p";
        utils.whatInBetweenMethod(h2, h3);

//10
        itemNum();

        testNum(1);
        String k = "Abracadabra";
        utils.sameBeginningEndLetter(k);

        testNum(2);
        String k1 = "Whippersnapper";
        utils.sameBeginningEndLetter(k1);

//11

        itemNum();

        testNum(1);
        String l = "QA for Everyone";
        utils.fromStringToArray(l);

        testNum(2);
        String l1 = "Life is a beautiful thing";
        utils.fromStringToArray(l1);

//12
        itemNum();

        testNum(1);
        String m = "Александр Сергеевич Пушкин";
        utils.fullNameToArray(m);

        testNum(2);
        String m1 = "Мария Сергеевна Засыпкина";
        utils.fullNameToArray(m1);

//13

        itemNum();

        testNum(1);
        String n = "abc";
        System.out.println(utils.sumOfLetters(n));

        testNum(2);
        String n1 = "ABC";
        System.out.println(utils.sumOfLetters(n1));

        testNum(3);
        String n2 = "123";
        System.out.println(utils.sumOfLetters(n2));

//14
        itemNum();

        testNum(1); //method(“a”, “m”) → true
        char o = 'a';
        char o1 = 'm';
        utils.letterGoesFirst(o, o1);

        testNum(2); // method(“m”, “l”) → false
        char o3 = 'm';
        char o4 = 'l';
        utils.letterGoesFirst(o, o1);

        partNum(2);
//15
//        itemNum(); //Test Data: “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
//        String p = "1, 2, 3, 4, 5";
//        System.out.println(Arrays.toString(utils.StringToNumbers(p)));





    }
}
