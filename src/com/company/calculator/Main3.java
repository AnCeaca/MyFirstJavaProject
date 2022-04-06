package com.company.calculator;

public class Main3 {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        LogicalOperations op = new LogicalOperations();

        int checkBiggest = op.checkBiggerNumber(78, 56);
        System.out.println("The bigger number is " + checkBiggest);

    }


}
