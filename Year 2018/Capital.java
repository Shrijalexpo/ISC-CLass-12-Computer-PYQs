import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * A class Capital has been defined to check whether a sentence has words beginning with a capital letter or not. [10]
 * Some of the members of the class are given below:
 * Class name: Capital
 * Data member/instance variable:
 * sent: to store a sentence
 * freq: stores the frequency of words beginning with a capital letter
 * Member functions/methods:
 * Capital () : default constructor
 * void input (): to accept the sentence
 *
 * boolean isCap(String w): checks and returns true if the word begins with a capital letter, otherwise returns false
 * void display(): displays the sentence along with the frequency of the words beginning with a capital letter
 *
 *
 * Specify the class Capital, giving the details of the constructor( ), void input( ), boolean isCap(String) and void
 * display( ). Define the main( ) function to create an object and call the functions accordingly to enable the task.
 *
 */
class Capital{
    String sent;
    int freq;
    String[] arr;
    Capital(){
        freq = 0;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        sent = sc.nextLine();
        StringTokenizer st = new StringTokenizer(sent," ");
        arr = new String[st.countTokens()];
        int count=0;
        while (st.hasMoreTokens()){
            arr[count++] = st.nextToken();
        }
        for (int i = 0; i < arr.length; i++) {
            if (isCap(arr[i])){
                freq++;
            }
        }
    }

    void display(){
        System.out.println("The Sentence:\n" + sent + "\nFrequency of word strating with capital letter: "+ freq);
    }

    boolean isCap(String w){
        if(Character.isUpperCase(w.charAt(0))){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Capital ob = new Capital();
        ob.input();
        ob.display();
    }
}
