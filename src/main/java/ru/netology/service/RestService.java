package ru.netology.service;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {

            int counter = 0; // счётчик месяцев отдыха
            int money = 0; // количество денег на счету
            for (int month = 0; month < 12; month++) {
                if ( money >= threshold) { // буду отдыхать
                    counter++; // увеличиваем счётчик месяцев отдыха
                    money = (money - expenses) / 3;
                } else {
                    money = money + income - expenses;
                }
            }
            return counter;

    }
}
