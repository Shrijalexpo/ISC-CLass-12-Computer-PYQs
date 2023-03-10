
/**
 * Two matrices are said to be equal if they have the same dimension and their corresponding elements are equal.
 * For example, the two matrices A and B is given below are equal:
 *
 * Design a class EqMat to check if two matrices are equal or not. Assume that the two matrices have the same dimension.
 * Some of the members of the class are given below :
 * Class name: EqMat
 * Data members/instance variables:
 * a[][] : to store integer elements
 * m: to store the number of rows
 * n: to store the number of columns
 * Member functions/methods:
 * EqMat: parameterized constructor to initialise the data members m = mm and n = nn
 * void readArray(): to enter elements in the array
 * int check(EqMat P, EqMat Q): checks if the parameterized objects P and Q are equal and returns 1 if true,
 * otherwise returns 0
 * void print(): displays the array elements
 * Define the class EqMat giving details of the constructor ), void readarray( ), int check(EqMat, EqMat) and
 * void print( ). Define the main( ) function to create objects and call the functions accordingly to enable the task.
 */

import java.util.Scanner;

class EqMat {
    private int[][] a;
    private int m;
    private int n;

    public EqMat(int mm, int nn) {
        m = mm;
        n = nn;
        a = new int[m][n];
    }

    public void readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public int check(EqMat P, EqMat Q) {
        int flag = 1;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(P.a[i][j] != Q.a[i][j]) {
                    flag = 0;
                    break;
                }
            }
        }
        return flag;
    }

    public void print() {
        System.out.println("The elements of the matrix are:");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrices: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns in the matrices: ");
        int n = sc.nextInt();
        EqMat P = new EqMat(m, n);
        EqMat Q = new EqMat(m, n);
        System.out.println("Enter the elements of the first matrix:");
        P.readArray();
        System.out.println("Enter the elements of the second matrix:");
        Q.readArray();
        int result = P.check(P, Q);
        if(result == 1) {
            System.out.println("The two matrices are equal.");
        } else {
            System.out.println("The two matrices are not equal.");
        }
    }
}

