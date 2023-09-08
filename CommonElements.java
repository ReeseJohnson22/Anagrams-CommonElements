// Name:        Reese Johnson
// Class:       CS 4306/01
// Term:        Fall 2023
// Instructor:  Dr. Haddad
// Assignment:  1
// IDE Name:    IntelliJ

//**********************

/*
Algorithm Design Block

        Algorithm title: Find common elements in two sorted lists

        Logical steps:
        Step 1: Initialize two lists of ints and start sentinel loop
        Step 2: Get user input to fill the two lists
        Step 3: Use Bubble sort on both of the lists.
        Step 4: Iterate through the two lists with a while loop till either 'i' reaches the end of the first list or 'j' reaches the end of the second list
                If the number is put in the common list then push both lists forward one index, if i is the smaller number than index i up by 1, if j is smaller than i move j up by 1.
        Step 5: While iterating through have a counter to track the number of comparisons that are made.
        Step 6: print the original two lists and the common elements list, as well as the number of comparisons.

        Algorithm pseudocode syntax:

        Algorithm: Find and print the common values of two lists, common list Common
        Inputs: Two lists, List List1 and List List2 of integers
        Output: Common numbers between List1 and List2 also number of Comparisons made

      Begin
        Comparisons <-- 0;
        i <-- 0;
        j <-- 0;
        for(int i = List1.size()-1; i >0; i--){
                for(int j = 0; j < i; j++){
                        Comparisons++;
                        if(List1.get(j) > List1.get(j+1))
                              int temp = List1.get(j);
                              List1.set(j, List1.get(j+1));
                              List1.set(j+1, temp);
                        End if
               End j loop
       End i loop
       for(int i = List2.size()-1; i >0; i--){
                for(int j = 0; j < i; j++){
                        Comparisons++;
                        if(List2.get(j) > List2.get(j+1))
                              int temp <-- List2.get(j);
                              List1.set(j, List2.get(j+1));
                              List1.set(j+1, temp);
                        End if
               End j loop
       End i loop
        while i < List1.size()-1 && j < List2.size()-1 do
                if(List1.get(i) == List2.get(j)
                     Common.add(List1.get(i));
                     i++1;
                     j++1;
                else if (List1.get(i) > List2.get(j))
                     j++1;
                else
                     i++1;
        End while
        Print List1;
        Print List2;
        print Common;
        //using loops to print the lists.
        print comparisons;
      End;
*/
// Code Section

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElements {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int Comparisons = 0;
                int UserOption = 0;
                ArrayList<Integer> List1 = new ArrayList<Integer>();
                ArrayList<Integer> List2 = new ArrayList<Integer>();
                ArrayList<Integer> Common = new ArrayList<Integer>();
                //entering sentinel loop
                while (UserOption != 3) {
                        try {
                                System.out.println("-----------------MAIN MENU-------------- \n1. Read input lists (integer values)\n2. Run algorithm and display output\n3. Exit program\n\nEnter option number:");
                                UserOption = in.nextInt();
                                switch (UserOption) {
                                        case 1:
                                                List1.clear();
                                                String option = null;
                                                System.out.println("Please enter a number for the first list: ");
                                                try {
                                                        List1.add(in.nextInt());
                                                } catch (Exception e) {
                                                        System.out.println("Please only enter numbers");
                                                }
                                                in.nextLine();
                                                System.out.println("Would you like to enter another number");
                                                option = in.nextLine();
                                                while (!option.equalsIgnoreCase("no")) switch (option) {
                                                        case "yes":
                                                                System.out.println("Please enter a number for the first list: ");
                                                                try {
                                                                        List1.add(in.nextInt());
                                                                } catch (Exception e) {
                                                                        System.out.println("Please only enter numbers");
                                                                }
                                                                System.out.println("Would you like to enter another number");
                                                                in.nextLine();
                                                                option = in.nextLine();
                                                                break;
                                                        case "no":
                                                                break;
                                                        default:
                                                                System.out.println("Please enter a yes or a no only.");
                                                                option = in.nextLine();
                                                                break;
                                                }
                                                List2.clear();
                                                option = null;
                                                System.out.println("Please enter a number for the Second list: ");
                                                try {
                                                        List2.add(in.nextInt());
                                                } catch (Exception e) {
                                                        System.out.println("Please only enter numbers");
                                                }
                                                in.nextLine();
                                                System.out.println("Would you like to enter another number");
                                                option = in.nextLine();
                                                while (!option.equalsIgnoreCase("no")) switch (option) {
                                                        case "yes":
                                                                System.out.println("Please enter a number for the Second list: ");
                                                                try {
                                                                        List2.add(in.nextInt());
                                                                } catch (Exception e) {
                                                                        System.out.println("Please only enter numbers");
                                                                }
                                                                System.out.println("Would you like to enter another number");
                                                                in.nextLine();
                                                                option = in.nextLine();
                                                                break;
                                                        case "no":
                                                                break;
                                                        default:
                                                                System.out.println("Please enter a yes or a no only.");
                                                                option = in.nextLine();
                                                                break;
                                                }
                                                break;
                                        case 2:
                                                Comparisons = 0;
                                                Common.clear();
                                                if(List1.isEmpty() || List2.isEmpty()){
                                                        System.out.println("Please put values into both lists before trying to compare");
                                                        break;
                                                }
                                                //bubble sort for both of the lists
                                                for(int i = List1.size()-1; i >0; i--){
                                                        for(int j = 0; j < i; j++){
                                                                Comparisons++;
                                                                if(List1.get(j) > List1.get(j+1)){
                                                                        int temp = List1.get(j);
                                                                        List1.set(j, List1.get(j+1));
                                                                        List1.set(j+1, temp);
                                                                }
                                                        }
                                                }
                                                //bubble sort for both of the lists
                                                for(int i = List2.size()-1; i >0; i--){
                                                        for(int j = 0; j < i; j++){
                                                                Comparisons++;
                                                                if(List2.get(j) > List2.get(j+1)){
                                                                        int temp = List2.get(j);
                                                                        List2.set(j, List2.get(j+1));
                                                                        List2.set(j+1, temp);
                                                                }
                                                        }
                                                }
                                                int j = 0;
                                                int i = 0;
                                                while (i < List1.size() && j < List2.size()) {
                                                        if (List1.get(i) == List2.get(j)) {
                                                                Common.add(List1.get(i));
                                                                i++;
                                                                j++;
                                                        } else if (List1.get(i) > List2.get(j)) {
                                                                j++;
                                                        } else {
                                                                i++;
                                                        }
                                                        Comparisons++;
                                                }
                                                System.out.print("List 1:\t\t\t\t");
                                                for (Integer num : List1) {
                                                        System.out.print(num + " ");
                                                }
                                                System.out.print("\nList 2:\t\t\t\t");
                                                for (Integer num : List2) {
                                                        System.out.print(num + " ");
                                                }
                                                System.out.print("\nCommon values:\t\t");
                                                if (Common.isEmpty()) {
                                                        System.out.println("No common values");
                                                } else {
                                                        for (Integer num : Common) {
                                                                System.out.print(num + " ");
                                                        }
                                                }
                                                System.out.print("\nComparisons:\t\t" + Comparisons);
                                                System.out.println();
                                                break;
                                        case 3:
                                                break;
                                        default:
                                                System.out.println("Please enter 1, 2, or 3");
                                                break;
                                }
                        } catch (Exception e) {
                                System.out.println("Please enter a number");
                        }
                }
        }
}