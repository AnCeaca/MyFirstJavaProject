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
        for (int i = first; i<=second; i++){
        }
    }
    //ex 4 (LAB 12)

    public void minMax(int x, int y){
        if(x<y){
            for(int i = x; i <= y; i++){
                System.out.println(i);
            }
        }else if(y<x){
            for(int i = y; i <= x; i++){
                System.out.println(i);
            }
        }else{
            System.out.println("Numbers are equal");
        }
    }
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

    //ex 1 (while)

    public void count (int x){
        int i = x;
        while (i <= 100){
            System.out.println(i);
            i++;
        }
    }
    //ex 2

    public void countBackwards(int x){
        int i = x;
        while (i >= -100){
            System.out.println(i);
            i--;
        }
    }
    //ex 3

    public void betweenNumbers(int x, int y){
        int i = x;
        while (i >= y){
            System.out.println(i);
            i--;
        }
    }
    //ex 4

    public void countBetweenWhile(int firstNumber, int secondNumber) {
        if(firstNumber < secondNumber){
            while (firstNumber <= secondNumber) {
                System.out.println(firstNumber);
                firstNumber++;
            }
        }
        else if(secondNumber < firstNumber){
            while (secondNumber <= firstNumber) {
                System.out.println(firstNumber);
                firstNumber++;
            }
        }
        else{
            System.out.println("The numbers are equal");
        }
    }
    //ex 5

    public void evenNumbersWhile() {
        int number = 1;
        while (number <= 100) {
            number++;
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
    //ex 6

    public void unevenNumbersWhile() {
        int number = 1;
        while (number <= 100) {
            number++;
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
    //ex 7

    public void sumAndAverageWhile() {
        int firstNumber = 111;
        int secondNumber = 8899;
        double sum = 0;
        int count = 0;
        while (firstNumber <= secondNumber) {
            sum += firstNumber;
            firstNumber++;
            count++;
        }
        System.out.println(sum);
        double average = sum / count;
        System.out.println("The average of the numbers is: " + average);
    }

    //ex 8

    public double averageNumbers(int first, int second){
        int i = first;
        int sum = 0;
        double counter = 0;
        while(i <= second){
            if(i % 7 == 0){
                sum = i + sum;
            }
            i++;
            counter++;
        }
        System.out.println(counter);
        return sum/counter;
    }
    //ex 9

    public void fibonacci() {
        int count = 20;
        int num1 = 0;
        int num2 = 1;
        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
    //ex 10

    public void wozaCozaLoza() {

        int i = 1;

        while (i <= 110) {

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {

                System.out.print("CozaLozaWoza ");

            } else if (i % 5 == 0 && i % 7 == 0) {

                System.out.print("WozaLoza ");

            } else if (i % 3 == 0 && i % 7 == 0) {

                System.out.print("CozaWoza ");

            } else if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("CozaLoza ");

            } else if (i % 7 == 0) {

                System.out.print("Woza ");

            } else if (i % 5 == 0) {

                System.out.print("Loza ");

            } else if (i % 3 == 0) {

                System.out.print("Coza ");

            } else {

                System.out.print(i + " ");

            }

            if (i % 11 == 0) {

                System.out.println();

            }

            i++;

        }

    }


    //ARRAY

    public void printArray(int[] array){
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i]+", ");
        }
    }

    public double sumOfArray(int[] array){
        float sumArray = array[0];
        for (int i = 1; i < array.length; i++){
            sumArray = sumArray + array[i];
        }
        return sumArray;
    }

    public double getAverageFromArray(int[] array) {
        return sumOfArray(array) / array.length;
    }


    //ex 2:

    public int[] populateArrayToNumber(int max){
        int[] myArray = new int[max];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
        }
        return myArray;
    }
    //ex 3:

    public void populateEvenNumbersArray (int[] array){
        int pos = 0;
        for (int i = 1; i <= array.length; i++){
            if (i%2==0){
                array[pos] = i;
                pos++;
            }
        }
    }
    //ex 4:

    public double populateAverageOfArray (double[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        double average = sum/array.length;
        System.out.println("The average is: " + average);
        return average;
    }
    //ex 5:

    public boolean findValueInArray(String[] array){
        String value = "Green";
            for (String i: array){
                if(value.equals(i)){
                    return true;
                }
            }
            return false;
    }
    //ex 6:

   // public int checkNumberInArray (int[] array, int value){
   //     int value = 16;


   // }

    //ex 7:

    public void printPatternArray(int[] row) {
        for (int i = 1 ; i <= row.length; i++) {
            for (int j = 1; j <= row.length; j++) {
                System.out.println("-");
           }
            System.out.println();
        }
    }

    //ex 8:

    //ex 9:

    public int printSecondSmallest(int[] array){
        int smallest = array[0];
        int secondSmallest = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] != smallest && array[i] < smallest);
            secondSmallest = array[i];
        }
        return secondSmallest;
    }

    //ex 10:

    public int[] copyFromArray(int[] array){
        int[] newArray = new int[5];
        for(int i = 0; i<array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    //Array optional

    //ex1

    public int insertElement(int[] array){
        int pos = 2;
        int value = 5;
        for(int i = array.length -1; i > pos; i--){
            array[i] = array[i-1];
        }
        array[pos] = value;
        return array[pos];
    }
    //ex2

    public int minMax (int[] array){
        int minValue = array[0];
        int maxValue = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] <minValue){
                minValue = array[i];
            }
            if (array[i] > maxValue){
                maxValue = array[i];
            }
        }
        System.out.println("Minimum value is: " + minValue + "Maximum value is: " + maxValue);
        return minValue + maxValue;
    }
    //ex 3 nu reusesc sa imi dau seama ce e gresit

    public int [] reverseArray (int[] array){
        int[] newArray = new int[4];
        for(int i = array.length-1; i >= 0; i--) {
            System.out.println(newArray [i] + " ");
        }
        return newArray;
    }
    //ex4

    public int[] findDuplicateInArray (int [] myArray){
        int[] duplicateArray = new int [6];
        for(int i = 0; i < myArray.length - 1; i++){
            for(int j = i + 1; j < myArray.length; j++){
                if( (myArray[i] == myArray[j] && i != j)){
                    System.out.println("Duplicated element is: " + myArray[j]);
                }
            }
        }
        return duplicateArray;
    }



















}