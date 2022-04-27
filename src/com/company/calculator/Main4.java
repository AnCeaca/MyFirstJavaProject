package com.company.calculator;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        LogicalOperations logicalOperations = new LogicalOperations();

        List<Integer> integerList = logicalOperations.getListToNumber(100);

        //ex1
     //  logicalOperations.printList(integerList);
        //ex2
     //   integerList.add(101, 122);
        //ex3
     //   logicalOperations.printListFromNumber(integerList, 80);
        //ex4
     //   logicalOperations.printReverseList(integerList);

        //ex8
        List<Integer> myList = new ArrayList<>();
        myList.add(20);
        myList.add(13);
        myList.add(95);
        logicalOperations.printBiggestNumberInList(myList);


















    }
}
