package ru.x5;

import java.util.Scanner;

public class Reader {
    private final Scanner reader = new Scanner(System.in);
    public int readInt(){
        return reader.nextInt();

    }
    public String readString(){
        return reader.next();
    }
}
