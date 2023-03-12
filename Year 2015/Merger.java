/**
 * A class Merger concatenates two positive integers that are greater than 0 and produces a newly merged integer. [10]
 * Example: If the first number is 23 and the second is 764, then the concatenated number will be 23764.
 * Some of the members of the class are given below:
 * Class name: Merger
 * Data members/instance variables:
 * n1: long integer to store the first number
 * n2: long integer to store the second number
 * mergNum: long integer to store the merged number
 * Member functions:
 * Merger(): constructor to initialize the data members
 * void readNum(): to accept the values of the data members n1 and n2
 * voidjoinNum(): to concatenate the numbers n1 and n2 and store it in
 * mergNum
 * void show(): to display the original numbers and the merged number with appropriate messages
 * Specify the class Merger giving the details of the constructor, void readNum(), void joinNum() and void show().
 * Define the main() function to create an object and call the functions accordingly to enable the task.
 */

import java.util.Scanner;
class Merger{
    long n1, n2, mergNum;
    Merger(){
        n1 = 0;
        n2 = 0;
        mergNum = 0;
    }
    void readNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N1 and N2");
        n1 = sc.nextLong();
        n2 = sc.nextLong();
    }

    void joinNum(){
        mergNum = Long.parseLong(String.valueOf(n1).concat(String.valueOf(n2)));
    }
    void show(){
        System.out.println("N1: "+n1 + "\nN2: "+n2 + "\nMerged Number: "+mergNum);
    }
    public static void main(String[] args) {
        Merger ob = new Merger();
        ob.readNum();
        ob.joinNum();
        ob.show();
    }
}