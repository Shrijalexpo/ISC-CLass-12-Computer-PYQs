import java.util.Scanner;

/**
 * A disarium number is a number in which the sum of the digits to the power of their respective position
 * is equal to the number itself. [10]
 * Example: 135 = 1^1 + 3^2 + 5^3
 * Hence, 135 is a disarium number.
 * Design a class Disarium to check if a given number is a disarium number or not. Some of the members of
 * the class are given below:
 * Class name: Disarium
 * Data members/instance variables:
 * int num: stores the number
 * int size: stores the size of the number
 * Methods/Member functions:
 * Disarium (int nn): parameterized constructor to initialize the data members n = nn and size = 0
 * void countDigit(): counts the total number of digits and assigns it to size
 * int sumofDigits (int n, int p): returns the sum of the digits of the number(n) to the power of their respective
 * positions (p) using recursive technique
 * void check(): checks whether the number is a disarium number and displays the result with an appropriate message
 * Specify the class Disarium giving the details of the constructor! ), void countDigit(), int sumofDigits(int, int)
 * and void check(). Define the mainO function to create an object and call the functions accordingly to enable
 * the task.
 */

class Disarium{
    int num, size;
    int sum;    Disarium(int nn){
        num = nn;
    }

    void countDigit(){
        size = (String.valueOf(num)).length();
    }

    int sumofDigits (int n, int p){
        if(p == 0){
            return sum;
        }
        else{
            sum += (int)(Math.pow(n%10, p));
            return sumofDigits(n/10, p - 1);
        }
    }

    void check(){
        if(sumofDigits(num,size) == num){
            System.out.println(num+" is a disarium number");
        }
        else{
            System.out.println(num+" is not a disarium number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be checked: ");
        Disarium ob = new Disarium(sc.nextInt());
        ob.countDigit();
        ob.check();
    }
}