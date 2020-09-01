package ru.x5;
/*
Ввести целое трехзначное число в консоли и найти
        сумму цифр этого трехзначного числа
        */
public class Task2 {
    public void printSumOfDigits(int number){
        int sum = 0;
        for (int i = 0; i < Integer.toString(number).length(); i++) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма всех цифр числа: " + sum);
    }
    public void solveTask(Reader reader){
        System.out.print("Введите целое трёхзначное число:");
        printSumOfDigits(reader.readInt());
    }
}
