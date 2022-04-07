package com.company.calculator;

public class Main3 {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        LogicalOperations op = new LogicalOperations();

        System.out.println(calc.divide(21,3));
        System.out.println(calc.modulus(7,9));
        System.out.println(calc.multiply(25,6));
        System.out.println(calc.sum(7,9));
        System.out.println(calc.substract(10,3));


        int checkBiggest = op.checkBiggerNumber(78, 56);
        System.out.println("The bigger number is " + checkBiggest);

        System.out.println(op.getMax(45,13));

        System.out.println(op.verifyTextFastTrack("FastTrack"));

        System.out.println(op.verifyTextAndNumber("FastTrack", 5));

        System.out.println(op.snow(9));

        System.out.println(op.greater(5));

        System.out.println(op.biggerNumber(9,5,10));


    }


}
