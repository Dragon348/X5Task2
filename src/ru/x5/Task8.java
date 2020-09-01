package ru.x5;
/*
Дан массив целых чисел:
[1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного
массива найти и вывести на экран:
- максимальное значение
- сумму положительных элементов
- сумму четных отрицательных элементов
- количество положительных элементов
- среднее арифметическое отрицательных элементов
 */
public class Task8 {
    private int[] arr = new int[]{1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
    public int getMax(){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    public int positiveSum(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) sum += arr[i];
        }
        return sum;
    }
    public int negativeEvenSum(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < 0) && (arr[i] % 2 == 0)) sum += arr[i];
        }
        return sum;
    }
    public int positiveCount(){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) count++;
        }
        return count;
    }
    public float negativeAverage(){
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
                sum += arr[i];
            }
        }
        return (float) sum / count;
    }

    public void solveTask(){
        System.out.println("Максимальное значение: " + getMax());
        System.out.println("Сумма положительных элементов: " + positiveSum());
        System.out.println("Сумма четных отрицательных элементов: " + negativeEvenSum());
        System.out.println("Количество положительных элементов: " + positiveCount());
        System.out.println("Среднее арифметическое отрицательных элементов: " + negativeAverage());
    }
}
