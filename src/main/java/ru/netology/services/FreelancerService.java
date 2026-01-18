package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 1; month < 12; month++) {
            if (money >= threshold) {
                money = money - expenses;
                money = money / 3;
                count++;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }
}