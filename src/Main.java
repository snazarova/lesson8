public class Main {
    public static void main(String[] args) {
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + "сумма накоплений равна " + total);
        }
        }
        }