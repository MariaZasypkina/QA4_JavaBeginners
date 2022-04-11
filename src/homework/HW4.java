package homework;
public class HW4 {
    public static int number = 1;

    public static void partNum() {
        System.out.println("--------------------");
        System.out.println("Part " + number);
        System.out.println("--------------------");
        number++;
    }

    public static int number1 = 1;

    public static void itemNum() {
        System.out.print(number1 + ") -----> ");
        number1++;
    }

    public static int number2 = 1;

    public static void taskNum() {
        System.out.println("\nTask " + number2 + "\n");
        number2++;
    }

    public static void main(String[] args) {
        partNum();
        taskNum();
        itemNum();
        boolean a1 = (2 == 2) && (7 == 7);
        System.out.println(a1);
        itemNum();
        boolean a2 = !(15 < 3);
        System.out.println(a2);
        itemNum();
        boolean a3 = ("Сосна" == "Дуб") || ("Вишня" == "Клён");
        System.out.println(a3);
        itemNum();
        boolean a4 = !("Сосна" == "Дуб");
        System.out.println(a4);
        itemNum();
        boolean a5 = !((15 < 3) && (10 > 20));
        System.out.println(a5);
        itemNum();
        String a6_1 = "Глаза даны, чтобы видеть";
        String a6_2 = "Под третьим этажом находится второй этаж";
        System.out.println(a6_1.equals(a6_2));
        itemNum();
        boolean a7 = (6 / 2 == 3) || (7 * 5 == 20);
        System.out.println(a7);
        taskNum();
        number1 = 1;
        itemNum();
        String b1 = "В минуте 70 секунд";
        String b2 = "Работающие часы показывают время";
        String reality1 = "В минуте 60 секунд";
        String reality2 = "Работающие часы показывают время";
        if (reality1.equals(b1) || reality2.equals(b2)) {
            System.out.println("Wow!");
        }
        itemNum();
        System.out.println(!(28 > 7) && !(300 / 5 == 60));
        itemNum();
        String b3_1 = "Телевизор - электрический прибор";
        String b3_2 = "Стекло - дерево";
        String reality_b3_1 = "Телевизор - электрический прибор";
        String reality_b3_2 = "Стекло - это не дерево";
        if (b3_1.equals(reality_b3_1) && b3_2.equals(reality_b3_2)) {
            System.out.println("Yay!");
        } else {
            System.out.println("Liar!!!");
        }
        itemNum();
        if (!(300 < 100)) {
            System.out.println("Жажду можно утолить водой");
        }
        itemNum();
        if (75 < 81) {
            System.out.println("88 = 88");
        }
        taskNum();
        number1 = 1;
        itemNum();
        int ageAndrey = 45;
        int ageSveta = 42;
        int ageNatasha = 47;
        if ((ageAndrey > ageSveta) && (ageNatasha > ageSveta)) {
            System.out.println("Андрей старше Светы. Наташа старше Светы.");
        } else {
            System.out.println("Что-то пошло не так!");
        }
        itemNum();

        String location1 = "На полке";
        String location2 = "на столе";
        String c1 = "стоят учебники";
        String c2 = "лежат справочники";
        if ((location1 == "На полке") && (c1 == "стоят учебники") && (location2 == "на столе") && (c2 == "лежат справочники")) {
            System.out.println(location1 + " " + c1 + ", а на " + location2 + " " + c2);
        } else {
            System.out.println("Это какой-то беспорядок!");
        }
        itemNum();
        int girs = 23;
        int boys = 15;
        if (girs > boys) {
            System.out.println("БОльшая часть детей — девочки. Остальные - мальчики.");
        } else {
            System.out.println("Проверьте числа!");
        }
        itemNum();
        int ageForDriving = 15;
        if (ageForDriving < 16) {
            System.out.println("Водительские права можно получить, только когда исполнится 16 лет");
        } else {
            System.out.println("Можно сдать экзамен!");
        }
        itemNum();
        boolean bus = true;
        boolean book = true;
        boolean window = true;
        boolean Petya = !bus && (book || !window);
        System.out.println(Petya);
        itemNum();
        String friend = "друг";
        if ("друг".equals(friend)) {
            System.out.println("Если с другом ты, это хорошо, а когда наоборот - плохо");
        } else {
            System.out.println("Find a friend!");
        }
        itemNum();
        int age1 = 19;
        if (age1 > 18) {
            System.out.println("Ты взрослый");
        } else {
            System.out.println("Ты ребенок");
        }
        itemNum();
        boolean soilIsDry = true;
        if (soilIsDry == true) {
            System.out.println("There is no rain");
        } else {
            System.out.println("It's raining");
        }
        itemNum();
        boolean soilIsWet = true;
        if (soilIsDry == true) {
            System.out.println("There is no rain");
        }
        if (soilIsWet) {
            System.out.println("   -----> It's raining");
        }
        if ((soilIsDry != true) && (soilIsWet != true)) {
            System.out.println("-----> It's snowing");
        }
        itemNum();
        boolean clouds = true;
        if (clouds == true) {
            System.out.println("Идет дождь");
        } else {
            System.out.println("Идет слепой дождь");
        }
        itemNum();

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday"};
        String dayToday = "Saturday";
        String tomorrow;
        String yesterday;
        int dayNumber = -1;
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (daysOfWeek[i].equals(dayToday)) {
                dayNumber = i;
                break;
            }
        }
        if (dayNumber == 6) {
            tomorrow = daysOfWeek[0];
        } else {
            tomorrow = daysOfWeek[dayNumber + 1];
        }
        if (dayNumber == 0) {
            yesterday = daysOfWeek[daysOfWeek.length];
        } else {
            yesterday = daysOfWeek[dayNumber - 1];
        }

        System.out.print(tomorrow + "\t");
        System.out.println(yesterday);
        itemNum();
        boolean clawfish = true;
        if (clawfish == true) {
            System.out.println("Eternity passed");
        } else {
            System.out.println("Wait");
        }
        itemNum();
        int age = 20;
        boolean school = false;
        if ((age > 18) && school) {
            System.out.println("You can't live with parents any longer");
        } else {
            System.out.println("Live with your parents");
        }
        partNum();
        number2 = 1;
        taskNum();
        number1 = 1;
        itemNum();
        int c = 14;
//        int result;
        if (c % 2 == 0) {
            c = c * 2;
        } else {
            c = (int) Math.pow(c, 2);
        }
        System.out.println(c);
        taskNum();
        number1 = 1;
        itemNum();
        int yearsOld = 17;
        String result = "";
        String vote1 = "You can vote";
        String vote2 = "You're too young to vote";
        String drive1 = "You can drive";
        String drive2 = "You're too young to drive";
        String school1 = "You can go to school";
        String school2 = "Wait a little for a school!";

        if (yearsOld > 18) {
            result = vote1;
        } else {
            result = vote2;
        }
        System.out.println(result);

        itemNum();
        if (yearsOld > 16) {
            result = drive1;
        } else {
            result = drive2;
        }
        System.out.println(result);

        itemNum();
        if (yearsOld > 5) {
            result = school1;
        } else {
            result = school2;
        }
        System.out.println(result);

        taskNum();
        number1 = 1;
        int grade = 4;
        String yearResult = "";
        if (grade > 4) {
            yearResult = "выдать похвальную грамоту и перевести в следующий класс";
        }
        if (grade == 4) {
            yearResult = "перевести в следующий класс";
        }
        if (grade == 3) {
            yearResult = "дать задание на лето и перевести в следующий класс";
        }
        if (grade == 2) {
            yearResult = "вызвать родителей и оставить в текущем классе на второй год";
        }
        System.out.println(yearResult);

        taskNum();
        int w = 143;
        int z = 11;
        int sum1= 0;
        int sum2 = 0;
        if (w % 3 == 0){
            sum1 = w;
        }
        if(z % 3 == 0) {
            sum2 = z;
        }
        int result1 = sum1 + sum2;
        System.out.println(result1);

        int dif1 = 0;
        int dif2 = 0;
        if (w % 5 == 0){
            dif1 = w;
        }
        if(z % 5 == 0) {
            dif2 = z;
        }
        int result2 = dif1 - dif2;
        System.out.println(result2);

        int mult1 = 1;
        int mult2 = 1;
        int result3 = 0;
        if(w % 2 ==0) {
            mult1 = w;
        }
        if (z % 2 == 0) {
            mult2 = z;
        }
        if ((mult1 >= 0) && (mult2 >= 0)) {
            result3 = mult1 * mult2;
        } else {
            result3 = mult1 * mult2 * (-1);
        }
        System.out.println(result3);
        if ((w % 3 != 0) && (z % 3 != 0) && (w % 5 != 0) && (z % 5 != 0) && (w % 2 !=0) && (z % 2 != 0)) {
            System.out.println("Impossible to calculate");
        }
partNum();


    }
}

