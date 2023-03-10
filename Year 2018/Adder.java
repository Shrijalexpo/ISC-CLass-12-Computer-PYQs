

import java.util.Scanner;

/**
 * A class Adder has been defined to add any two accepted time.
 * Example:
 * Time A – 6 hours 35 minutes
 * Time B – 7 hours 45 minutes
 * Their sum is – 14 hours 20 minutes (where 60 minutes = 1 hour)
 * The details of the members of the class are given below:
 * Class name: Adder
 * Data member/instance variable:
 * a[ ]: integer array to hold two elements (hours and minutes)
 * Member functions/methods:
 * Adder (): constructor to assign 0 to the array elements awa
 * void readtime (): to enter the elements of the array
 * void addtime (Adder X, Adder Y): adds the time of the two parameterized objects X and Y and stores the sum in
 * the current calling object
 * void disptime(): displays the array elements with an appropriate mesage (i.e., hours= and minutes=)
 * Specify the class Adder giving details of the constructor( ), void readtime( ), void addtime(Adder, Adder) and
 * void disptime(). Define the main() function to create objects and call the functions accordingly to enable the task.
 */

class Adder{

    int[] a;
    Adder(){
        a = new int[2];
    }
    void readtime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hour:");
        a[0] = sc.nextInt();
        System.out.println("Enter Minute:");
        a[1] = sc.nextInt();
    }

    void addtime(Adder X, Adder Y){
        int hour1 = X.a[0];
        int min1 = X.a[1];
        int hour2 = Y.a[0];
        int min2 = Y.a[1];
        int hourSum = hour1 + hour2;
        int minSum = min1 + min2;
        a[0] = hourSum + (minSum/60);
        a[1] = minSum%60;
    }

    void disptime(){
        System.out.println("Their sum is-");
        System.out.println("hours = " + a[0] +" minutes =" + a[1]);
    }
    public static void main(String[] args) {
        Adder X = new Adder();
        System.out.println("Enter first time: ");
        X.readtime();
        Adder Y = new Adder();
        System.out.println("Enter second time: ");
        Y.readtime();
        Adder ob = new Adder();
        ob.addtime(X,Y);
        ob.disptime();
    }
}



