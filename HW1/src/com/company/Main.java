package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("12n66n21"));
        System.out.println(isPalindrome("1232"));

    }

    //Question 1: Write a program find if String is Palindrome?
    public static boolean isPalindrome (String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }

    //Question2: Write a program to check if a string has all unique characters.
    //
    //Question 3. Write a program to check if string contains duplicates
    //
    //Question 4: Write a program to check if two strings are anagrams. Anagrams are strings which can be made by rearranging characters in string.
    //
    //Question 5:  Write a program to determine whether the year is a leap year or not.
    //
    //Leap Years are any year that can be evenly divided by 4.  A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.
    //
    //Question 6: Write a program to calculate the monthly telephone bills as per the following rule: Minimum $ 200 for up to 100 calls.
    //Plus $ 0.60 per call for next 50 calls.
    //Plus $ 0.50 per call for next 50 calls.
    //Plus $ 0.40 per call for any call beyond 200 calls.
    //
    //Use Switch Statement in the function.
    //
    //Question 7: Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
    //
    //Each letter in magazine can only be used once in ransomNote.
    //
    //Question 8 : Write a program that prompts the user’s grade. Your program should display the corresponding meaning of grade as per the following table
    //
    //Grade
    //
    //Meaning
    //
    //A
    //
    //Excellent
    //
    //B
    //
    //Good
    //
    //C
    //
    //Average
    //
    //D
    //
    //Deficient
    //
    //F
    //
    //Failing
    //
    //
    //
    //Question 9: Write a program to create a book class. The Book class would have following private variables
    //
    //String name;
    //
    //int bookID;
    //
    //String genres;
    //
    //double price;
    //
    //Create a constructor to initialize the values. Create getters and setters for variables.
    //
    //Question 10: Implement a class Box class Box {
    //
    //  double width;
    //
    //  double height;
    //
    //  double depth;
    //
    //}
    //
    //Initialize the value through constructor. Write a function to calculate the box volume.
}
