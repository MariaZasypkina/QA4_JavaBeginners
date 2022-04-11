package HW5;
public class HW5_Methods {
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

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "   -----> PASSED" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "   -----> FAILED" + "\u001B[0m");
        }
    }

    public static void verifyEqualsString(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "   -----> PASSED" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "   -----> FAILED" + "\u001B[0m");
        }
    }

    public static void weekDay(int a1) {
        /* Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели. */
        String[] a = {"Sunday", "Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday"};
        String dayofweek = a[a1 - 1];
        System.out.println(dayofweek);
    }

    public static String curConv(double a2) {
        /* Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.*/
        int rub = (int) a2;
        double kop = (a2 - (double) rub) * 100;
        String rubKop = (int) a2 + " руб. " + (int) kop + " коп.";
        return rubKop;
    }

    public static String kgAndGr(double a3) {
        /* Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.*/
        int kg = (int) a3;
        double gr = (a3 - (double) kg) * 100;
        String kgGr = (int) a3 + " кг " + (int) gr + " гр";
        return kgGr;
    }

    public static double sumOfPur(double price, int quantity) {
    /*Написать метод, который принимает на вход 2 параметра -  цену и количество товара (может быть вес товара,
или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.*/
        double sum1 = price * (double) quantity;
        return sum1;
    }

    public static void getReciept(String product, double pricePerKg, double quant) {

/*Яблоки
Цена за 1 кг			50 руб 13 коп
Количество товара	         3 кг 400 гр
_______________________________________
Сумма к оплате		170 руб 44 коп */

        String aa = "--------------------------------------------------";
        double sumToPay = pricePerKg * quant;
        int pricePerKg1 = (int) pricePerKg;
        double pricePerKg2 = (pricePerKg - (double) pricePerKg1) * 100;
        int quant1 = (int) quant;
        double quant2 = Math.ceil((quant - (double) quant1) * 1000);
        int sumToPay1 = (int) sumToPay;
        double sumToPay2 = (sumToPay - (double) sumToPay1) * 100;
        System.out.println();
        System.out.println(aa);
        System.out.println(product);
        System.out.println("Price per kg" + "\t\t\t" + pricePerKg1 + "\tRub\t" + (int) pricePerKg2 + "\tkop");
        System.out.println("Quantity of product" + "\t\t" + quant1 + "\tkg\t" + (int) quant2 + "\tgr");
        System.out.println(aa);
        System.out.println("TOTAL" + "\t\t\t\t\t" + sumToPay1 + "\tRub\t" + (int) sumToPay2 + "\tkop");
    }

    /* Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы, и
возвращает заработную плату в месяц. */

    public static double salary(int hourPerDay, double salaryPerHour) {
        double monthlySalary = hourPerDay * salaryPerHour * 21;
        return monthlySalary;
    }

    /*Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты сотрудникам.
Например:

Смирнова Мария Ивановна 		70000 руб 00 коп

Распечатать ведомость для нескольких сотрудников, например:

Март 2022
Смирнова Мария Ивановна 		70000 руб 00 коп
Серебряков Иван Петрович 		128059 руб 00 коп */

    public static void salaryList(String name, int hrsPerDay, double salPerHour, String month_year) {
        System.out.println();
        System.out.println(month_year + "\t");
        int daysPerMonth = 0;
        if ((month_year == "Feb 22") || (month_year == "Apr 22") || (month_year == "Jun 22") || (month_year == "Sept 22") ||
                (month_year == "Nov 22")) {
            daysPerMonth = 21;
        } else {
            daysPerMonth = 22;
        }
        double monthSalary = hrsPerDay * salPerHour * daysPerMonth;
        int monthSalary1 = (int) monthSalary;
        int monthSalary2 = (int) (double) ((monthSalary - monthSalary1) * 100);
        System.out.println(name + "\t\t\t" + monthSalary1 + "\tUSD\t\t" + monthSalary2 + "\t cents");
    }

    public static void aroundZero(int x) {
        if (x < 0) {
            System.out.println("x is negative");
        } else {
            if (x > 0) {
                System.out.println("x is positive");
            } else {
                System.out.println("x is zero");
            }
        }
    }

    /*Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое число
    рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
    Например:
    год рождения 1999
    1 + 9 + 9 + 9 = 28    2 + 8 = 10    1 + 0 = 1   Счастливое число - 1  */
    public static int luckyNumber(int year) {
        int luckyNum1 = 0;
        int luckyNum2 = 0;
        int luckyNum3 = 0;
        int luckyNum = 0;
        String[] nums = Integer.toString(year).split("");
        for (int i = 0; i < nums.length; i++) {
            luckyNum1 += Integer.parseInt(nums[i]);
        }
        if (luckyNum1 < 9) {
            luckyNum = luckyNum1;
        } else {
            String[] nums1 = Integer.toString(luckyNum1).split("");
            for (int i = 0; i < nums1.length; i++) {
                luckyNum2 += Integer.parseInt(nums1[i]);
            }
        }
        if (luckyNum2 < 9) {
            luckyNum = luckyNum2;
        } else {
            String[] nums2 = Integer.toString(luckyNum2).split("");
            for (int i = 0; i < nums2.length; i++) {
                luckyNum3 += Integer.parseInt(nums2[i]);
                luckyNum = luckyNum3;
            }
        }
        return luckyNum;
    }

    public static void median(int aa, int bb, int cc) {
        /*а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать*/
        int min = 0;
        int max = 0;
        int med = 0;
        int av = (aa + bb + cc) / 3;
        if ((aa > bb) && (aa > cc)) {
            max = aa;
        } else {
            if (bb > cc) {
                max = bb;
            } else {
                max = cc;
            }
        }
        if ((aa < bb) && (aa < cc)) {
            min = aa;
        } else {
            if (bb < cc) {
                min = bb;
            } else {
                min = cc;
            }
        }
        if ((aa != min) && (aa != max)) {
            med = aa;
        } else {
            if ((bb != min) && (bb != max)) {
                med = bb;
            } else {
                med = cc;
            }
        }
        if ((av - med) > 2) {
            System.out.println("Среднее значение " + av + " отличается от медианы " + med + " на " + ((av - med)));
        } else {
            System.out.println("Среднее значение =  " + av + " , медиана = " + med);
        }
    }

    public static void medianB(int aa, int bb, int cc) {
        int med = 0;
        int min = Math.min(aa, Math.min(cc, bb));
        int max = Math.max(aa, Math.max(cc, bb));
        if ((aa != min) && (aa != max)) {
            med = aa;
        } else {
            if ((bb != min) && (bb != max)) {
                med = bb;
            } else {
                med = cc;
            }
        }
        int av = (min + med + max) / 3;
        if ((av - med) > 2) {
            System.out.println("Среднее значение " + av + " отличается от медианы " + med + " на " + ((av - med)));
        } else {
            System.out.println("Среднее значение =  " + av + " , медиана = " + med);
        }
    }

    public static void finalPay(double a) {
        double finalPay = Math.floor(a);
        System.out.println((int) finalPay + " Rub 00 kop");
    }

    public static void exponent(int exponent) {
        if ((exponent <= 0) || (exponent > 10)) {
            System.out.println("Wrong exponent");
        } else {
            System.out.println(Math.round(Math.pow(Math.random()*10, exponent)));
        }
    }
public static void random(){
    System.out.println((int)Math.ceil(Math.random()*100));
}
public static void isLeapYear(int year){
    boolean isLeapYear = (year % 4 == 0);
    System.out.println(isLeapYear);
}
}



