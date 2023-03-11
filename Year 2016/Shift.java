import java.util.Scanner;

/**
 * A class Shift contains a two-dimensional integer array of order (m×n) where the maximum values of both m and n
 * are 5. Design the class Shift to shuffle the matrix (i.e. the first row becomes the last, the second row becomes
 * the first and so on). The details of the members of the class are given below: [10]
 * Class name: Shift
 * Data member/instance variable:
 * mat[][]: stores the array element
 * m: integer to store the number of rows
 * n: integer to store the number of columns
 * Member functions/methods:
 * Shift(int mm, int nn): parameterized constructor to initialize the data members m=mm and n=nn
 * void input(): enters the elements of the array
 * void cyclic(Shift p): enables the matrix of the object (P) to shift each row upwards in a cyclic manner and
 * store the resultant matrix in the current object
 * void display(): displays the matrix elements
 * Specify the class Shift giving details of the constructor(), void input(), void cyclic(Shift) and void
 * display(). Define the main() function to create an object and call the methods accordingly to enable the task of
 * shifting the array elements.
 */

class Shift{
    int[][] mat, out;
    int m, n;
    static Scanner sc = new Scanner(System.in);
    Shift(int mm,int nn){
        m = mm;
        n = nn;
        mat = new int[m][n];
        out = new int[m][n];
    }
    void input(){
        System.out.println("Enter the matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }
    void cyclic(){
        for(int i = 1; i < m; i ++){
            for (int j = 0; j < n; j++) {
                out[i-1][j] = mat[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            out[n - 1][i] = mat[0][i];
        }
    }
    void display(){
        System.out.println("Shifted Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(out[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter m and n");
        Shift ob = new Shift(sc.nextInt(),sc.nextInt());
        ob.input();
        ob.cyclic();
        ob.display();
    }
}