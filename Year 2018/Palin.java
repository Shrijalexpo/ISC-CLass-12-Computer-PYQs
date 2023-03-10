

import java.util.Scanner;

/**
 * A class Palin has been defined to check whether a positive number is a Palindrome number or not. [10]
 * The number ‘N’ is palindrome if the original number and it’s reverse are the same.
 * Some of the members of the class are given below:
 * Class name: Palin
 * Data members/instance variables:
 * num: integer to store the number
 * revnum: integer to store the reverse of the number
 * Methods/Member functions:
 * Palin(): constructor to initialize data members with legal initial values
 * void accept(): to accept the number
 * int reverse(int y): reverses the parameterized argument ‘y’ and stores it in revenue using a recursive technique
 * void check(): checks whether the number is a Palindrome by invoking the function reverse() and display the result
 * with an appropriate message
 * Specify the class Palin giving the details of the constructor (), void accept(), int reverse(int) and void check().
 * Define the main() function to create an object and call the functions accordingly to enable the task.
 */

class Palin{
    int num,revnum;
    int nn;
    Palin(){
        num=0;revnum=0;
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();
    }
    int reverse(int y) {
        if (y == 0) {
            return revnum;
        }
        revnum = revnum * 10 + y % 10;
        return reverse(y / 10);
    }
    void check() {
        int temp = num;
        reverse(temp);
        if (num == revnum) {
            System.out.println(num + " is a Palindrome number.");
        } else {
            System.out.println(num + " is not a Palindrome number.");
        }
    }
    public static void main(String[] args) {
        Palin ob = new Palin();
        ob.accept();
        ob.check();
    }
}