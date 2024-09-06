package ru.netology.services;

public class FreelancerService {

    public static int calculateFreelancerRestMonths(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            System.out.print("Месяц " + (month + 1) + ". Денег " + money + ". " + (money >= threshold ? "Буду отдыхать." : "Придётся работать."));
            if (money >= threshold) {
                count++;
                money -= expenses; // обязательные месячные траты
                money /= 3; // траты на отдых
                System.out.println("Потратил -" + expenses + ", затем ещё -" + (money * 3 * 2 / 3));
            } else {
                money += income;
                money -= expenses; // обязательные месячные траты
                System.out.println("Заработал +" + income + ", потратил -" + expenses);
            }
        }
        System.out.println();
        // Возвращаем количество месяцев отдыха
        return count;
    }
}