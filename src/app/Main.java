package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AdviceService adviceService = new AdviceServiceImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи день тижня (MONDAY..SUNDAY):");
        String input = scanner.nextLine();

        try {
            Day day = Day.valueOf(input.trim().toUpperCase());
            adviceService.advise(day);
        } catch (IllegalArgumentException e) {
            System.out.println("Некоректне значення. Дозволено: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.");
        }
    }
}
