package ru.netology.services;

public class FreelancerService {

    public static int calculateFreelancerRestMonths(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money -= expenses;
                money /= 3;
            } else {
                money += income;
                money -= expenses; // обязательные месячные траты
            } if (month == 0){
                money = 0; // в первый месяц денег нет
            }

            // Вывод эмуляции планируемого поведения
            System.out.println("Месяц " + (month + 1) + ". Денег " + money + ". " + (money >= threshold ? "Буду отдыхать." : "Придётся работать."));
            if (money >= threshold) {
                System.out.println("Потратил -" + expenses + ", затем ещё -" + ((money - expenses) * 40 / 60));
            } else {
                System.out.println("Заработал +" + income + ", потратил -" + expenses);
            }
        }

        // Возвращаем количество месяцев отдыха
        return count;
    }
}