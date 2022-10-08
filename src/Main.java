public class Main {
    public static void main(String[] args) {
        // задание 1  task1


        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + "сумма накоплений равна " + total);
        }
        // task2


        int p = 0;
        while (p < 10) {
            p = p + 1;
            System.out.print(p + " ");
        }
        System.out.println();
        for (int l = 10; l >= 1; l--) {
            System.out.print(l + " ");
        }
        System.out.println();
        // task 3

        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int mortality = 8 * population / 1000;
        for (int y = 1; y <= 10; y++) {
            population = population + birthRate;
            population = population - mortality;
            System.out.println("год " + y + " численность населения составляет " + population);
        }

        // задание 2 task1

        int savings = 15000;
        int month = 1;
        while (savings <= 12000000) {
            savings *= 1.07;
            month = month + 1;
            System.out.println("месяц " + month + " сумма накоплений " + savings);
        }


      // task2

         int savings1 = 15000;
        int month1 = 1;
        while (savings1 <= 12000000) {
            savings1 *= 1.07;
            month1 = month1 + 1;
            if (month1 % 6 == 0) {
                System.out.println("месяц " + month1 + " сумма накоплений " + savings1);
            }


            // task3

            int sum = 15000;
           int total1 = 0;
            for (i = 1; i <= 9*12; i = i+6){
                total1 = total1 + sum;
                total1 *= 1.07;
                System.out.println("месяц " + i + " сумма накоплений " + total1);
            }

            //task4

            int friday = 2;
            for (int nextFriday = friday; nextFriday <= 31; nextFriday = nextFriday +7){
                System.out.println("сегодня пятница " + nextFriday + " ое число, необходимо подготовить отчет");
            }

            // задание 3 task1

            int year = 2022;
            int firstYear = year - 200;
            int lastYear = year + 100;
            for ( int r = firstYear; r < lastYear; ++r ){
                if ( r % 79 == 0){
                    System.out.println(r);
                }

                // task2

                for (int n = 1; n <=10; n++){
                    System.out.println("2*" + n + " = " + 2 * n);
                }
            }
        }
    }
}