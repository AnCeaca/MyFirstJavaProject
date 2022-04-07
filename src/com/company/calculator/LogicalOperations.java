package com.company.calculator;

public class LogicalOperations {

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

    public  String verifyTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public  String verifyTextAndNumber(String text, int number){
        if (text.equals("FastTrack") && number <= 3) {
            return  text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return ".";
        }
    }

    public String snow(int number){
        if (number > 8 || number ==6){
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm) " + number;
        }
    }

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
    // ex 9
    //ex 10

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
}



