package org.example;


public class Calc {
    public int summ(int a, int b){
        int result = a + b;
        System.out.println("Сумма " + a + " и " + b + " равно " + result);
        System.out.printf("Сумма %d и %d равно %d", a, b, result);
        return  result;
    }
}
