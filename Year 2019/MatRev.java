import java.util.Scanner;

class MatRev {
    int[][] arr;
    int m, n;

    public MatRev(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    public void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return rev;
    }

    public void revMat(MatRev P) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = P.reverse(P.arr[i][j]);
            }
        }
    }

    public void show() {
        System.out.println("The reversed matrix is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        MatRev A = new MatRev(m, n);
        A.fillarray();

        MatRev B = new MatRev(m, n);
        B.revMat(A);

        B.show();
    }
}

