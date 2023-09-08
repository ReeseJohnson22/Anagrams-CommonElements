// Name:        Reese Johnson
// Class:       CS 4306/01
// Term:        Fall 2023
// Instructor:  Dr. Haddad
// Assignment:  1
// IDE Name:    IntelliJ

//**********************

/*
Algorithm Design Block

        Algorithm title: Checking if two strings are anagrams

        Logical steps:
        Step 1: Start the sentinel loop to force the user into the choices
        Step 2: Get the user input, then force the characters to lowercase
        Step 3: Check if the strings are the same length, then convert the two strings to char arrays
        Step 4: Sort the two arrays using a bubble sort alg for both of them
        Step 5: After the arrays are sorted then use .equals method to compare the two arrays checking if all entries are same

        Algorithm pseudocode syntax:

        Algorithm: Compare two strings to see if they are anagrams using boolean checker
        Inputs: Two Strings, String String2 and String String1.
        Output: String String2, String String1, If they are or not anagrams, the number of comparisons

      Begin
        Comparisons <-- 0;
        String1 <-- String1.toLowerCase();
        String2 <-- String2.toLowerCase()
        if (String2.length() == String1.length())
            char[] charArrayString2 <-- String2.toCharArray();
            char[] charArrayString1 <-- String1.toCharArray();
            for(int i = charArrayString1.length-1; i >0; i--){
                for(int j = 0; j < i; j++){
                    Comparisons++;
                    if(charArrayString1[j] > charArrayString1[j+1]){
                        char temp = charArrayString1[j];
                        charArrayString1[j] <---  charArrayString1[j+1];
                        charArrayString1[j+1] <--- temp;
                    End if
                End j loop
           End i Loop
            for(int i = charArrayString2.length-1; i >0; i--){
                for(int j = 0; j < i; j++){
                    Comparisons++;
                    if(charArrayString2[j] > charArrayString2[j+1]){
                        char temp = charArrayString2[j];
                        charArrayString2[j] <---  charArrayString2[j+1];
                        charArrayString2[j+1] <--- temp;
                    End if
                End j loop
           End i Loop
            checker <-- Arrays.equals(charArrayM, charArrayN);
             if(checker)
                Print String1;
                Print String2;
                Print the two are anagrams;
                Print comparisons;
                  else
                   Print String1;
                   Print String2;
                   Print the two are not anagrams;
                   Print comparisons;
             End if
                else
                Print String1;
                Print String2;
                Print the two are not anagrams;
                Print comparisons;
        End if
      End;
*/
// Code Section

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int userInput = 0;
        String String1 = "";
        String String2 = "";
        int Comparisons = 0;
        //entering the sentinel loop
        while(userInput != 3){
            try{
                System.out.println("-----------------MAIN MENU--------------\n" + "1. Read input string1 and string2\n" + "2. Run algorithm and display output\n" + "3. Exit program\n" + "\nEnter option number:");
                userInput = in.nextInt();
                in.nextLine();
                switch (userInput) {
                    case 1:
                        try {
                            System.out.println("Please enter string1");
                            String1 = in.nextLine();
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                        }
                        try {
                            System.out.println("Please enter string2");
                            String2 = in.nextLine();
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                        }
                        break;
                    case 2:
                        Comparisons = 0;
                        String CompString1 = String1.toLowerCase();
                        String CompString2 = String2.toLowerCase();
                        CompString1 = CompString1.replaceAll("\\s","");
                        CompString2 = CompString2.replaceAll("\\s","");
                        if (CompString2.length() == CompString1.length()) {
                            Comparisons++;
                            char[] charArrayString1 = CompString1.toCharArray();
                            char[] charArrayString2 = CompString2.toCharArray();
                            //bubble sort for both of the arrays
                            for(int i = charArrayString1.length-1; i >0; i--){
                                for(int j = 0; j < i; j++){
                                    Comparisons++;
                                    if(charArrayString1[j] > charArrayString1[j+1]){
                                        char temp = charArrayString1[j];
                                        charArrayString1[j] =  charArrayString1[j+1];
                                        charArrayString1[j+1] = temp;
                                    }
                                }
                            }
                            //bubble sort for both of the arrays
                            for(int i = charArrayString2.length-1; i >0; i--){
                                for(int j = 0; j < i; j++){
                                    Comparisons++;
                                    if(charArrayString2[j] > charArrayString2[j+1]){
                                        char temp = charArrayString2[j];
                                        charArrayString2[j] =  charArrayString2[j+1];
                                        charArrayString2[j+1] = temp;
                                    }
                                }
                            }
                            Comparisons++;
                            boolean checker = Arrays.equals(charArrayString1, charArrayString2);
                            if (checker) {
                                Comparisons++;
                                System.out.println("String 1:\t\t\t" + String1);
                                System.out.println("String 2:\t\t\t" + String2);
                                System.out.println("Output:\t\t\t\t" + "Strings are anagrams");
                                System.out.println("Comparisons:\t\t" + Comparisons);
                            } else {
                                Comparisons++;
                                System.out.println("String 1:\t\t\t" + String1);
                                System.out.println("String 2:\t\t\t" + String2);
                                System.out.println("Output:\t\t\t\t" + "Strings are not anagrams");
                                System.out.println("Comparisons:\t\t" + Comparisons);
                            }
                        } else {
                            Comparisons++;
                            System.out.println("String 1:\t\t\t" + String1);
                            System.out.println("String 2:\t\t\t" + String2);
                            System.out.println("Output:\t\t\t\t" + "Strings are not anagrams");
                            System.out.println("Comparisons:\t\t" + Comparisons);
                        }
                        break;
                    case 3: break;
                    default:
                        System.out.println("Please enter 1, 2, or 3");
                        break;
                }
            } catch (Exception e){
                System.out.println("Please enter a number");
            }
        }
    }
}
