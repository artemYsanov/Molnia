package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите интервал времени между вспышкой: ");
        double time = in.nextDouble();
        double speed = 1234.8 ;
        System.out.println("Растояние до места удара молнии = " + (speed / 3.6)* time + " метра.");
    }
}
