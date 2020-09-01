package ru.x5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    private final BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    public int readInt(){
        while (true)
            try {
                return Integer.parseInt(reader.readLine());
            }
            catch (IOException e) {
                System.out.println("Ошибка чтения:" + e);
            }
            catch (NumberFormatException e){
                System.out.println("Ошибка преобразования строки в число. Введено не число:" + e);
            }
    }
    public String readString(){
        try {
            return reader.readLine();
        }
        catch (IOException e) {
            System.out.println("Ошибка чтения:" + e);
        }
        return null;
    }
}
