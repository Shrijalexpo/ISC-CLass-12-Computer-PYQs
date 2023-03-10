/**
 * Design a class ArmNum to check if a given number is an Armstrong number or not.
 * [A number is said to be Armstrong if sum of its digits raised to the power of length of the number is equal to the number] [10]
 * Example:
 * 371 = 3^3 + 7^3 + 1^3
 * 1634 = 14 + 64 + 34 + 44
 * 54748 = 55 + 45 + 75 + 45 + 85
 * Thus, 371, 1634 and 54748 are all examples of Armstrong numbers.
 * Some of the members of the class are given below:
 * Class name: ArmNum
 * Data members/instance variables:
 * n: to store the number
 * l: to store the length of the number
 * Methods/Member functions:
 * $ ArmNum (int nn): parameterized constructor to initialize the data member n = nn
 * $ int sum_pow(int i): returns the sum of each digit raised to the power of the length of the number using recursive technique
 * eg., 34 will return 32 + 42 (as the length of the number is 2)
 * $ void isArmstrong(): checks whether the given number is an Armstrong number by invoking the function sum_pow () and
 * displays the result with an appropriate message.
 * Specify the class ArmNum giving details of the constructor( ), int sum_pow(int) and void isArmstrong( ).
 * $ Define a main() function to create an object and call the functions accordingly to enable the task.
 */
import java.util.Scanner;
public class ArmNum {
    static int n, l;
    int sum;
    static Scanner sc = new Scanner(System.in);
    ArmNum(int nn){
        n = nn;
    }

    int sum_pow(int i){
        if((String.valueOf(i)).length() == 1){
            sum += Math.pow(i, l);
            return sum;
        }
        else {
            int digit = i % 10;
            i /= 10;
            sum += Math.pow(digit, l);
            return sum_pow(i);
        }
    }

    void isArmstrong(){
        if(sum_pow(n) == n){
            System.out.println("Number is an Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong NUmber");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Number to checked: ");
        int num = sc.nextInt();
        l = (String.valueOf(num)).length();
        ArmNum ob = new ArmNum(num);
        ob.isArmstrong();
    }
}
