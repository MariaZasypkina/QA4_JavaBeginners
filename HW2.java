public class HW2 {

        public static void main(String[] args) {

            int k = 25;
            int l = 7;
            int m = 3;

            System.out.println(k + "\n" + l + "\n" + m);
            System.out.println(k + " " + l + " " + m);
            System.out.println(k + ", " + l + ", " + m);
            System.out.println("int k = " + k);
            System.out.println("int l = " + l);
            System.out.println("int m = " + m);

            // Task 16

            System.out.println("Sum of k and l = " + (k+l));
            System.out.println("k * m = " + (k * m));
            System.out.println("Разность переменных l и m = " + (l - m));

            // Task 17

            System.out.println("Результат деления k на l =  " + (k/l) + ", а остаток от деления  = " + k%l);
            System.out.println("Результат деления l на m =  " + (l/m) + ", а остаток от деления  = " + l%m);
            System.out.println("Результат деления m на k =  " + (m/k) + ", а остаток от деления  = " + m%k);
            System.out.println("Результат деления k на m =  " + (k/m) + ", а остаток от деления  = " + k%m);
            System.out.println("Результат деления l на k =  " + (l/k) + ", а остаток от деления  = " + l%k);
            System.out.println("Результат деления m на l =  " + (m/l) + ", а остаток от деления  = " + m%l);

            // Task 18

            int apple = 40;
            int student = 6;

            System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                    + (apple / student) + " яблок(a), и " + (apple % student) + " яблок(а) останется учителю.");

            apple = 100;
            student = 21;

            System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                    + (apple / student) + " яблок(a), и " + (apple % student) + " яблок(а) останется учителю.");


            // Task 19
            // Распечатать вычисления и итоговый результат:
            //Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM = …

            System.out.print("Сумма чисел k, l, m++ и sumKLM-- = " + ((k+l+(m-1)) + ((k+l+m)-1)) +
                    " а разность m++ и  sumLKM = " + ((m+1) - (k+l+m)));

            // Task 20
            //Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.

            int x = 48;
            int y = 8;
            int z = 47;
            int s = 49;

            System.out.println(x%y);
            System.out.println(x%2);
            System.out.println(y%2);
            System.out.println(z%2);
            System.out.println(s%2);


        }
    }


