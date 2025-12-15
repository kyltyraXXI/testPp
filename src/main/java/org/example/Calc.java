package org.example;


public class Calc {
    public int sum(int a, int b){
        int result = a + b;
        System.out.println("Сумма " + a + " и " + b + " равно " + result);
        System.out.printf("Сумма %d и %d равно %d\n", a, b, result);
        return  result;
    }

    public int sub(int a, int b) {
        int result = a - b;
        System.out.printf("Разница %d и %d равно %d\n", a, b, result);
        return result;
    }
}
