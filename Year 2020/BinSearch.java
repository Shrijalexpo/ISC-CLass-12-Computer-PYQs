/**
 * Design a class BinSearch to search for a particular value in an array.
 */
import java.util.Scanner;
class BinSearch{
    int n;
    int[] arr;
    static Scanner sc = new Scanner(System.in);
    BinSearch(int nn){
        n = nn;
        arr = new int[n];
    }
    int bin_search(int l, int u,int v){
        int mid = (l + u)/2;
        if(l > u){
            return -1;
        }
        else{
            if (v == arr[mid]){
                return 1;
            }
            else if (v <= arr[mid]){
                return bin_search(l, mid - 1, v);
            }
            else {
                return bin_search(mid + 1, u, v);
            }
        }
    }
    void fill_array(){
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void sort(){
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        BinSearch ob = new BinSearch(sc.nextInt());
        ob.fill_array();
        ob.sort();
        System.out.println("Enter number to search");
        if (ob.bin_search(0, ob.n - 1, sc.nextInt()) == -1){
            System.out.println("Number not found");
            System.exit(0);
        }
        System.out.println("Number found!! Yay!");
    }
}