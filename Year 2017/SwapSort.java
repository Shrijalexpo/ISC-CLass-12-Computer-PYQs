/**
 * A class SwapSort has been defined to perform string related operations on a word input. Some of the members
 * of the class are as follows: [10]
 * Class name: SwapSort
 * Data members/instance variables:
 * wrd: to store a word
 * len: integer to store the length of the word
 * swapwrd: to store the swapped word
 * sortwrd: to store the sorted word
 * Member functions/methods:
 * SwapSort(): default constructor to initialize data members with legal initial values
 * void readword(): to accept a word in UPPER CASE
 * void swapchar(): to interchange/swap the first and last characters of the word in ‘wrd’ and stores the new word in
 * ‘swapwrd’
 * void sortword(): sorts the characters of the original word in alphabetical order and stores it in ‘sortwrd’
 * void display(): displays the original word, swapped word and the sorted word
 * Specify the class SwapSort, giving the details of the constructor(), void readword(), void swapchar(),
 * void sortword() and void display(). Define the main() function to create an object and call the functions accordingly to enable the task.
 */
import java.util.Scanner;
class SwapSort{
    String wrd,swapwrd,sortwrd;
    int len;

    SwapSort(){
        wrd = "";
        sortwrd = "";
        swapwrd = "";
        len = 0;
    }

    void readword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        wrd = sc.next().toUpperCase();
        len = wrd.length();
    }

    void swapchar(){
        swapwrd = wrd.charAt(len-1) + wrd.substring(1,len-1) + wrd.charAt(0);
    }

    void sortword(){
        char temp;
        char[] ch = new char[len];
        for (int i = 0; i < len; i++) {
            ch[i] = wrd.charAt(i);
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i-1; j++) {
                if(ch[j] > ch[j + 1]){
                    temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            sortwrd += ch[i];
        }
    }

    void display(){
        System.out.println("Original Word: "+ wrd + "\nSwapped word: "+swapwrd + "\nSorted Word: "+sortwrd);
    }

    public static void main(String[] args) {
        SwapSort ob = new SwapSort();
        ob.readword();
        ob.swapchar();
        ob.sortword();
        ob.display();
    }
}