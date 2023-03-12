/**
 * A class Admission contains the admission numbers of 100 students. Some of the data members/member functions
 * are given below: [10]
 * Class name: Admission
 * Data member/instance variable:
 * Adno[]: integer array to store admission numbers
 * Member functions/methods:
 * Admission(): constructor to initialize the array elements
 * void fill Array(): to accept the elements of the array in ascending order
 * int binSearch(int l, int u, int v): to search for a particular admission number (v) using binary search
 * and recursive technique and returns 1 if found otherwise returns -1
 * Specify the class Admission giving details of the constructor, void fill Array() and int binSearch(int, int, int).
 * Define the main() function to create an object and call the functions accordingly to enable the task.
 */
import java.util.Scanner;

class Admission{
    static Scanner sc = new Scanner(System.in);
    int[] Adno;
    Admission(){
        Adno = new int[100];
    }
    void fillAray(){
        System.out.println("Enter admissions Numbers");
        for (int i = 0; i < 100; i++) {
            Adno[i] = sc.nextInt();
        }
    }
    int binSearch(int l, int u, int v) {
        int temp = (l + u) / 2;

        if (l > u || l >= Adno.length) {
            return -1;
        }
        else if (v == Adno[temp]) {
            return 1;
        }
        else if (v > Adno[temp]) {
            return binSearch(temp + 1, u, v);
        }
        else {
            return binSearch(l, temp - 1, v);
        }
    }
    public static void main(String[] args) {
        Admission ob = new Admission();
        ob.fillAray();
        System.out.println("Enter admission number to be searched.");
        if (ob.binSearch(0, 99, sc.nextInt()) == 1) {
            System.out.println("Number found!");
            System.exit(0);
        }
        System.out.println("Number not found");
    }
}
