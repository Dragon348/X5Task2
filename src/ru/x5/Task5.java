package ru.x5;
/*Ввести три целых числа с консоли. Вывести на
экран наименьшее из них.*/
public class Task5 {
    public int min(int a, int b){
        if (a < b) return a;
        return b;
    }
    public void printMinOfThree(int a, int b, int c){
        System.out.println(min(min(a,b),c));
    }
    public void solveTask(Reader reader){
        System.out.println("Введите три целых числа. Каждое число с новой строки: ");
        printMinOfThree(reader.readInt(), reader.readInt(), reader.readInt());
    }
}
