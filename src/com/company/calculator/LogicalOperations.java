package com.company.calculator;

public class LogicalOperations {

    //ex 3

    public int checkBiggerNumber(int first, int second){
        if(first > second){
            return first;
        } else {
            return second;
        }
    }

    public  int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    //ex 4

    public  String verifyTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    //ex 5

    public  String verifyTextAndNumber(String text, int number){
        if (text.equals("FastTrack") && number <= 3) {
            return  text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return ".";
        }
    }

    //ex 6

    public String snow(int number){
        if (number > 8 || number ==6){
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm) " + number;
        }
    }

    //ex 7

    public String greater (int number){
        if (number>3 && !(number ==4)){
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4){
            return "The number is equal to 4";
        }else if (number <3){
            return "The number is lower than 3";
        }else {
            return "Nothing";
        }
    }

    // ex 8

    public void printNumber (int number){
        switch (number) {

            case 0:

                System.out.println("The number os 0");

                break;

            case 1:

                System.out.println("The number is 1");

                break;

            case 2:

                System.out.println("The number is 2");

                break;

            case 3:

                System.out.println("The number is 3");

                break;

            case 4:

                System.out.println("The number is 4");

                break;

            case 5:

                System.out.println("The number is 5");

                break;

            case 6:

                System.out.println("The number is 6");

                break;

            case 7:

                System.out.println("The number is 7");

                break;

            case 8:

                System.out.println("The number is 8");

                break;

            case 9:

                System.out.println("The number is 9");

                break;

            default:

                System.out.println("Not allowed");

        }
    }

    // ex 9

    public boolean isNumberEven (int number){
        if (number %2 == 0){
            return true;
        }else {
            return false;
        }
    }

    //ex 10

    public boolean isEligibleToVote (int number){
        if (number >= 18){
            return true;
        }else {
            return false;
        }
    }
    //ex 11 (LAB 11)

    public int biggerNumber (int first, int second, int third){
        if (first > second){
            return first;
        } else if (first > third){
            return first;
        }else if (second > third){
            return second;
        }else if (second > first){
            return second;
        }else if (third > first){
            return third;
        }else {
            return third;
        }
    }





    //ex 1 (LAB 12)

    public void countTo (int x){
        for (int i = x; i <=100; i++){
            System.out.println(i);
        }
    }
    // ex 2 (LAB 12)

    public void countBack (int x){
        for (int i = x; i>=-100; i--){
            System.out.println(i);
        }
    }
    //ex 3 (LAB 12)

    public void countTwo (int first, int second){
        for (int i = first; i>=second; i--){
            System.out.println(i);
        }
    }
    //ex 4 (LAB 12)

   /* public void minMax(int x, int y){
        for (int i = x; i>=y; i++){
            System.out.println(i);
        }for (int i = y; i>= x; i++){
            System.out.println(i);
        }
    }

    */


    //ex 5 (LAB 12)

    public void evenNumbers (int x){
        for (int i = 1; i<=x; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
    //ex 6 (LAB 12)

    public void oddNumbers (int x){
        for (int i = 1; i<=x; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
    //ex 7 (LAB 12)

    public void printSum(int x, int y){
        int sum = 0;
        for(int i = x; i <= y; i++){
            sum = i + sum;
        }
        System.out.println(sum);
    }
    //ex 8 (LAB 12)

    public void printSumAndAverage(int x, int y){
        int sum = 0;
        for(int i = x; i <= y; i++){
            sum = i + sum;
        }
        System.out.println(sum/(y-x+1f));
    }
    //ex 9 (LAB 12)

    public void pattern(int x, int y){
        for(int i = 7; i >= 1; i--) {
            for(int j=1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }




}



