package com.john.encapsulation;

public class RunCalculator {
    public static void main(String[] args){



        int num1 = 5;
        int num2 = 3;
        Calculator calculator1 = new Calculator(num1,num2);
        calculator1.setSum(num1,num2);
        int sum = calculator1.getSum();
        System.out.println(num1 + "+" + num2 + "=" + sum);

    }

}
